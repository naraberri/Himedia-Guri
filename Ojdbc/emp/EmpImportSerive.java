package emp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Statement;
import java.util.Calendar;

import comm.DbConnect;

public class EmpImportSerive extends DbConnect {

	public static void main(String[] args) throws Exception {
		
		String path = "C:/temp100/emp_info.txt";
		empImport(path);
	}
	
	public static void empImport(String file_path) throws Exception {
		
		Calendar cal = Calendar.getInstance();
		long t1 = cal.getTimeInMillis();
		
		//	DB 연결
		Statement stmt = Connection().createStatement();
		//	경로의 인식
		FileReader file = new FileReader(file_path);
		BufferedReader buffer = new BufferedReader(file);
		//	내용 읽기
		String rowData = "";
		int cnt = 0;
		
		while(true){
			
			if( ( rowData = buffer.readLine() ) != null ) {
				
				String[] datas = rowData.split("／");
				
				String sql = "insert into emp"
							+ " (empno,ename,job,mgr,hiredate,sal,comm,deptno)"
							+ " values( (select max(empno)+1 from emp) "
							+ ",'"+datas[0]+"'"
							+ ",'"+datas[1]+"'"
							+ ",'"+datas[2]+"'"
							+ ",'"+datas[3]+"'"
							+ ",'"+datas[4]+"'"
							+ ",'"+datas[5]+"'"
							+ ",'"+datas[6]+"')";
				
				int result = stmt.executeUpdate(sql);
				if(result == 1) cnt++;
				
			} else {
				break;
			}
		}//while close
				
		cal = Calendar.getInstance();
		long t2 = cal.getTimeInMillis();
		
		long t3 = t2 - t1;
		
		System.out.println(t3+"밀리 초");
		System.out.println("총 "+cnt+"건 입력완료");	
	}
}
