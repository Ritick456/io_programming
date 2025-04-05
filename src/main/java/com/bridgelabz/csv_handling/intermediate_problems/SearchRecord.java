package com.bridgelabz.csv_handling.intermediate_problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchRecord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the employee : ");
        String empName = sc.nextLine();

        String filePath = "employee.csv";
        String line;

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            reader.readLine();

            while ( (line = reader.readLine()) != null){

                String[] field = line.split(",");

                if(field[1].equals(empName)){
                    System.out.println(field[2] + " " + field[3]);
                }
            }


        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
