package D.MasteringOODesign.Liskov.teachers;

/**
 * Created by VKurochkin on 2/28/2017.
 */
public class EnglishTeacher  extends SchoolStaff implements CourceInstructor {
    @Override
    public void teach() {
        System.out.println("teach English");
    }
}
