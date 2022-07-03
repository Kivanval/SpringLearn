package com.example.springlearn;


import lombok.Value;

@Value
public class Ingredient {

    String id;
    String name;
    Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}