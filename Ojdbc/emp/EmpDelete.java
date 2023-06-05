package emp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import comm.DbConnect;

public class EmpDelete extends DbConnect {

	public static void main(String[] args) throws Exception {
		
		// 인스턴스(객체) 처리 == 작업공간 발생
		Statement stmt = Connection().createStatement();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("--- 사원삭제 ---");
		
		System.out.print("1.사원번호>>");
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
