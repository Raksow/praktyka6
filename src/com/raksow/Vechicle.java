package com.raksow;

public class Vechicle
{
    String model;
    Engine silnik;
    Color kolor;
    Size rozmiar;

    public Vechicle(String model, Engine silnik, Color kolor, Size rozmiar)
    {
        this.model = model;
        this.silnik = silnik;
        this.kolor = kolor;
        this.rozmiar = rozmiar;
    }

    @Override
    public String toString()
    {
        return String.format(model+ " jest " +rozmiar+ ", ma silnik " +silnik+ " i jest koloru " +kolor);
    }
}
