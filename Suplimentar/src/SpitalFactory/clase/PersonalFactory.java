package SpitalFactory.clase;

public class PersonalFactory {

    public static Personal getPersonal(TipPersonal tip, String nume, String domeniu) {
        switch (tip){
            case MEDIC:
                return new Medic(nume,domeniu);
            case ASISTENT:
                return new  Asistent(nume,domeniu);
            case BRANCARDIER:
                return new Brancardier(nume,domeniu);
            default:
                try {
                    throw new Exception("Nu exista tipul selectat");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }


        }
    }
}
