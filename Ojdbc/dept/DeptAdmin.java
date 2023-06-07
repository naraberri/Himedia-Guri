package dept;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import comm.DbConnect;

public class DeptAdmin extends DbConnect {

	public static void main(String[] args) throws Exception {
		System.out.println("[ 부서정보관리 시스템 ]");
		System.out.println(" 1.부서목록\n 2.부서입력\n 3.부서변경\n 4.부서삭제");
		Scanner scn = new Scanner(System.in);
		System.out.print("메뉴번호>>");
		System.out.println();
		int menu = scn.nextInt();
		switch(menu) {
			case 1 : deptList();
			break;
			case 2 : deptInsert();
			break;
			case 3 : deptUpdate();
			break;
			case 4 : deptDelete();
			break;
			default : System.out.println("번호를 확인해주세요.");
		}
	}
	
	public static void deptList() throws Exception{
		
		// 인스턴스(객체) 처리 == 작업공간 발생
		Statement stmt = Connection().createStatement();
				
		String sql1 = "select count(*) total from dept";
		//query 적용
		ResultSet rs1 = stmt.executeQuery(sql1);
		int total=0;
		//next 메소드를 통해 결과 위치로 접근
		if( rs1.next() ) {
		//컬럼명을 통해 해당 요소에 접근
		total =rs1.getInt("total");
		}
		else {
			return;   //메소드 종료
		}
				
		String sql2 = "select deptno"
					+ "	,dname"
					+ "	,loc "
					+ "from dept order by deptno";
		ResultSet rs2 = stmt.executeQuery(sql2); //select 전용
				
		System.out.println("[ 부서목록 ]");
		System.out.println("총:"+total);
		System.out.println("---------------------");
		int number = 0;
		while(rs2.next()) {
			String deptno = rs2.getString("deptno");
			String dname = rs2.getString("dname");
			String loc = rs2.getString("loc");
					
			number++;
					
			System.out.println( number+". "+deptno+","+dname+","+loc);
			}
		
	}
	
	public static void deptInsert() throws Exception{
		
		Statement stmt = Connection().createStatement();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("--- 부서정보입력 ---");
		
		System.out.print("1.부서번호>>");
		String deptno = scn.next();
		String sql1 = "select count(*) cnt from dept "
				    + "where deptno='"+deptno+"'";
		ResultSet rs1 = stmt.executeQuery(sql1);
		rs1.next();
		int cnt = rs1.getInt("cnt");
		if( cnt > 0 ) {
			System.out.println("이미 사용중인 번호입니다.");
			System.out.println("종료합니다.");
			return;	//	메소드의 종료
		}
				 
		System.out.print("2.부서이름>>");
		String dname = scn.next();
		
		System.out.print("3.부서위치>>");
		String loc = scn.next();
		
		String sql2 = "insert into dept(deptno,dname,loc) "
				   + "values('"+deptno+"','"+dname+"','"+loc+"') ";
		
		int result = stmt.executeUpdate(sql2); //insert,update,delete
		if( result > 0 ) {
			System.out.println("저장완료");
		} else {
			System.out.println("저장실패");
		}		
	}


	public static void deptUpdate() throws Exception{
	
		Statement stmt = Connection().createStatement();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("--- 부서 업데이트 ---");
		System.out.print("업데이트 할 부서번호>>");
		String deptno = scn.next();
		String sql1 = "select count(*) cnt from dept "
				    + "where deptno='"+deptno+"'";
		ResultSet rs1 = stmt.executeQuery(sql1);
		int cnt = 0;
		if( rs1.next() ) {
			cnt = rs1.getInt("cnt");
		}else {	//sql 적용오류
			return;	//	메소드의 종료
		}
		
		if( cnt == 0 ) {
			System.out.println("존재 하지 않는 부서번호입니다.");
			System.out.println("종료합니다.");
			return;	//	메소드의 종료
		}
		
		System.out.print("업데이트 할 컬럼명>>");
		String column = scn.next();
		
		System.out.print("업데이트 할 값>>");
		String columnValues = scn.next();		
		
		String sql2 = "update dept set "+column+"='"+columnValues+"' where deptno='"+deptno+"'";
		
		int result = stmt.executeUpdate(sql2); //insert,update,delete
		if( result > 0 ) {
			System.out.println("업데이트완료");
		} else {
			System.out.println("업데이트실패");
		}
	}

	public static void deptDelete() throws Exception{
		
		Statement stmt = Connection().createStatement();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("--- 부서삭제 ---");
		
		System.out.print("1.부서번호>>");
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
		
		String sql = "delete from dept where deptno='"+deptno+"'";
		
		System.out.println("정말 삭제를 실행합니까? 1.예 2.아니오");
		int check = scn.nextInt();
		if(check==2) {
			System.out.println("삭제를 취소합니다.");
			return;
		}
		
		int result = stmt.executeUpdate(sql); //insert,update,delete
		if( result > 0 ) {
			System.out.println("삭제완료");
		} else {
			System.out.println("삭제실패");
		}
	}
}
