abstract class Collegee{
    abstract void Register();
    abstract void Infrastructure();
    abstract void Students();
    abstract void Staff();
    void medicalFacility(){
        System.out.println("Medical facility is optional.");
    }
}
    class KIETT extends Collegee{
        void Register(){
            System.out.println("Registration is open.");
        }
        void Infrastructure(){
            System.out.println("Kiet have digital classroom and labs");
        }
        void Students(){
            System.out.println("Admission through counselling");
        }
        void Staff(){
            System.out.println("Staff is highly qualified.");
        }
        void medicalFacility(){
            System.out.println("Kiet have its own hospital inside campus");
        }
    }


    
public class AbstractExample{
    public static void main(String args[]){
        Collegee cg;
        cg=new KIETT();
        cg.Register();
        cg.Infrastructure();
        cg.Students();
        cg.Staff();
        cg.medicalFacility();
    }
}