package com.ioprogramming.jsondata.handonpracticeproblems.convertjsontoxml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class JsonToXml {
    public static void result(String path) throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        File jsonFile = new File(path);
        JsonNode jsonNode = jsonMapper.readTree(jsonFile);

        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
        System.out.println(xml);

    }
}
