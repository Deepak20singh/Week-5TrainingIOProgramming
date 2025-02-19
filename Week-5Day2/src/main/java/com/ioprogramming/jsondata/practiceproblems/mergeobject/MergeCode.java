package com.ioprogramming.jsondata.practiceproblems.mergeobject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MergeCode {
    public static void merge(String path1,String path2,String path) throws IOException {
        ObjectMapper objectMapper1=new ObjectMapper();
        JsonNode jnode1=objectMapper1.readTree(new FileReader(path1));
        JsonNode jnode2=objectMapper1.readTree(new FileReader(path2));

        JsonNode merged=objectMapper1.createArrayNode().add(jnode1).add(jnode2);
        String mergedString=objectMapper1.writerWithDefaultPrettyPrinter().writeValueAsString(merged);
        System.out.println(mergedString);
        objectMapper1.writeValue(new File(path),mergedString);

    }
}
