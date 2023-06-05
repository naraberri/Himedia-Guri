package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeptUpdate {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";
		String username = "c##java";
		String userpass = "1234";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,userpass);
		Statement stmt = con.createStatement();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("--- 데이터 업데이트 ---");
		System.out.print("업데이트 할 부서번호>>");
		String deptno = scn.next();
		String sql2 = "select count(*) cnt from dept "
				    + "where deptno='"+deptno+"'";
		ResultSet rs2 = stmt.executeQuery(sql2);
		rs2.next();
		int cnt = rs2.getInt("cnt");
		if( cnt == 0 ) {
			System.out.println("존재하지 않는 부서번호입니다.");
			System.out.println("종료합니다.");
			return;	//	메소드의 종료
		}		
		
		System.out.print("업데이트 할 컬럼명>>");
		String column = scn.next();
		
		System.out.print("업데이트 할 값>>");
		String columnValues = scn.next();		
		
		String sql = "update dept set "+column+"='"+columnValues+"' where deptno='"+deptno+"'";
		
		int result = stmt.executeUpdate(sql); //insert,update,delete
		if( result > 0 ) {
			System.out.println("업데이트완료");
		} else {
			System.out.println("업데이트실패");
		}
	}
}
