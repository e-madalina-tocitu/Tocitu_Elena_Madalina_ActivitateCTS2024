package SimpleFactory.clase;

public abstract class Supa {

    private float pret;
    private String denumire;

    public float getPret() {
        return pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public Supa(float pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    public abstract void afisareDetalii();
}
