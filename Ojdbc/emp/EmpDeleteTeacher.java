package emp;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import comm.DbConnect;

public class EmpDeleteTeacher extends DbConnect {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("[ 사원정보삭제 ]");
		System.out.print("사원번호(삭제)>>");
		int empno = scn.nextInt();
		
		try {
			delete(empno);
		} catch (Exception e) { }
		
	}
	
	public static void delete(int empno) throws Exception {
		Scanner scn = new Scanner(System.in);
		
		Statement stmt = Connection().createStatement();
		
		String sql1 = "select count(*) cnt from emp "
			    + "where empno='"+empno+"'";
		ResultSet rs1 = stmt.executeQuery(sql1);
		
		int cnt = 0;
		if( rs1.next() ) {
			cnt = rs1.getInt("cnt");
		}else {	//sql 적용오류
			return;	//	메소드의 종료
		}
		
		if( cnt == 0 ) {
			System.out.println("존재하지 않는 사원번호입니다.");
			System.out.println("종료합니다.");
			return;	//	메소드의 종료
		}		
		
		String sql2 = "delete from emp where empno='"+empno+"'";
		
		System.out.println("정말 삭제를 실행합니까? 1.예 2.아니오");
		int check = scn.nextInt();
		if(check==2) {
			System.out.println("삭제를 취소합니다.");
			return;
		}
		
		int result = stmt.executeUpdate(sql2); //insert,update,delete
		if( result > 0 ) {
			System.out.println("삭제완료");
		} else {
			System.out.println("삭제실패");
		}
	}
}
