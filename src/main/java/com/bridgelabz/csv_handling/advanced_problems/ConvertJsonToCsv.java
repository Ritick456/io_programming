package com.bridgelabz.csv_handling.advanced_problems;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



class Studento {
    @JsonProperty("Name")
    private String name;
    @JsonProperty("age")
    private int age;
    @JsonProperty("id")
    private int id;

    public Studento() {
    }

    public Studento(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}

public class ConvertJsonToCsv {

    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Studento studento = objectMapper.readValue(new File("studentjson.json"), Studento.class);

            String writeCsv = "jsonWrite.csv";
            BufferedWriter writer = new BufferedWriter(new FileWriter(writeCsv));

            // Writing header
            writer.write("Name,Age,ID\n");
            // Writing student data
            writer.write(studento.getName() + "," + studento.getAge() + "," + studento.getId() + "\n");

            writer.close();

            System.out.println("JSON converted to CSV successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
