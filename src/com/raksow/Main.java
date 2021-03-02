package com.raksow;

public class Main
{
    public static void main(String[] args)
    {
        Vechicle Audi = new Vechicle("RS7", new Engine("V12"), new Color("Czarny"), new Size("Duzy"));

        System.out.println(Audi);
    }
}
