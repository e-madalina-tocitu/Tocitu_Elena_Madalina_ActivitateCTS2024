package singleton.main;

import singleton.clase.Agentie;

public class Main {
    public static void main(String[] args) {
        Agentie agentie1=Agentie.getInstance("nume2","pachet2",4);
        Agentie agentie=Agentie.getInstance();
       System.out.println(agentie);
        System.out.println(agentie1);
    }
}
