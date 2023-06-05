package emp;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import comm.DbConnect;

public class EmpInsert extends DbConnect {

	public static void main(String[] args) throws Exception {
		
		Statement stmt = Connection();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("--- 사원정보입력 ---");
		
		System.out.print("1.사원번호>>");
		String empno = scn.next();
		String sql1 = "select count(*) cnt from emp "
				    + "where empno='"+empno+"'";
		ResultSet rs1 = stmt.executeQuery(sql1);
		rs1.next();
		int cnt = rs1.getInt("cnt");
		if( cnt > 0 ) {
			System.out.println("이미 사용중인 번호입니다.");
			System.out.println("종료합니다.");
			return;	//	메소드의 종료
		}
				
		System.out.print("2.사원이름>>");
		String ename = scn.next();
		
		System.out.print("3.직업>>");
		String job = scn.next();
		
		System.out.print("4.담당매니저번호>>");
		String mgr = scn.next();
		
		System.out.print("5.입사날짜>>");
		String hiredate = scn.next();
		
		System.out.print("6.연봉>>");
		String sal = scn.next();
		
		System.out.print("7.상여금>>");
		String comm = scn.next();
		
		System.out.print("8.부서번호>>");
		String deptno = scn.next();
		
		String sql2 = "insert into emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) "
				   + "values('"+empno+"','"+ename+"','"+job+"','"+mgr+"',"
				   		+ "'"+hiredate+"','"+sal+"','"+comm+"','"+deptno+"') ";
		
		int result = stmt.executeUpdate(sql2); //insert,update,delete
		if( result > 0 ) {
			System.out.println("저장완료");
		} else {
			System.out.println("저장실패");
		}
	}
}
