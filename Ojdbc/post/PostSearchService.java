package post;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import comm.DbConnect;

public class PostSearchService extends DbConnect {

	public static void main(String[] args) throws Exception {
		while(true) {
			System.out.println("[ 우편번호검색 프로그램 ]");
			System.out.println(" 1.우편번호 검색");
			System.out.println(" 2.시도 검색");
			System.out.println(" 3.구군 검색");
			System.out.println(" 4.읍면동리 검색");
			System.out.println(" 5.건물명 검색");
			Scanner scn = new Scanner(System.in);
			System.out.print("메뉴번호>>");
			System.out.println();
			
			try {
				int number = scn.nextInt();
				if( number >= 1 && number <= 5) {
					addSearch(number);
					break;
				}else {
					System.out.println("*** 잘못된 번호입니다 ***");
				}
			} catch (Exception e) {				
				System.out.println("*** 잘못된 번호입니다 ***");
			}			
		}		
	}	
	
	public static void addSearch(int number) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("검색 할 값을 입력해주세요>>");
		String columnValue = scn.next();
		String columnName = "";
		columnValue = columnValue.replaceAll("\\s+", "");
		switch(number){
			case 1 : columnName = "a1 ="+columnValue;
				break;
			case 2 : columnName = "a2 like "+"'%"+columnValue+"%' or a3 like "+"'%"+columnValue+"%'";
				break;
			case 3 : columnName = "a2 like "+"'%"+columnValue+"%' or a3 like "+"'%"+columnValue+"%'";
				break;
			case 4 : columnName = "a3 like "+"'%"+columnValue+"%' or a4 like "+"'%"+columnValue+"%'"+" or a5 like "+"'%"+columnValue+"%'";
				break;
			case 5 : columnName = "a7 like ";
				break;
		}
		
		Statement stmt = Connection().createStatement();
		
		String sql = "select (a1||' '||a2||' '||a3||' '||a4||' '||a5||' '||a6||' '||a7) as address "
					+ " from post2 where "+columnName;
		//query 적용
		ResultSet rs = stmt.executeQuery(sql);
		
		int cnt = 0;
		System.out.println("[ 우편번호 주소 ]");
		System.out.println("-------------------------------------------");
		while(rs.next()) {
			String address = rs.getString("address");
			address = address.replaceAll("\\s+", " ");
			cnt++;			
			
			System.out.println(address);
		}		
		System.out.println( "검색결과 : "+cnt+"건 검색완료");
	}
	
}
