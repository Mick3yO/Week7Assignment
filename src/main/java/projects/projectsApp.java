package projects;

import java.sql.Connection;
import java.sql.SQLException;

import projects.dao.DbConnection;
import projects.exception.DbException;

public class projectsApp {


public static void main(String[] args) {
    Connection conn = null; {
    try {
        conn = DbConnection.getConnection();
        
    } catch (DbException e) {
      
    } finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
          
        }
    }
}
}
}