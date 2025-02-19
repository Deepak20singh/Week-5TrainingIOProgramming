package com.ioprogramming.jsondata.handonpracticeproblems.csvtojson;

import static com.ioprogramming.jsondata.handonpracticeproblems.csvtojson.CsvToJson.csvToJson;

public class CsvToJsonMain {
    public static void main(String[] args) {
        String path1="src/main/java/com/ioprogramming/jsondata/handonpracticeproblems/csvtojson/data.csv";
        String path2="src/main/java/com/ioprogramming/jsondata/handonpracticeproblems/csvtojson/data1.json";
        csvToJson(path1,path2);
    }
}
