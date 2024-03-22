package clase;

public interface AbstractBuilder {
    Rezervare build();
    AbstractBuilder adaugaScaunErgonomic();
    AbstractBuilder adaugaBautura();
    AbstractBuilder adaugaMuzica();
    AbstractBuilder adaugaMancare();
    AbstractBuilder adaugaGenMuzical(String genMuzical);
}
