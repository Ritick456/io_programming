package com.bridgelabz.csv_handling.intermediate_problems;

import java.io.*;

public class ModifyCsv {
    public static void main(String[] args) {

        String filepath = "employee.csv";
        String outputFilePath = "updated_Employee.csv";


        try(BufferedReader reader = new BufferedReader(new FileReader(filepath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))){

            String line;
            String str = reader.readLine();
            writer.write(str);
            writer.newLine();

            while( (line = reader.readLine()) != null ){

                String[] field = line.split(",");

                if(field[2].equals("IT")){
                    double salary = Double.parseDouble(field[3]) + Double.parseDouble(field[3]) * 10 / 100;
                    writer.write( String.join("," , field[0] , field[1] , field[2] , String.format("%.2f" ,salary)) );
                    writer.newLine();
                }
                else{
                    writer.write( String.join("," , field[0] , field[1] , field[2] , field[3]));
                    writer.newLine();

                }

            }


        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
