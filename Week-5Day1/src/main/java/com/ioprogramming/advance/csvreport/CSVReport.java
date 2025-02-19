package com.ioprogramming.advance.csvreport;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVReport {
    public static void write(String path1,String path2){
        try{
            CSVReader reader=new CSVReader(new FileReader(path1));
            CSVWriter writer=new CSVWriter(new FileWriter(path2));
            String[] line;
            while((line=reader.readNext())!=null){
              writer.writeNext(line);
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
