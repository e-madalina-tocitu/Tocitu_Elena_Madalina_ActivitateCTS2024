package main;

import Prototip.AbstractPrototype;
import Prototip.Client;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> accesorii=new ArrayList<>();
        accesorii.add("jhv");
        accesorii.add("yvf");
        Client client=new Client("A", 16,accesorii);
        AbstractPrototype clent2=client.clone();
        System.out.println(client);
        System.out.println(clent2);

    }
}