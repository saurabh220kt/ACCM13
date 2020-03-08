package P1;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

import P2.A2;

public class A1 extends A2{
public static void main(String[] args) throws SQLException {
	
	
	Driver d=new Driver();
	DriverManager.registerDriver(d);
	
	DriverManager.getConnection("...");
}
}
