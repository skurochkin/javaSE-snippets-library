package D.MasteringOODesign.Liskov.teachers;

/**
 * Created by VKurochkin on 2/28/2017.
 */
public class SchoolStaff {
    private void makeAnnouncments(){
        System.out.println("made announcement..");
    }

    private void takeAttendence(){
        System.out.println("took attendance..");
    }

    private void collectPaperWork(){
        System.out.println("collected paperwork..");
    }

    private void conductHallwayDuties(){
        System.out.println("conducted hallway duties..");
    }

    private void perfomOtherResponsibilities(){
        makeAnnouncments();
        takeAttendence();
        collectPaperWork();
        conductHallwayDuties();
        perfomOtherResponsibilities();
    }
}
