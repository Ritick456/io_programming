package com.bridgelabz.json_handling.practice_problems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJson {

    public static void main(String[] args) throws JsonProcessingException {

        String json = """
            [
              {"name": "Alice", "age": 22},
              {"name": "Bob", "age": 30},
              {"name": "Charlie", "age": 27}
            ]
        """;


        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode rootNode = objectMapper.readTree(json);

        if(rootNode.isArray()){

            for(JsonNode node : rootNode){
                int age = node.get("age").asInt();
                if(age > 25){
                    System.out.println(node.toString());
                }
            }

        }



    }
}
