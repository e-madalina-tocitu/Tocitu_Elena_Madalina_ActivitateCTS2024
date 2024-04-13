package Proxy.src.proxy;

import clase.AbstractAutobuz;

import java.util.ArrayList;
import java.util.List;

public class AutobuxProxy implements AbstractAutobuz {
    private List<String> statiiInterzise=new ArrayList<>();
    private AbstractAutobuz autobuz;

    public AutobuxProxy( AbstractAutobuz autobuz) {

        this.autobuz = autobuz;
    }

    public void adaugaStatie(String statie){
        statiiInterzise.add(statie);
    }
    @Override
    public void opresteInStatie(String statie) {
        if(statiiInterzise.contains(statie)){
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" nu opreste in statie");
        }
        else {
            opresteInStatie(statie);
        }
    }

    @Override
    public int getNrAutobuz() {
        return autobuz.getNrAutobuz();
    }

    @Override
    public int getNrCalatori() {
        return autobuz.getNrCalatori();
    }
}
