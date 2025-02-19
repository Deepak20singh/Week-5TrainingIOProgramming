package com.ioprogramming.advance.csvreport;

import static com.ioprogramming.advance.csvreport.CSVReport.write;

public class CSVReportMain {
    public static void main(String[] args) {
String path1="src/main/java/com/ioprogramming/advance/csvreport/datainput.csv";
String path2="src/main/java/com/ioprogramming/advance/csvreport/dataoutput.csv";
        write(path1,path2);
    }
}
