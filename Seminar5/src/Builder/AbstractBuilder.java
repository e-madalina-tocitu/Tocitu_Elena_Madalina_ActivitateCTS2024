package Builder;

public interface AbstractBuilder {
     AbstractBuilder adaugaScaunErgonomic();
     AbstractBuilder adaugaBautura();
     AbstractBuilder adaugaMuzica();
     AbstractBuilder adaugaMancare();
     AbstractBuilder adaugaGenMuzical(String genMuzical);
    Rezervare build();
}
