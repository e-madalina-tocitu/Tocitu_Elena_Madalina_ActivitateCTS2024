package SpitalFactory.clase;

public class Brancardier extends Personal{
    protected Brancardier(String nume, String domeniu) {
        super(nume, domeniu);
    }

    public void afisareDetalii() {
        System.out.println("nume "+ super.getNume()+" domeniu "+super.getDomeniu());
    }
}
