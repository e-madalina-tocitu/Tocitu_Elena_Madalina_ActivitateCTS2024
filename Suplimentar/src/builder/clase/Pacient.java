package builder.clase;
//Atunci când un pacient este internat in cadrul aplicației se face salvarea acestuia. Fiecare pacient
//        are posibilitatea sa plătească extra pentru anumite facilitate precum: pat rabatabil, mic dejun inclus,
//        papuci de camera, halat pentru interior. In cazul in care pacientul nu alege aceste facilitați extra,
//        in cadrul aplicației sunt setate cu false. Să se dezvolte modulul care asigură crearea de obiecte de
//        tipul pacient cu opțiuni extra.
public class Pacient{
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;

    protected Pacient(boolean patRabatabil, boolean micDejun, boolean papuci, boolean halat) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuci = papuci;
        this.halat = halat;
    }

    protected Pacient() {
        this.patRabatabil=false;
        this.micDejun=false;
        this.papuci=false;
        this.halat=false;
    }

    protected boolean isPatRabatabil() {
        return patRabatabil;
    }

    protected void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    protected boolean isMicDejun() {
        return micDejun;
    }

   protected void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    protected boolean isPapuci() {
        return papuci;
    }

    protected void setPapuci(boolean papuci) {
        this.papuci = papuci;
    }

    protected boolean isHalat() {
        return halat;
    }

    protected void setHalat(boolean halat) {
        this.halat = halat;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuci=" + papuci +
                ", halat=" + halat +
                '}';
    }
}
