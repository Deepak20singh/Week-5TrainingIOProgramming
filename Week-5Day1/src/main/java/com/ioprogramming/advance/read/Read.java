package com.ioprogramming.advance.read;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void readCSVInChunks(String filePath, int chunkSize) {
        int totalRecords = 0;
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] record;
            int batchCount = 0;

            while ((record = reader.readNext()) != null) {
                totalRecords++;
                batchCount++;

                System.out.println("Processing: " + record[0]);

                if (batchCount == chunkSize) {
                    System.out.println("Processed " + totalRecords + " records so far...");
                    batchCount = 0;
                }
            }

            System.out.println("Finished processing " + totalRecords + " records.");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
