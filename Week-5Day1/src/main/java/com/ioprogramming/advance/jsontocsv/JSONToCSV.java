package com.ioprogramming.advance.jsontocsv;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.*;

public class JSONToCSV {

    public static void jsonToCsv(String jsonFilePath, String csvFilePath) {
        try (
                BufferedReader br = new BufferedReader(new FileReader(jsonFilePath));
                CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))
        ) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                jsonContent.append(line);
            }


              String jsonText = jsonContent.toString().trim();
            JSONArray jsonArray;

            if (jsonText.startsWith("{")) {
                JSONObject jsonObject = new JSONObject(jsonText);
                jsonArray = new JSONArray();
                jsonArray.put(jsonObject);
            } else {
                jsonArray = new JSONArray(jsonText);
            }

            if (jsonArray.length() == 0) {
                System.out.println("JSON file is empty.");
                return;
            }

            JSONObject firstObject = jsonArray.getJSONObject(0);
            Set<String> keys = firstObject.keySet();
            String[] headers = keys.toArray(new String[0]);
            writer.writeNext(headers);


            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                String[] row = new String[headers.length];

                for (int j = 0; j < headers.length; j++) {
                    row[j] = obj.optString(headers[j], "");
                }
                writer.writeNext(row);
            }

            System.out.println("CSV file successfully written");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Convert CSV to JSON
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
