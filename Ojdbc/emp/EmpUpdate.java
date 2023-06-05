package emp;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import comm.DbConnect;

public class EmpUpdate extends DbConnect {

	public static void main(String[] args) throws Exception {
		
		Statement stmt = Connection();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("--- 데이터 업데이트 ---");
		System.out.print("업데이트 할 사원번호>>");
		String empno = scn.next();
		String sql1 = "select count(*) cnt from emp "
				    + "where empno='"+empno+"'";
		ResultSet rs1 = stmt.executeQuery(sql1);
		rs1.next();
		int cnt = rs1.getInt("cnt");
		if( cnt == 0 ) {
			System.out.println("존재하지 않는 사원번호입니다.");
			System.out.println("종료합니다.");
			return;	//	메소드의 종료
		}		
		
		System.out.print("업데이트 할 컬럼명>>");
		String ename = scn.next();
		
		System.out.print("업데이트 할 값>>");
		String enameValues = scn.next();		
		
		String sql2 = "update emp set "+ename+"='"+enameValues+"' where empno='"+empno+"'";
		
		int result = stmt.executeUpdate(sql2); //insert,update,delete
		if( result > 0 ) {
			System.out.println("업데이트완료");
		} else {
			System.out.println("업데이트실패");
		}
	}
}
