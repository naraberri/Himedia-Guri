package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeptSelectList {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";
		String username = "c##java";
		String userpass = "1234";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,userpass);
		Statement stmt = con.createStatement();
		String sql2 = "select count(*) cnt from dept";
		ResultSet rs2 = stmt.executeQuery(sql2);
		rs2.next();
		int total = rs2.getInt("cnt");
		
		String sql = "select deptno,dname,loc from dept order by deptno";
		ResultSet rs = stmt.executeQuery(sql); //select 전용
		
		System.out.println("[ 부서목록 ] 총:"+total+"개");
		System.out.println("---------------------");
		while(rs.next()) {
			String deptno = rs.getString("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			
			System.out.println( deptno+","+dname+","+loc );
		}
	}
}