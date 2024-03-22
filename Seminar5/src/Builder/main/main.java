package Builder.main;

import Builder.Rezervare;
import Builder.RezervareBuilder;

public class main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder=new RezervareBuilder();
        Rezervare rezervare=rezervareBuilder.adaugaMancare().build();
        Rezervare rezervare2=rezervareBuilder.adaugaMuzica().adaugaGenMuzical("POP").build();
        System.out.println(rezervare);
        System.out.println(rezervare2);

    }
}
