package D.MasteringOODesign.OpenClosedPrincipal.Hospital2;

/**
 * Created by VKurochkin on 2/28/2017.
 */
public class EmergencyRoomProcess {

    public static void main(String[] args) {
        HospitalManagment ERDirector = new HospitalManagment();
        Employee peggy = new Nurse(1, "Peggy", "emergency", true);

        ERDirector.callUpon(peggy);

        Employee suzan = new Doctor(2, "Suzan", "emergency", true);
        ERDirector.callUpon(suzan);
    }
}
