package com.bridgelabz.json_handling.practice_problems;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

class Student{

    public String name;
    public  int age;
    public  int id;

    Student(String name, int id , int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

}
public class JavaObjectToJsonArray {

    public static void main(String[] args) throws JsonProcessingException {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Ritick" , 1 , 22));
        list.add(new Student("deepak" , 2 , 22));

        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.writeValueAsString(list);

        System.out.println(json);




    }

}
