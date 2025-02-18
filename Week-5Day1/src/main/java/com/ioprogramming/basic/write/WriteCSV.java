package com.ioprogramming.basic.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void write(String path){
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter(path));
            bw.write("ID, Name, Department, Salary\n");
            bw.write("101, Dev, Manager, 100000\n");
            bw.write("102, Aditya, Engineer, 15000\n");
            bw.write("103, Deepak, Manager, 25000\n");
 bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
