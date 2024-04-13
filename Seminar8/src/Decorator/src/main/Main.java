package Decorator.src.main;

import Decorator.src.clase.Bilet;
import Decorator.src.clase.BiletAbstract;
import Decorator.src.decorator.BiletAniversareSTB;
import Decorator.src.decorator.BiletSarbatori;
import Decorator.src.decorator.Decorator;

public class Main {

    public static void main(String[] args) {
        BiletAbstract bilet=new Bilet(100,"aazz");
        prinatre(bilet);

        Decorator decorator=new BiletSarbatori(bilet);
        decorator.reducerePret();
       prinatre(decorator);

        Decorator decorator2=new BiletAniversareSTB(bilet);
        prinatre(decorator2);

        Decorator decorator3=new BiletAniversareSTB(decorator);
        prinatre(decorator3);
    }

    public static void prinatre(BiletAbstract bilet){
        bilet.printareBilet();
    }

}
