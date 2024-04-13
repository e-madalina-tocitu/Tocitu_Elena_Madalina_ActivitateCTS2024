package SimpleFactory.clase;

public class Vita extends Supa{
    protected Vita(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Supa comandata de client este de vita si se numeste  "+getDenumire()+" are pretul de "+getPret());

    }
}
