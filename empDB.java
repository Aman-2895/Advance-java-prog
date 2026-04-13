//prepaid statement developer knows command and action not know the data
 
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class empDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver_name = "com.mysql.cj.jdbc.Driver";
		String host = "jdbc:mysql://localhost:3306/employeeDB";
		String username = "root";
		String pwd = "Aman@123";
		String create_table = """
				CREATE TABLE IF NOT EXISTS employee(
				id INT PRIMARY KEY AUTO_INCREMENT,
				name VARCHAR(50) NOT NULL,
				dept VARCHAR(50),
				salary DECIMAL(10,2)
				)
				""";
		
		try {
			Class.forName(driver_name);
			System.out.println("Driver is ready");
			Connection con = DriverManager.getConnection(host,username,pwd);
			System.out.println("Host is ready");
			Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			smt.execute(create_table);                          //ddl command 
			System.out.println("table is ready");
			                                                  
			ResultSet rs = smt.executeQuery("select * from employee");     //dql command 
			System.out.println("ID\tName\tDept\tSalary");
			
			while(rs.next()) {
				rs.moveToInsertRow();
				rs.updateString("name", "Adnan");
				rs.updateString("Dept", "creator");
				rs.updateDouble("Salary",80000);
				rs.insertRow();
				break;
			}
			
			while(rs.next()) {  //rs.previous() but 
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String dept = rs.getString("dept");
				long salary = rs.getLong("salary");
//				if(salary<=70000) {
//					rs.updateDouble("Salary",salary*1.1);
//					rs.updateRow();
				System.out.println(String.format("%d   |%s |%s    |%d",id,name,dept,salary));
//			}
			}
			
//			int rowAffected = smt.executeUpdate("""                                //dml command
//					insert into employee
//					(name,dept,salary) values('Aman Goyal','CS','40000'),
//					('Anmol Saxena','IT','50000'),
//					('Anmol chopra','ACC','60000')
//					""");
//
//			if(rowAffected>0) {
//				System.out.println("Record inserted");
//			}
//			else {
//				System.out.println("Record is not inserted");
//			}
		
			rs.close();
			smt.close();
			
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
