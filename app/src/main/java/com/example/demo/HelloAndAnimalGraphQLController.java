package com.example.demo;

import com.example.animals.Animal;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloAndAnimalGraphQLController {
    @SchemaMapping(typeName = "Query")
    public String greeting() {
        return "hello";
    }

    @SchemaMapping(typeName = "Query")
    public Animal getAnimal(@Argument String name) {
        return new Animal().setName(name);
    }
}