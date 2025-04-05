package com.bridgelabz.csv_handling.advanced_problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DetectDuplicates {

    public static void main(String[] args) {

        String filePath = "student.csv";
        Map<String , String[]> map = new HashMap<>();
        String line;

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            reader.readLine();

            while( (line = reader.readLine()) != null ){

                String[] field = line.split(",");

               // System.out.println( field[0] + " " + field[1] + " " + field[2]);

                if(map.containsKey(field[0])){
                    System.out.println( field[0] + " " + field[1] + " " + field[2]);
                }
                else{
                    map.put(field[0] , new String[]{field[1] , field[2]});
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
