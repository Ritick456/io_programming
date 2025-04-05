package com.bridgelabz.csv_handling.basic_problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsv {

    public static void main(String[] args) {

        String filePath = "student.csv";

        String line;

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            reader.readLine();

            while( (line = reader.readLine()) != null ){
                String[] fields = line.split(",");

                System.out.println(fields[0] + " " + fields[1] + " " + fields[2]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
