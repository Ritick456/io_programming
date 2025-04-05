package com.bridgelabz.csv_handling.intermediate_problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterRecord {

    public static void main(String[] args) {

        String filePath = "students.csv";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            reader.readLine();
            String line;
            while ( (line = reader.readLine()) != null ){
                String[] field = line.split(",");

                int studentMarks = Integer.parseInt(field[2]);

                if(studentMarks > 80){
                    System.out.println(field[0] + " " + field[1] + " " + field[2]);
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
