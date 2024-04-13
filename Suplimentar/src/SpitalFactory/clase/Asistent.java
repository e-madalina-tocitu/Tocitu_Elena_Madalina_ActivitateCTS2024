package SpitalFactory.clase;


public class Asistent extends Personal {
   protected Asistent(String nume, String domeniu) {
        super(nume, domeniu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("nume "+ super.getNume()+" domeniu "+super.getDomeniu());
    }

}
