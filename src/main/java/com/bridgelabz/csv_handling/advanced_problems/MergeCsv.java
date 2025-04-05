package com.bridgelabz.csv_handling.advanced_problems;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeCsv {

    public static void main(String[] args) {

        String student1 = "student.csv";
        String student2 = "student1.csv";

        String mergedFiles = "mergedstudent.csv";
        Map<String , String[]> map = new HashMap<>();
        String line;

        try(BufferedReader reader = new BufferedReader(new FileReader(student1))){

            reader.readLine();

            while( (line = reader.readLine()) != null ){
                String[] field =  line.split(",");

                map.put(field[0] , new String[]{field[1] , field[2]});
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader( new FileReader(student2))){

            reader.readLine();

            while( (line = reader.readLine()) != null){

                String[] field = line.split(",");
                if(map.containsKey(field[0])){

                    String[] existingdata = map.get(field[0]);

                    map.put(field[0] , new String[]{existingdata[0] , existingdata[1] , field[1] , field[2]});
                }
            }

        }
        catch (IOException e){
            e.printStackTrace();

        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFiles))){

            writer.write("Id , Name , Age , Marks , Grade");
            writer.newLine();

            for(Map.Entry<String , String[]> entry : map.entrySet()){

                String key = entry.getKey();
                String[] value = entry.getValue();
                //System.out.println(value[0] );
                //String ans =
                writer.write( String.join("," , value));
                writer.newLine();
            }

        }
        catch (IOException e){
            e.printStackTrace();

        }





    }
}
