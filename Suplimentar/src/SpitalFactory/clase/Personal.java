package SpitalFactory.clase;

public abstract class  Personal {
    private String nume;
    private String domeniu;

    public Personal(String nume, String domeniu) {
        this.nume = nume;
        this.domeniu = domeniu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "nume='" + nume + '\'' +
                ", domeniu='" + domeniu + '\'' +
                '}';
    }

    public abstract void afisareDetalii();
}
