package com.ioprogramming.jsondata.practiceproblems.filter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Filter {
public static void filter(String path,int age) throws IOException {
    ObjectMapper object= new ObjectMapper();
    JsonNode jsonNodes=object.readTree(new File(path));
    if (!jsonNodes.isArray()) {
        System.out.println("Error: JSON file does not contain an array.");
        return;
    }
    for (JsonNode jsonNode : jsonNodes){
    if(jsonNode.get("age").asInt() > age) {
        System.out.println("id :- " + jsonNode.get("id").asText());
        System.out.println("name :- " + jsonNode.get("name").asText());
        System.out.println("age :- " + jsonNode.get("age").asInt());
        System.out.println("city :- " + jsonNode.get("city").asText());
        System.out.println("+------------------------------------------+");
    }

    }
}
}
