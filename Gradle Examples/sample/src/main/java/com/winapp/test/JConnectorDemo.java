package com.winapp.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.io.IOUtils;



public class JConnectorDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?allowMultiQueries=true&user=root&password=admin");
		 //  "user=root&password=admin&allowMultiQueries=true");
		PreparedStatement stmt = conn.prepareStatement("CREATE DATABASE IF NOT EXISTS Multiline");
				stmt.execute();
				stmt.close();
				//System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());
				//System.out.println(Paths.get(".").toString());
				conn.setCatalog("Multiline");
				
				String query = IOUtils.toString(new FileReader("E:/WinAPP/src/com/winapp/test/whole.sql"));

				stmt = conn.prepareStatement(query);
				stmt.execute();
				stmt.close();

				conn.close();
	}

}
