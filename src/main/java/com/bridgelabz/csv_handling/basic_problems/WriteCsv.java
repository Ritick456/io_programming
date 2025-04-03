package com.bridgelabz.csv_handling.basic_problems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsv {

    public static void main(String[] args) {

        String filePath = "employee.csv";

        String[][] employees = {
                {"1", "John Doe", "HR", "50000"},
                {"2", "Alice Smith", "IT", "70000"},
                {"3", "Bob Johnson", "Finance", "60000"},
                {"4", "Emma White", "Marketing", "55000"},
                {"5", "David Brown", "Sales", "48000"}
        };

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){

            writer.write("ID , Name , Department , Salary");

            writer.newLine();

            for(String[] emp : employees){
                writer.write(String.join("," , emp));
                writer.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
