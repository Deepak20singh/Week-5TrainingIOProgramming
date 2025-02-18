package com.ioprogramming.advance.read;

import static com.ioprogramming.advance.read.Read.readCSVInChunks;

public class ReadMain {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/ioprogramming/advance/read/data.csv";
        readCSVInChunks(filePath, 100);

    }
}
