package com.ioprogramming.advance.jsontocsv;

import static com.ioprogramming.advance.jsontocsv.JSONToCSV.csvToJson;
import static com.ioprogramming.advance.jsontocsv.JSONToCSV.jsonToCsv;

public class JSONToCSVMain {
    public static void main(String[] args) {
        String path="src/main/java/com/ioprogramming/advance/jsontocsv/Data1.csv";

        String path1="src/main/java/com/ioprogramming/advance/jsontocsv/data.csv";
        String path2="src/main/java/com/ioprogramming/advance/jsontocsv/dataJson.csv";
csvToJson(path1,path2);
jsonToCsv(path2,path);
    }
}
