package org.derby.conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDB {
	
	public static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	//public static final String JDBC_URL = "jdbc:derby:mydb;create=true";
	public static final String JDBC_URL = "jdbc:derby:memory:mydb;create=true";
	//jdbc:derby:memory:testDB;create=true
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(JDBC_URL);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Database Created and Connected");
	}

}
