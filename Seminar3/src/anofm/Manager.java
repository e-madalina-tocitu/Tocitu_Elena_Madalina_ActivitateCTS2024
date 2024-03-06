package anofm;

public class Manager {
    private String numeFirma;
    private String numeManager;
    private float salariu;

    protected Manager(String numeFirma, String numeManager, float salariu) {
        this.numeFirma = numeFirma;
        this.numeManager = numeManager;
        this.salariu = salariu;
    }

    public void setNumeManager(String numeManager) {
        this.numeManager = numeManager;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "numeFirma='" + numeFirma + '\'' +
                ", numeManager='" + numeManager + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
