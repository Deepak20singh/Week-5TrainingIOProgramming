package com.ioprogramming.jsondata.handonpracticeproblems.listintojsonarray;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ioprogramming.jsondata.practiceproblems.javaobject.Car;
import org.json.JSONArray;

import java.io.IOException;
import java.util.List;

public class ListToArray {
    public static JSONArray arrayObject(List<Car> car) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String jsonString = objectMapper.writeValueAsString(car);

        JSONArray ans = new JSONArray(jsonString);
        return ans;

    }
}
