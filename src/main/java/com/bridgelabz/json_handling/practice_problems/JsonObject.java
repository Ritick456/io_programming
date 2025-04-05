package com.bridgelabz.json_handling.practice_problems;
import org.json.JSONArray;
import org.json.JSONObject;


public class JsonObject {

    public static void main(String[] args) {

        JSONObject student = new JSONObject();

        student.put("name" , "Ritick");
        student.put("age" , 22);

        JSONArray subject = new JSONArray();

        subject.put("Maths");
        subject.put("Science");

        student.put("subjects" , subject);

        System.out.println(student);

    }

}
