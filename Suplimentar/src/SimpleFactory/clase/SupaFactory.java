package SimpleFactory.clase;

public class SupaFactory {
    public static Supa getSupa(TipSupa tip,float pret, String denumire){
        switch (tip){
            case VITA :
                return new Vita(pret,denumire);
            case LEGUME:
                return new Legume(pret,denumire);
            case CIUPERCI:
                return new Ciuperci(pret,denumire);
        }
        try {
            throw new Exception("Nu exista supa aleasa");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
