package SimpleFactory.clase;

public class Legume extends Supa{
    protected Legume(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Supa comandata de client este de legume si se numese "+getDenumire()+" are pretul de "+getPret());

    }
}
