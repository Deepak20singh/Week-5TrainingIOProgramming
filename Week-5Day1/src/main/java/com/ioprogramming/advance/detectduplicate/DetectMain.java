package com.ioprogramming.advance.detectduplicate;

import static com.ioprogramming.advance.detectduplicate.Detect.findDuplicates;

public class DetectMain {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/ioprogramming/advance/detectduplicate/data.csv";
        findDuplicates(filePath);

    }
}
