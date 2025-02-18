package com.ioprogramming.basic.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void read(String path){
        try{
            BufferedReader br=new BufferedReader(new FileReader(path));
            String line;
            br.readLine();
            String[] element;
            System.out.println("+----------------------------------+");
            System.out.println("|  Id  |  Name  |  Age  |  Marks  |");
            System.out.println("+----------------------------------+");

            while((line= br.readLine())!=null){
                element=line.split(",");
                System.out.println("  |" +element[0]+"  |  "+element[1]+"  |  "+element[2]+"  |   "+element[3]+"  |");
                System.out.println("+----------------------------------+");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
