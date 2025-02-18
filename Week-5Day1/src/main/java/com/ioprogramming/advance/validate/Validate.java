package com.ioprogramming.advance.validate;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Validate {
    public static void readValid(String path){
        try{
            CSVReader reader = new CSVReader(new FileReader(path));
            String[] records;
            while((records=reader.readNext())!=null){
                if(records[1].matches("^[A-Za-z]+$")&&records[4].matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
                    System.out.println(" | "+records[0]+" | "+records[1]+" | "+records[2]+" | "+records[3]+" | "+records[4]);
                }
                else{
                    System.out.println("Entered name or mail is not in right formate!");
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
