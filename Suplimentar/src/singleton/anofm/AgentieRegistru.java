package singleton.anofm;

import java.util.HashMap;
import java.util.Map;

public class AgentieRegistru {

    private Map<String,Agentie> agentie;
    private static AgentieRegistru insatnta= null;

   private AgentieRegistru() {
        agentie = new HashMap<>();
    }

    public Agentie getAgentie(String numeFirma){
       return agentie.get(numeFirma);
    }
    public static synchronized AgentieRegistru getInstance(){
       if(insatnta==null){
           insatnta=new AgentieRegistru();
       }
       return insatnta;
    }
    public void  inregistrare(String numeAgentie, String numePachet, int nrPachete){
       agentie.putIfAbsent(numeAgentie, new Agentie(numeAgentie,numePachet,nrPachete));
    }

}
