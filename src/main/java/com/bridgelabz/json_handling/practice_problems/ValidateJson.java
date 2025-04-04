package com.bridgelabz.json_handling.practice_problems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.File;
import java.io.IOException;

public class ValidateJson {
    public static void main(String[] args) throws IOException, ProcessingException {


            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode schemaNode = objectMapper.readTree(new File("schema.json"));

        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema schema = factory.getJsonSchema(schemaNode);

        JsonNode dataNode = objectMapper.readTree(new File("person.json"));

        System.out.println(schema.validate(dataNode).isSuccess());


    }
}
