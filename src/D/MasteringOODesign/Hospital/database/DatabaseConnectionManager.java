package D.MasteringOODesign.Hospital.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by VKurochkin on 2/21/2017.
 */
public class DatabaseConnectionManager {
      private Connection conn;

      private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    private DatabaseConnectionManager(){

    }


    public static DatabaseConnectionManager getManagerInstance(){
        return connectionInstance;
    }

    /**
     * conteins connection details
     *
     * @throws SQLException
     */
    public void connect() throws SQLException{
        // process specific to database connection details...
        conn = DriverManager.getConnection("Some/Database/URL");
        System.out.println("Established Database Connection...");
    }

    public Connection getConnectionObject(){
        return conn;
    }

    public void disconnect() throws SQLException{
        conn.close();
        System.out.println("Disconnected from Database...");
    }

}
