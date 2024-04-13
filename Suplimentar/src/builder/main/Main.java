package builder.main;

import builder.clase.AbstractBuilder;
import builder.clase.Buider;
import builder.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        Buider buider=new Buider();
        Pacient pacient=buider.vreaPapuci().vreaHalat().build();
        Buider buider1=new Buider();
        Pacient pacient1=buider1.vreaMicDejun().build();
        System.out.println(pacient);
        System.out.println(pacient1);
    }
}
