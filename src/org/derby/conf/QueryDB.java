package org.derby.conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDB {

	public static final String SQL_STATEMENT = "SELECT * FROM tbl_users";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
        Class.forName(CreateDB.DRIVER);
        Connection conn = DriverManager.getConnection(CreateDB.JDBC_URL);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(SQL_STATEMENT);

        while (rs.next()) {
            String id = rs.getString("id");
            String token = rs.getString("token");        	
            String username = rs.getString("username");
            String password = rs.getString("password");
            
            System.out.println("ID : " + id);
            System.out.println("Token : " + token);
            System.out.println("Username : " + username);
            System.out.println("password : " + password);
            System.out.println("------------------------------------");           

        }
        rs.close();
        stmt.close();
        conn.close();
        
       System.out.println("Database and Table Crated with Values");
	}
}
