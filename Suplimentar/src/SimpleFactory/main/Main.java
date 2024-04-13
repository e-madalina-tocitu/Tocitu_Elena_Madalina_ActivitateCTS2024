package SimpleFactory.main;

import SimpleFactory.clase.Supa;
import SimpleFactory.clase.SupaFactory;
import SimpleFactory.clase.TipSupa;

public class Main {
    public static void main(String[] args) {
        Supa supa1=SupaFactory.getSupa(TipSupa.CIUPERCI,23,"Ciupercileta");
        supa1.afisareDetalii();
        Supa supa2=SupaFactory.getSupa(TipSupa.VITA,20,"Vituta ");
        supa2.afisareDetalii();
    }
}
