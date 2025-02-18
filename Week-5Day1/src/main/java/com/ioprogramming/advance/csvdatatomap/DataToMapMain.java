package com.ioprogramming.advance.csvdatatomap;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class DataToMapMain {
    public static void main(String[] args) {
        String path="src/main/java/com/ioprogramming/advance/csvdatatomap/data.csv";
        try{
            FileReader fr=new FileReader(path);
            CsvToBean<DataToMap> csv=new CsvToBeanBuilder<DataToMap>(fr)
                    .withType(DataToMap.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<DataToMap> list=csv.parse();
            for(DataToMap data:list){
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
