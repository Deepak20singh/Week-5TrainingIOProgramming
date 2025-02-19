package com.ioprogramming.jsondata.practiceproblems.validatejson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ValidateMain {
    public static void main(String[] args) {
        String path="src/main/java/com/ioprogramming/jsondata/practiceproblems/validatejson/data.json";
        try{
            ObjectMapper mapper=new ObjectMapper();
            JsonNode jsonNode= mapper.readTree(new File(path));
            System.out.println("File is valid");
        } catch (IOException e) {
            System.out.println("File is Invalid");;
        }
    }
}
