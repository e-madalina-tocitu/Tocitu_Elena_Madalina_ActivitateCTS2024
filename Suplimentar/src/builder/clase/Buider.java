package builder.clase;

public class Buider implements  AbstractBuilder{
private Pacient pacient;


    public Buider() {
        this.pacient=new Pacient();
    }

    private Buider(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public AbstractBuilder vreaPatRabatabil() {
        pacient.setPatRabatabil(true);
        return (this);

    }

    @Override
    public AbstractBuilder vreaMicDejun() {
        pacient.setMicDejun(true);
        return (this);
    }

    @Override
    public AbstractBuilder vreaPapuci() {
        pacient.setPapuci(true);
        return (this);
    }

    @Override
    public AbstractBuilder vreaHalat() {
        pacient.setHalat(true);
        return (this);
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}
