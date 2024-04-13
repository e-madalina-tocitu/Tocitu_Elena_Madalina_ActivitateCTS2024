package Proxy.src.main;

import Proxy.src.clase.AbstractAutobuz;
import Proxy.src.clase.Autobuz;
import Proxy.src.clase.AutobuzDeNoapte;
import Proxy.src.proxy.AutobuxProxy;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        AbstractAutobuz autobuz=new Autobuz(11,368,"Mihai");
        autobuz.opresteInStatie("Piata Romana");

        AbstractAutobuz autobuz1=new AutobuzDeNoapte(autobuz);
        autobuz1.opresteInStatie("Victoriei");

        AbstractAutobuz autobuz2=new Autobuz(0,365,"Matei");
        autobuz2.opresteInStatie("Aviatorilor");

        AbstractAutobuz autobuz3=new AutobuzDeNoapte(autobuz2);
        autobuz3.opresteInStatie("Dristor");

        AutobuxProxy autobuxProxy=new AutobuxProxy(autobuz1);
        autobuxProxy.adaugaStatie("Piata Romana");
        autobuxProxy.adaugaStatie("Piata Victoriei");
        autobuxProxy.adaugaStatie("Universitate");

        autobuxProxy.opresteInStatie("Universitate");


    }
}