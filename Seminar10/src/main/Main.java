package main;

import chainOfResponsability.SMS;
import observer.Client;
import observer.Observer;
import strategy.CardBancar;
import strategy.Platitor;
import strategy.Validator;
import subiect.Autobuz;
import subiect.Subiect;
import subiect.Tramvai;



public class Main {
    public static void main(String[] args) {
        // STRATEGY
        Validator validator = new Validator();
      //  validator.setModPlata(new CardBancar());
      //  validator.valideazaCalatorie(20f);
     //   validator.setModPlata(new SMS());
     //   validator.valideazaCalatorie(13f);

        // CHAIN OF RESPONSIBILITY

       chainOfResponsability.Validator validator1 = new chainOfResponsability.Validator();
        validator1.valideazaCalatoria(1);
        validator1.valideazaCalatoria(1);
        validator1.valideazaCalatoria(1);
        validator1.valideazaCalatoria(10);

        // OBSERVER

        Observer client = new Client("A");
        Observer client1 = new Client("B");
        Subiect tramvai = new Tramvai(41);
        tramvai.abonareObservable(client);
        tramvai.abonareObservable(client1);
        tramvai.anuntaPlecare();
        tramvai.dezabonareObservable(client);
        Client client3 = new Client("C");
        tramvai.abonareObservable(client3);
        tramvai.anuntaPlecare();
        tramvai.trimiteMesaje("Plecam!");

        Subiect autobuz = new Autobuz();
        autobuz.abonareObservable(client);
        autobuz.abonareObservable(client3);
        autobuz.anuntaPlecare();
        ((Autobuz)autobuz).anuntaDeranjament();
    }
}
