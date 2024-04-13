package singleton.anofm;

public class Main {
    public static void main(String[] args) {
        AgentieRegistru agentie=AgentieRegistru.getInstance();
        agentie.inregistrare("nume","pachet",2);
        agentie.inregistrare("nume","pachetWWWW",2);
        agentie.inregistrare("nume2","pachet2",3);

        System.out.println(agentie.getAgentie("nume"));
    }
}
