package com.java.creational.c4abstractfactory;

public class WindowsGraphicsFactory implements GraphicsFactory{
    @Override
    public Graphics newGraphics() {
        return new WindowsGraphics();
    }
}
