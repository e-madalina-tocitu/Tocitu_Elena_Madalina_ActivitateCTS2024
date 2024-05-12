package composite.clase;

public abstract class AbstractMeniu {

    public abstract void adaugaOptiune(AbstractMeniu optiune);
    public abstract void stergeOptiune(AbstractMeniu optiune);
    public abstract void afiseaza();
    public abstract AbstractMeniu getOptiune(int index);

}
