package D.MasteringOODesign.OpenClosedPrincipal.Hospital2;

/**
 * Created by VKurochkin on 2/21/2017.
 */
public class Nurse extends Employee {
    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse in action...");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }

    private void checkVitalSigns(){
        System.out.println("Checking Vitals");
    }

    private void drawBlood(){
        System.out.println("drawing blood");
    }

    private void cleanPatientArea(){
        System.out.println("cleaning patient area");
    }
}
