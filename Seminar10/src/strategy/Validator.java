package strategy;

import chainOfResponsability.CardBancar;
import chainOfResponsability.CardCalatorii;
import chainOfResponsability.Controlor;
import chainOfResponsability.Platitor;
import chainOfResponsability.SMS;

public class Validator {
    private Platitor plata;

    public Validator(Platitor plata) {
        this.plata = plata;
    }

    public Validator()
    {
        this.plata = null;
    }

    public void setModPlata(Platitor plata)
    {
        this.plata = plata;
    }

    public Platitor getPlata()
    {
        return plata;
    }
    public void valideazaCalatorie(float suma)
    {
        this.plata.plateste(suma);
    }
}
