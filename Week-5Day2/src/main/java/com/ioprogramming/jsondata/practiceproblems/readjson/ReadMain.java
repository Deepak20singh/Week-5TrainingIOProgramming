package com.ioprogramming.jsondata.practiceproblems.readjson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadMain {
    public static void main(String[] args) throws IOException {
        String path="src/main/java/com/ioprogramming/jsondata/practiceproblems/readjson/data.json";
        ObjectMapper objectMapper=new ObjectMapper();

        JsonNode jsonNode=objectMapper.readTree(new File(path));
        for(JsonNode node:jsonNode) {
            String name = node.get("name").asText();
            String email = node.get("email").asText();
            System.out.println("Name :- "+name+"\n Email := "+email);
        }

    }
}
