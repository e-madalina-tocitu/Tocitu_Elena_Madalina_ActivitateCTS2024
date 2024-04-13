package SpitalFactory.clase;

public class Medic extends Personal{
    protected Medic(String nume, String domeniu) {
        super(nume, domeniu);
    }

    public void afisareDetalii() {
        System.out.println("nume "+ super.getNume()+" domeniu "+super.getDomeniu());
    }
}
