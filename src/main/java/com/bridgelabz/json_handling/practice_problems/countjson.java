package com.bridgelabz.json_handling.practice_problems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class countjson {
    public static void main(String[] args) {

        String filepath = "jsonfield.json";

        try{

            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode noderoot = objectMapper.readTree(new File(filepath));

            System.out.println(noderoot);

            String name = noderoot.get("name").asText();
            String email = noderoot.get("email").asText();

            System.out.println(name + " " + email);


        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
