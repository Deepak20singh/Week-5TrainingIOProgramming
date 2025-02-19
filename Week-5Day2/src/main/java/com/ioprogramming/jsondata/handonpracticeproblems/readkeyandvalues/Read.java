package com.ioprogramming.jsondata.handonpracticeproblems.readkeyandvalues;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Read {
    public static void read(String path) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        JsonNode jsonNode=mapper.readTree(new File(path));
        System.out.println(jsonNode);
    }
}
