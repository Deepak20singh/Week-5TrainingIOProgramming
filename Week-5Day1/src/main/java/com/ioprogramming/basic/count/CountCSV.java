package com.ioprogramming.basic.count;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountCSV {
    public static void count(String path){
        try{
            BufferedReader br=new BufferedReader(new FileReader(path));
            int count=0;
            br.readLine();
            String line;
            while((line=br.readLine())!=null){
                count++;
            }
            System.out.println("The line in csv file :- "+count);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
