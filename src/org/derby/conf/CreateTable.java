package org.derby.conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
        	
            Class.forName(CreateDB.DRIVER);
            Connection conn = DriverManager.getConnection(CreateDB.JDBC_URL);
            
            conn.createStatement().execute("CREATE TABLE tbl_users ( id varchar(20), token varchar(40), username varchar(20), password varchar(20) )");
            conn.createStatement().execute("INSERT INTO tbl_users VALUES"
            		+ "( '1', 'token1', 'vedat', 'planso')," 
            		+ "( '2', 'token2', 'shared', 'planso')");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Database and Table Created with Values");
	}
	

}
