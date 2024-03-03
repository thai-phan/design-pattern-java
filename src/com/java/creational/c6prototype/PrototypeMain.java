package com.java.creational.c6prototype;

import com.java.creational.c5builder.BuilderDocument;

public class PrototypeMain {

    public static void main(String[] args) {
        BuilderDocument builderDocument = BuilderDocument.builder()
                .title("title")
                .category("category")
                .build();
        BuilderDocument copy =  builderDocument.clone();
    }
}
