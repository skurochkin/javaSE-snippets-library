package D.MasteringOODesign.Hospital.domain;

/**
 * Created by VKurochkin on 2/20/2017.
 */
public class Employee
{
    private int id;
    private String name;
    private String department;
    private boolean working;

    public Employee(int id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}
