package SpitalFactory.main;

import SpitalFactory.clase.Personal;
import SpitalFactory.clase.PersonalFactory;
import SpitalFactory.clase.TipPersonal;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Personal personal=PersonalFactory.getPersonal(TipPersonal.MEDIC,"Ionut","Chirurgie");
        System.out.println(personal);
    }


}
