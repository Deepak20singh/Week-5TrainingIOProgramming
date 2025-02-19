package com.ioprogramming.jsondata.handonpracticeproblems.mergefilesintosingleobject;

import java.io.IOException;

import static com.ioprogramming.jsondata.handonpracticeproblems.mergefilesintosingleobject.MergeCode.merge;

public class MergeMain {
    public static void main(String[] args) throws IOException {
String path1="src/main/java/com/ioprogramming/jsondata/practiceproblems/mergeobject/data1.json";
String path2="src/main/java/com/ioprogramming/jsondata/practiceproblems/mergeobject/data2.json";
String path="src/main/java/com/ioprogramming/jsondata/practiceproblems/mergeobject/outputdata.json";
merge(path1,path2,path);
    }
}
