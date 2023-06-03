package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;
public class Person {

    private final UUID id;

    private final String name;
    @NotBlank // 1:00:05
    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name) {
        this.name = name;
        this.id = id;
    }

    public UUID getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}
