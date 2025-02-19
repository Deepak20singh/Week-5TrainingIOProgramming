package com.ioprogramming.jsondata.practiceproblems.javaobject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ObjectConversion {
    public static void objectConversion(String path, List<Car> car) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

          objectMapper.writeValue(new File(path),car);
          for(Car item:car){
              String ans=objectMapper.writeValueAsString(item);
              System.out.println(ans);
          }

    }
}
