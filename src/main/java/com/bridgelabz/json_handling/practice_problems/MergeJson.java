package com.bridgelabz.json_handling.practice_problems;

import org.json.JSONObject;

public class MergeJson {
    public static void main(String[] args) {

        JSONObject json1 = new JSONObject();
        json1.put("name" , "Ritick");
        json1.put("age" , 22);

        JSONObject json2 = new JSONObject();

        json2.put("city" , "new york");
        json2.put("age" , 23);   // These age key will override the json1 age

        for(String key : json2.keySet()){
            json1.put(key , json2.get(key));
        }

        System.out.println(json1.toString());
    }
}
