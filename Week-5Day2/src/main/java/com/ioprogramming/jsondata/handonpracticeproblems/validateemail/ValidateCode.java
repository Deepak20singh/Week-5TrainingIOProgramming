package com.ioprogramming.jsondata.handonpracticeproblems.validateemail;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ValidateCode {
    public static void validate(String schemaPath, String dataPath) {
        try {
            // Load JSON schema
            FileInputStream schemaStream = new FileInputStream(schemaPath);
            JSONObject jsonSchema = new JSONObject(new JSONTokener(schemaStream));
            Schema schema = SchemaLoader.load(jsonSchema);

            // Load JSON data
            FileInputStream dataStream = new FileInputStream(dataPath);
            JSONObject jsonData = new JSONObject(new JSONTokener(dataStream));

            // Validate JSON
            schema.validate(jsonData);
            System.out.println("JSON is valid!");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (org.everit.json.schema.ValidationException e) {
            System.out.println("JSON Validation Error: " + e.getMessage());
        }
    }
}
