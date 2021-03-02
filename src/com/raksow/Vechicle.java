package com.raksow;

public class Vechicle
{
    String model;
    Engine engine;
    Color color;
    Size size;

    public Vechicle(String model, Engine silnik, Color kolor, Size rozmiar)
    {
        this.model = model;
        this.engine = silnik;
        this.color = kolor;
        this.size = rozmiar;
    }

    @Override
    public String toString()
    {
        return model+ " jest " +size.rozmiar+ ", ma silnik " + engine.silnik+ " i jest koloru " +color.kolor;
    }
}
