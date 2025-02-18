package com.ioprogramming.intermidate.search;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchCSV {
    public static void search(String path,String name){
        try{
            CSVReader reader=new CSVReader(new FileReader(path));
            String[] line;
            while((line= reader.readNext())!=null){
                if(line[1].equals(name)){
                    System.out.println("Department :- "+line[2]+" | Salary :- "+line[3]);
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
