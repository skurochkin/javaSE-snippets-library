package D.MasteringOODesign.Hospital.clients;

import D.MasteringOODesign.Hospital.domain.Employee;
import D.MasteringOODesign.Hospital.domain.dao.EmployeeDAO;
import D.MasteringOODesign.Hospital.reporting.EmployeeReportFormator;
import D.MasteringOODesign.Hospital.reporting.FormatType;

/**
 * Created by VKurochkin on 2/21/2017.
 */
public class ClientModule {

    public static void main(String[] args) {

        Employee peggy = new Employee(1, "peggy", "accounting", true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.XML);
    }

    public static void hireNewEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormator formator = new EmployeeReportFormator(employee, formatType);
        System.out.println(formator.getFormateedEmployee());
    }
}
