package com.bridgelabz.json_handling.practice_problems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

class Car{

    public String name;
    public int model;

    Car(String name , int model){
        this.name = name;
        this.model = model;
    }

}
public class JsonObjectToJson {

    public static void main(String[] args) throws JsonProcessingException {

        Car car = new Car("Toyota" , 2024);

        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.writeValueAsString(car);
        System.out.println(json);


    }
}
