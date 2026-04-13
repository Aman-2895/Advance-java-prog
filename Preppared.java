package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Preppared {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver_name = "com.mysql.cj.jdbc.Driver";
		String host = "jdbc:mysql://localhost:3306/employeeDB";
		String username = "root";
		String pwd = "Aman@123";
		String query ="select * from employee where salary >=? ";
		long inSalary = 5000;
		String insertQuery = "insert into employee(name,dept,salary) values(?,?,?)";
		String updatequery = "update employee set id = 5 where salary = 65000";
		
		try {
			Class.forName(driver_name);
			System.out.println("Driver is ready");
			Connection con = DriverManager.getConnection(host,username,pwd);
			System.out.println("Host is ready");
			
//			PreparedStatement inpst = con.prepareStatement(insertQuery);
//			inpst.setString(1, "em6:");
//			inpst.setString(2, "Mca");
//			inpst.setString(3, "65000");
			//inpst.executeUpdate();
			
			PreparedStatement uppst = con.prepareStatement(updatequery);
			uppst.executeUpdate();
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setLong(1, inSalary);                                                 
  	    	ResultSet rs = pst.executeQuery();     
			
  	    	
			System.out.println("ID\tName\tDept\tSalary");
			
			
			while(rs.next()) {  //rs.previous() but 
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String dept = rs.getString("dept");
				long salary = rs.getLong("salary");
				System.out.println(String.format("%d   |%s |%s    |%d",id,name,dept,salary));

			}
		
			rs.close();
			pst.close();
			
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
