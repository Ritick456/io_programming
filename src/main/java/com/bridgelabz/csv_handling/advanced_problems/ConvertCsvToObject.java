package com.bridgelabz.csv_handling.advanced_problems;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student{

    public String id;
    public String name;
    public String age;

    Student(String id, String name, String age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
public class ConvertCsvToObject {

    public static void main(String[] args) {

        String filePath = "student.csv";
        List<Student> list = new ArrayList<>();
        String line;

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            reader.readLine();

            while( (line = reader.readLine()) != null ){

                String[] field = line.split(",");
                list.add(new Student(field[0] , field[1] , field[2]));
            }

            for(Student stu : list){
                System.out.println(stu.age + " " + stu.name + "  " + stu.id);
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }


    }


}
