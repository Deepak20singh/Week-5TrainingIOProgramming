package com.ioprogramming.jsondata.practiceproblems.jsonobject;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONObjectMain {
    public static void main(String[] args) {
        String[] subjects={"Maths","Physics"};

        JSONObject student = new JSONObject();
        student.put("Name :-","Dev");
        student.put("Class :-",21);
        student.put("Subjects :-",new JSONArray(subjects));
        System.out.println(student);

    }
}
