package com.ioprogramming.jsondata.handonpracticeproblems.convertjsontoxml;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

import static com.ioprogramming.jsondata.handonpracticeproblems.convertjsontoxml.JsonToXml.result;

public class JsonToXmlMain {
    public static void main(String[] args) throws IOException {
String path="src/main/java/com/ioprogramming/jsondata/handonpracticeproblems/convertjsontoxml/data.json";
        result(path);
    }
}
