package com.ioprogramming.jsondata.handonpracticeproblems.csvtojson;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvToJson {
    public static void csvToJson(String csvFilePath, String jsonFilePath) {
        try (
                CSVReader reader = new CSVReader(new FileReader(csvFilePath));
                FileWriter fileWriter = new FileWriter(jsonFilePath)
        ) {
            List<String[]> data = reader.readAll();
            if (data.isEmpty()) {
                System.out.println("CSV file is empty.");
                return;
            }

            String[] headers = data.get(0); // First row as headers
            JSONArray jsonArray = new JSONArray();

            for (int i = 1; i < data.size(); i++) {
                JSONObject jsonObject = new JSONObject();
                String[] row = data.get(i);

                for (int j = 0; j < headers.length; j++) {
                    jsonObject.put(headers[j], row[j]);
                }
                jsonArray.put(jsonObject);
            }

            fileWriter.write(jsonArray.toString(4));
            System.out.println("JSON file successfully written: " + jsonFilePath);

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
