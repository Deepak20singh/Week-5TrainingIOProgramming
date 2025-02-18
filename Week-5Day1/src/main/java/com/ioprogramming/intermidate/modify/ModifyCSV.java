package com.ioprogramming.intermidate.modify;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ModifyCSV {
    public static void modify(String path, String name) {
        List<String[]> records = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(path))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (line[1].equals(name)) {

                    int salary = Integer.parseInt(line[3]);
                    double newSalary = salary + salary * 0.01;
                    line[3] = String.valueOf((int) newSalary);
                    System.out.println("Department: " + line[2] + " | Salary: " + line[3]);

                }
                records.add(line);
            }
        } catch (IOException | CsvValidationException e) {
            System.out.println(e.getMessage());;
            return;
        }

        try (CSVWriter writer = new CSVWriter(new FileWriter(path))) {
            writer.writeAll(records);
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
