package com.ioprogramming.jsondata.handonpracticeproblems.readkeyandvalues;

import java.io.IOException;

import static com.ioprogramming.jsondata.handonpracticeproblems.readkeyandvalues.Read.read;

public class ReadMain {
    public static void main(String[] args) throws IOException {
        String path="src/main/java/com/ioprogramming/jsondata/handonpracticeproblems/readkeyandvalues/data.json";
        read(path);
    }
}
