package com.bridgelabz.csv_handling.intermediate_problems;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Employee {
    String id;
    String name;
    String department;
    double salary;

    public Employee(String id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

public class SortCsv {
    public static void main(String[] args) {
        String filePath = "employee.csv";
        List<Employee> list = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            records.remove(0); // Remove header

            for (String[] record : records) {
                list.add(new Employee(record[0], record[1], record[2], Double.parseDouble(record[3])));
            }

            list.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));

            System.out.println("Top 5 Highest-Paid Employees:");
            for (int i = 0; i < Math.min(5, list.size()); i++) {
                System.out.println(list.get(i));
            }

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}