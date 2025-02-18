package com.ioprogramming.advance.detectduplicate;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Detect {
    public static void findDuplicates(String filePath) {
        HashSet<String> seenIDs = new HashSet<>();
        HashSet<String> duplicateIDs = new HashSet<>();
        List<String[]> duplicateRecords = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] record;
            reader.readNext(); // Skip header

            while ((record = reader.readNext()) != null) {
                String id = record[0];

                if (seenIDs.contains(id)) {
                    duplicateIDs.add(id);
                    duplicateRecords.add(record);
                } else {
                    seenIDs.add(id);
                }
            }

            // Print duplicate records
            if (duplicateRecords.isEmpty()) {
                System.out.println("No duplicate records found.");
            } else {
                System.out.println("Duplicate Records Found:");
                for (String[] rec : duplicateRecords) {
                    System.out.println(Arrays.toString(rec));
                }
            }

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
