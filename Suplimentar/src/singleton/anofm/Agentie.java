package singleton.anofm;

public class Agentie {
    private String numeAgentie;
    private String numePachet;
    private int nrPachete;

    public Agentie(String numeAgentie, String numePachet, int nrPachete) {
        this.numeAgentie = numeAgentie;
        this.numePachet = numePachet;
        this.nrPachete = nrPachete;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public String getNumePachet() {
        return numePachet;
    }

    public void setNumePachet(String numePachet) {
        this.numePachet = numePachet;
    }

    public int getNrPachete() {
        return nrPachete;
    }

    public void setNrPachete(int nrPachete) {
        this.nrPachete = nrPachete;
    }

    @Override
    public String toString() {
        return "Agentie{" +
                "numeAgentie='" + numeAgentie + '\'' +
                ", numePachet='" + numePachet + '\'' +
                ", nrPachete=" + nrPachete +
                '}';
    }
}
