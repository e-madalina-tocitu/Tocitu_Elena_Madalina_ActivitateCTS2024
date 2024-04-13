package Prototype.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reteta implements AbstractPrototype{
//    private List<String> denumire;
//    private List<Integer> cantitate;
    private Map<String,Integer> dencant;
    private String numeReteta;

    public Reteta() {
    }


//    public Reteta(List<String> denumire, List<Integer> cantitate, String numeReteta) {
//        this.denumire = denumire;
//        this.cantitate = cantitate;
//        this.numeReteta = numeReteta;
//    }
//
//    public List<String> getDenumire() {
//        return denumire;
//    }
//
//    public void setDenumire(List<String> denumire) {
//        this.denumire = denumire;
//    }
//
//    public List<Integer> getCantitate() {
//        return cantitate;
//    }
//
//    public void setCantitate(List<Integer> cantitate) {
//        this.cantitate = cantitate;
//    }

    public String getNumeReteta() {
        return numeReteta;
    }

    public void setNumeReteta(String numeReteta) {
        this.numeReteta = numeReteta;
    }

    public Reteta(Map<String, Integer> dencant, String numeReteta) {
        this.dencant = dencant;
        this.numeReteta = numeReteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "dencant=" + dencant +
                ", numeReteta='" + numeReteta + '\'' +
                '}';
    }

    @Override
    public AbstractPrototype clone() {
        Reteta reteta1=new Reteta();
        reteta1.numeReteta=numeReteta;
//        reteta1.denumire=new ArrayList<>();
//        reteta1.denumire.addAll(denumire);
//        reteta1.cantitate=new ArrayList<>();
//        reteta1.cantitate.addAll(cantitate);
        reteta1.dencant=new HashMap<>();
        reteta1.dencant.putAll(this.dencant);
        return reteta1;
    }
}
