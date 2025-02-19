package com.ioprogramming.jsondata.practiceproblems.filter;

import java.io.IOException;

import static com.ioprogramming.jsondata.practiceproblems.filter.Filter.filter;

public class FilterMain {
    public static void main(String[] args) throws IOException {
String path="src/main/java/com/ioprogramming/jsondata/practiceproblems/filter/data.json";
        filter(path,25);
    }
}
