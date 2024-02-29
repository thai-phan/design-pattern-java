package com.java.creational.c4abstractfactory;


public class AbstractFactory {



    public static void main(String[] args) {
        final GraphicsFactory graphicsFactory = new GraphicsFactoryImpl();
        final Graphics graphics = graphicsFactory.newGraphics();

    }
}
