package com.ioprogramming.advance.merge;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void studentMap(String path1,String path2,String path){
        Map<String,String[]> map=new HashMap<>();
        try{
            CSVReader reader=new CSVReader(new FileReader(path1));
            String[] line;
            while ((line=reader.readNext())!=null) {
                map.put(line[0],line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try{
            CSVReader reader=new CSVReader(new FileReader(path2));
            String[] line;
            while ((line=reader.readNext())!=null) {
                if(map.containsKey(line[0])) {
                    String[] student=map.get(line[0]);
                    String[] merged=new String[]{
                     student[0],student[1],student[2],line[0],line[1]
                    };
                    map.put(line[0], merged);
                }else{
                    String[] mergedRecord = new String[]{
                            line[0], "Unknown", "Unknown", line[1], line[2] // Use default values
                    };
                    map.put(line[0], mergedRecord);  }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try{
            CSVWriter write=new CSVWriter(new FileWriter(path));
            write.writeNext(new String[]{"ID", "Name", "Age", "Marks", "Grade"});

            // Writing merged data
            for (Map.Entry<String, String[]> entry : map.entrySet()) {
                write.writeNext(entry.getValue());
            }
            write.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
