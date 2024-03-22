package main;

import clase.AbstractBuilder;
import clase.Rezervare;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AbstractBuilder abstractBuilder=new Rezervare.BuiderRezervare();
        Rezervare rezervare1=abstractBuilder.adaugaBautura().adaugaGenMuzical("jazz").build();
        Rezervare rezervare2=abstractBuilder.adaugaMancare().build();
        System.out.println(rezervare2);
        System.out.println(rezervare1);

    }
}