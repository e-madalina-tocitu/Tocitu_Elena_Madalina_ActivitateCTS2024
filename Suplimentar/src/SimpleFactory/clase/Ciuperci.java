package SimpleFactory.clase;

public class Ciuperci extends Supa {
    protected Ciuperci(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Supa comandata de client este de Ciuperci si se numeste "+getDenumire()+" are pretul de "+getPret());
    }
}
