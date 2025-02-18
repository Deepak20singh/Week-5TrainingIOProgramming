package com.ioprogramming.advance.merge;

import static com.ioprogramming.advance.merge.Student.studentMap;

public class StudentMain {
    public static void main(String[] args) {
        String path="src/main/java/com/ioprogramming/advance/merge/data.csv";
        String path1="src/main/java/com/ioprogramming/advance/merge/data1.csv";
        String path2="src/main/java/com/ioprogramming/advance/merge/data2.csv";
        studentMap(path1, path2, path);

    }
}
