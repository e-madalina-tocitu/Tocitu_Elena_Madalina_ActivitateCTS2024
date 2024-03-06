package anofm.main;

import anofm.Manager;
import anofm.ManagerRegistry;

public class Main {
    public static void main(String[] args) {
        ManagerRegistry registru =ManagerRegistry.getInstance();
        registru.inregistreazaManager("CRT SRL","Popescu",39939f);
        registru.inregistreazaManager(" SRL","Iopescu",4898f);
        System.out.println(registru.getManager("CRT SRL"));


    }
}
