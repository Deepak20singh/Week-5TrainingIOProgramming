package com.ioprogramming.intermidate.filter;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilterCSV {
    public static void filter(String path){
        try{CSVReader reader=new CSVReader(new FileReader(path));
            String[] line;
            reader.readNext();
            while ((line= reader.readNext())!=null){
                int element=Integer.parseInt(line[3]);
                if(element>80){
                    System.out.println("Id :- "+line[0]+" | Name :- "+line[1]+" | Department :- "+line[2]+" | Salary :- "+line[3]);
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
