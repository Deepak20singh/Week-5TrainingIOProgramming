package com.ioprogramming.advance.encrypt;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.Base64;
import java.util.List;

public class EncryptAndDecrypt {

    public static String encode(String value) {
        return Base64.getEncoder().encodeToString(value.getBytes());
    }

    public static String decode(String encodedValue) {
        return new String(Base64.getDecoder().decode(encodedValue));
    }


     public static void writeEncodedCSV(String inputCsv, String encryptedCsv) {
        try (
                BufferedReader br = new BufferedReader(new FileReader(inputCsv));
                CSVReader reader = new CSVReader(br);
                CSVWriter writer = new CSVWriter(new FileWriter(encryptedCsv))
        ) {
            List<String[]> rows = reader.readAll();
            if (rows.isEmpty()) {
                System.out.println("CSV file is empty.");
                return;
            }

            writer.writeNext(rows.get(0)); // Write header

            for (int i = 1; i < rows.size(); i++) {
                String[] row = rows.get(i);
                row[2] = encode(row[2]); // Encode Email
                row[3] = encode(row[3]); // Encode Salary
                writer.writeNext(row);
            }

            System.out.println("Encoded CSV written: " + encryptedCsv);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public static void readDecodedCSV(String encryptedCsv, String decryptedCsv) {
        try (
                CSVReader reader = new CSVReader(new FileReader(encryptedCsv));
                CSVWriter writer = new CSVWriter(new FileWriter(decryptedCsv))
        ) {
            List<String[]> rows = reader.readAll();
            if (rows.isEmpty()) {
                System.out.println("CSV file is empty.");
                return;
            }

            writer.writeNext(rows.get(0)); // Write header

            for (int i = 1; i < rows.size(); i++) {
                String[] row = rows.get(i);
                row[2] = decode(row[2]); // Decode Email
                row[3] = decode(row[3]); // Decode Salary
                writer.writeNext(row);
            }

            System.out.println("Decoded CSV written: " + decryptedCsv);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
