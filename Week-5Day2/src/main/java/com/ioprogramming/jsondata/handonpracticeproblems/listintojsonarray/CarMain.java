package com.ioprogramming.jsondata.handonpracticeproblems.listintojsonarray;

import com.ioprogramming.jsondata.practiceproblems.javaobject.Car;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.ioprogramming.jsondata.handonpracticeproblems.listintojsonarray.ListToArray.arrayObject;

public class CarMain {
      public static void main(String[] args) throws IOException {
            String path="src/main/java/com/ioprogramming/jsondata/practiceproblems/javaobject/data.json";
          Car c1=new Car("Thar",1329);
          Car c2=new Car("Jaquar",1329);
          Car c3=new Car("Fortuner",1329);
          List<Car> car=new ArrayList<>(Arrays.asList(c1,c2,c3));
            System.out.println(arrayObject(car).getJSONObject(0));
        }
    }


