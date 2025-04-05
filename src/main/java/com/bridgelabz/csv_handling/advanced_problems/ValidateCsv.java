package com.bridgelabz.csv_handling.advanced_problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCsv {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static boolean Isvalid(String email , String phoneNo){

        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);

        return (matcher.matches() && phoneNo.length() == 10);

    }
    public static void main(String[] args) {

        String filePath = "validate.csv";
        String line;
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

       try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

           reader.readLine();

           while ((line = reader.readLine()) != null) {

               String[] field = line.split(",");

               if(!Isvalid(field[2] , field[3])){
                   System.out.println("Invalid data");
               }


           }
       }
       catch (IOException e){
           e.printStackTrace();
       }


    }
}
