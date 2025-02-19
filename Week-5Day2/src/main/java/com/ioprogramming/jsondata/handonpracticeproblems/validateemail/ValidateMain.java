package com.ioprogramming.jsondata.handonpracticeproblems.validateemail;

import static com.ioprogramming.jsondata.handonpracticeproblems.validateemail.ValidateCode.validate;

public class ValidateMain {
    public static void main(String[] args) {
        String path="src/main/java/com/ioprogramming/jsondata/handonpracticeproblems/validateemail/data.json";
        String path1="src/main/java/com/ioprogramming/jsondata/handonpracticeproblems/validateemail/email.json";

        validate(path1,path);
    }
}
