package post;

import java.io.File;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Scanner;

import comm.DbConnect;

public class PostExportService extends DbConnect {

	public static void main(String[] args) throws Exception {
		
		System.out.println("익스포트할 자료 선택");
		System.out.println("1.우편번호자료 \n2.사원정보자료");
		Scanner scn = new Scanner(System.in);
		System.out.print("번호선택 >> ");
		int number = scn.nextInt();
		switch(number) {
			case 1: postExport();
			break;
			case 2: empExport();
			break;
			default : System.out.println("번호를 확인해주세요.");
		}
		
		
		
	}
	
	public static void postExport() throws Exception {
	
		System.out.println("*** 우편번호정보 다운받는 중 ***");
		
		Calendar cal = Calendar.getInstance();
		long t1 = cal.getTimeInMillis();
		String t1_str = t1+"";
		
		//	DB 연결
		Statement stmt = Connection().createStatement();
		//	파일명 제작
		String fileName = "post_"+t1_str.substring(t1_str.length()-5)+".txt";
		//	생성파일경로
		String downFilepath = "c:/post/"+fileName;
		String dir = "c:/post/";
		File fileDir = new File(dir);
		if( !fileDir.exists() ) {
			fileDir.mkdir();
		}
		//	데이터를 읽어오기
		String sql = "select * from post2";
		ResultSet rs = stmt.executeQuery(sql);
		int cnt = 0;
		File file = new File(downFilepath);
		FileWriter fw = new FileWriter(file,true);
		
		while(rs.next()) {
			String a1 = rs.getString("a1");
			String a2 = rs.getString("a2");
			String a3 = rs.getString("a3");
			String a4 = rs.getString("a4");
			String a5 = rs.getString("a5");
			String a6 = rs.getString("a6");
			String a7 = rs.getString("a7");
			
			String value = a1+","+a2+" "+a3+" "+a4+" "+a5+" "+a6+" "+a7+"\n";
						
			fw.write(value+"\n");			
			
			cnt++;
		}
		fw.close();
//		String sql = "select a1,(a2||' '||a3||' '||a4||' '||a5||' '||a6||' '||a7) as addr from post2";
//		ResultSet rs = stmt.executeQuery(sql);
//		int cnt = 0;
//		
//		while(rs.next()) {
//			String a1 = rs.getString("a1");
//			String addr = rs.getString("addr");
//			
//			String value = a1+","+addr+"\n";
//			
//			File file = new File(downFilepath);
//			FileWriter fw = new FileWriter(file,true);
//			fw.write(value+"\n");
//			fw.close();
//			
//			cnt++;
//		}
		cal = Calendar.getInstance();
		long t2 = cal.getTimeInMillis();
		
		long t3 = t2 - t1;
		
		System.out.println(t3+"밀리 초");
		System.out.println("총 "+cnt+"건 다운완료");
		System.out.println( downFilepath+"로 저장완료");
		
	}
	
	public static void empExport() throws Exception {
	
		System.out.println("*** 사원정보 다운받는 중 ***");
		
		Calendar cal = Calendar.getInstance();
		long t1 = cal.getTimeInMillis();
		String t1_str = t1+"";
		
		//	DB 연결
		Statement stmt = Connection().createStatement();
		//	경로의 인식
		String fileName = "emp_"+t1_str.substring(t1_str.length()-5)+".txt";
		String downFilepath = "c:/emp/"+fileName;
		String dir = "c:/emp/";
		File fileDir = new File(dir);
		if( !fileDir.exists() ) {
			fileDir.mkdir();
		}
		String sql = " select e1.empno"
				+ "			 ,e1.ename"
				+ "			 ,e1.job"
				+ "			 ,e2.ename as mgr_name"
				+ "			 ,d.dname"
				+ "			 ,to_char(e1.hiredate,'yyyy-mm-dd') as hiredate"
				+ "			 ,(to_char(sysdate,'yyyy')-to_char(e1.hiredate,'yyyy')) as year "
				+ " from emp e1,emp e2,dept d"
				+ " where e1.deptno = d.deptno and"
				+ "      e1.mgr = e2.empno(+)";
		ResultSet rs = stmt.executeQuery(sql);
		
		int cnt = 0;
		File file = new File(downFilepath);
		FileWriter fw = new FileWriter(file,true);
		
		while(rs.next()) {
			String empno = rs.getString("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			String mgr_name = rs.getString("mgr_name");
			String dname = rs.getString("dname");
			String hiredate = rs.getString("hiredate");
			String year = rs.getString("year");
			
			String value = empno+"\t"+ename+"\t"+job+"\t"+mgr_name+"\t"+dname+"\t"+hiredate+"\t"+year;			
			
			fw.write(value+"\n");			
			
			cnt++;
		}
		fw.close();
		
		cal = Calendar.getInstance();
		long t2 = cal.getTimeInMillis();
		
		long t3 = t2 - t1;
		
		System.out.println(t3+"밀리 초");
		System.out.println("총 "+cnt+"건 다운완료");
		System.out.println( downFilepath+"로 저장완료");
	}
}
