package D.MasteringOODesign.Hospital.domain.dao;

import D.MasteringOODesign.Hospital.domain.Employee;

/**
 * Created by VKurochkin on 2/21/2017.
 */
public class EmployeeDAO {

    public void saveEmployee(Employee employee){
//        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//        connectionManager.connect();
//        connectionManager.getConnectionObject("insert into Employee_tbl");
//        connectionManager.disconnect();

        System.out.println("Connected to the database");
    }

    public void deleteEmployee(Employee employee){

    }
}
