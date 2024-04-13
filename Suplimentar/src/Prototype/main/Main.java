package Prototype.main;

import Prototype.clase.AbstractPrototype;
import Prototype.clase.Reteta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        List<String> denumiri=new ArrayList<>();
//        denumiri.add("bgdcfb");
//        denumiri.add("cbjdscb");
        Map<String,Integer> dencant=new HashMap<>();
        dencant.put("bghgd",5);
        dencant.put("bghgd",6);

//        List<Integer> cantitati=new ArrayList<>();
//        cantitati.add(3);
//        cantitati.add(6);
        Reteta reteta=new Reteta(dencant,"reteta1");
        System.out.println(reteta);
        AbstractPrototype reteta2=reteta.clone();
        System.out.println(reteta2);
    }


}
