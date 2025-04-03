package com.bridgelabz.csv_handling.basic_problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCount {

    public static void main(String[] args) {

        String filePath = "student.csv";

        String line;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            //Read first line already so we can skip the header the file
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                count++;
            }
            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
