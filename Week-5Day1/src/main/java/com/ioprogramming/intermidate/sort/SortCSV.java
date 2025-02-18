package com.ioprogramming.intermidate.sort;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SortCSV {
    public static void sort(String path){
       List<String[]> list=new ArrayList<>();
       try{
           CSVReader reader=new CSVReader(new FileReader(path));
           String[] line;
           reader.readNext();
           while((line=reader.readNext())!=null){
               list.add(line);
           }

       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (CsvValidationException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       list.sort((a,b)->Double.compare(Double.parseDouble(b[3].trim()),Double.parseDouble(a[3].trim())));

       List<String[]> result=list.subList(0,Math.min(5,list.size()));
       for(String[] record:result){
           System.out.println(String.join(" | ", record));
       }
    }
}
