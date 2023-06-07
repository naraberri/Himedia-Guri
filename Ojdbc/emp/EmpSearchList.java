package emp;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import comm.DbConnect;

public class EmpSearchList extends DbConnect {

	public static void main(String[] args) throws Exception {
		System.out.println("[ 사원검색 프로그램 ]");
		System.out.println(" 1.사원명 검색\n 2.부서별 검색\n 3.업무별 검색\n 4.매니저별 검색\n 5.급여별 검색");
		Scanner scn = new Scanner(System.in);
		System.out.print("메뉴번호>>");
		System.out.println();
		int menu = scn.nextInt();
		switch(menu) {
			case 1 : enameSearch();
			break;
			case 2 : deptnoSearch();
			break;
			case 3 : jobSearch();
			break;
			case 4 : mgrSearch();
			break;
			case 5 : salSearch();
			break;
			default : System.out.println("번호를 확인해주세요.");
		}
	}

	public static void enameSearch() throws Exception {
		Scanner scn = new Scanner(System.in);
		System.out.println("---사원명 검색---");
		System.out.print("검색 할 사원명을 입력해주세요>>");
		String name = scn.next();
		
		Statement stmt = Connection().createStatement();
		
		String sql1 = "select count(*) cnt from emp where ename = upper('"+name+"')";
		//query 적용
		ResultSet rs1 = stmt.executeQuery(sql1);
	     //next 메소드를 통해 결과 위치로 접근
		rs1.next();
		int cnt = rs1.getInt("cnt");
		if( cnt == 0 ) {
			System.out.println("없는 사원입니다.");
			System.out.println("종료합니다.");
		}
	      
		String sql2 = "select e1.empno,e1.ename,e1.job,e1.sal,e2.ename,d.dname from emp e1,emp e2,dept d "
				+ " where e1.mgr = e2.empno and e1.deptno = d.deptno and e1.ename = upper('"+name+"')";
		ResultSet rs2 = stmt.executeQuery(sql2); //select 전용
		while(rs2.next()) {
			String empno = rs2.getString("empno");
			String ename = rs2.getString("ename");
			String job = rs2.getString("job");
			String sal = rs2.getString("sal");
			String mgr = rs2.getString("ename_1");
			String dname = rs2.getString("dname");
			
			
			System.out.println("1.사원명 :"+ename+"("+empno+")");
			System.out.println("2.업무 :"+job);
			System.out.println("3.급여 :"+sal);
			System.out.println("4.매니저명 :"+mgr);
			System.out.println("5.부서명 :"+dname);
		}
	      
	}
	public static void deptnoSearch() throws Exception {
		
	}
	public static void jobSearch() throws Exception {
		
	}
	public static void mgrSearch() throws Exception {
		
	}
	public static void salSearch() throws Exception {
		
	}
	
}
