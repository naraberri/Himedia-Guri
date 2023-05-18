package test_0518;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.Scanner;

public class UserModify {
	public static void saveUser() throws Exception {
		Scanner scn = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		System.out.print("사용하실 아이디를 입력해주세요.(6~12자. 영어 대소문자와 숫자 _,-까지만 허용) >>");
		String userId = scn.next();		
		
		String pattern = "^[a-zA-Z]{1}[a-zA-Z0-9_-]{5,11}$";
		if(userId.matches(pattern)) {
			System.out.println("올바른 아이디");
		} else {
			System.out.println("올바른 아이디 아님");
			saveUser();
		}
		
		System.out.print("생년월일을 입력해주세요.(YYYY-MM-DD) >>");
		String userBirth = scn.next();
		int yyy = cal.get(Calendar.YEAR);//올해날짜까지만을 위한 변수
		pattern = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";
		if(userBirth.matches(pattern)) {
			String[] tempBirth = userBirth.split("-");
			int yy = Integer.parseInt(tempBirth[0]);//년
			int mm = Integer.parseInt(tempBirth[1]);//월
			int dd = Integer.parseInt(tempBirth[2]);//일
			if((yy>1870 && yy<=yyy) && (mm>0 && mm<13) && (dd>0 && dd<32)) {
				System.out.println("올바른 날짜");
			}else {
				System.out.println("올바른 날짜 아님");
				saveUser();
			}
			
		} else {
			System.out.println("올바른 날짜 아님");
			saveUser();
		}
		
		System.out.println("핸드폰 번호를 입력해주세요.(숫자만 입력해주세요) >>");
		String userPhone = scn.next();
		
		pattern = "01(0|1[6-9])-[0-9]{3,4}-[0-9]{4}";
		String tempPh1 = "";	//010,011,016~9
		String tempPh2 = "";	//가운데 번호
		String tempPh3 = "";	//마지막 번호
		if(userPhone.length() == 10) {
			tempPh1 = userPhone.substring(0,3);
			tempPh2 = userPhone.substring(3,6);
			tempPh3 = userPhone.substring(6);
		} else if(userPhone.length() == 11) {
			tempPh1 = userPhone.substring(0,3);
			tempPh2 = userPhone.substring(3,7);
			tempPh3 = userPhone.substring(7);
		} else {//10 또는 11자리여야함
			System.out.println("핸드폰번호를 다시 확인해주세요");
			saveUser();
		}
		
		userPhone = tempPh1+"-"+tempPh2+"-"+tempPh3;//자릿수 확인후 패턴검증을 위해 -를 포함해서 저장시킴
		
		if(userPhone.matches(pattern)) {
			System.out.println("올바른 핸드폰 번호");
		} else {//012,013등은 없는 번호
			System.out.println("핸드폰번호를 다시 확인해주세요");
			return;
		}
		
		String txt = userId+"/"+userBirth+"/"+userPhone;
		String fileName = "C:\\html_test\\member.txt";
		String path = "C:\\html_test\\member.txt";
		File file1 = new File(path);
		FileWriter fw = new FileWriter(file1,true);
		FileReader file = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(file);
		String rowData = "";
		String tempData = "";
		
		while(true){
			if( (rowData = buffer.readLine()) != null ){
				String[] str = rowData.split("/");
				if(str[0].equals(userId) == true) {
					System.out.println("이미 사용중인 아이디입니다.");
					saveUser();
					return;
				}
			} else {
				break;
			}
		}
		
		
		fw.write(txt+"\n");
		System.out.println("회원가입에 성공했습니다.");
		fw.close();
		
				
	}

	public static void listUser() throws Exception {
		Calendar cal = Calendar.getInstance();
		
		System.out.println("-----------------------------");
		System.out.println(" [ 회원목록 ] ");
		System.out.println("-----------------------------");
		System.out.println("아이디\t\t출생년도(나이)\t\t핸드폰");
		
		String fileName = "C:\\html_test\\member.txt";
		
		FileReader file = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(file);
		String rowData = "";
		String id = "";
		String birth = "";
		String phone = "";
		while(true){
			if( (rowData = buffer.readLine()) != null ){
				
				String[] str = rowData.split("/");
				id = str[0];//아이디
				birth = str[1];//생년월일
				phone = str[2];//휴대폰번호
				id = id.substring(0,3);//아이디 3글자만 출력
				birth = birth.substring(0,4);//목록 리스트에는 연도만 출력하고 나이 계산용 변수
				int yy = cal.get(Calendar.YEAR);//나이 계산을 위한 현재연도
				int year = yy-Integer.parseInt(birth);//나이
				if(year<10) {//출력 칸을 맞추기 위해 0~9세까지는 "\t"를 하나 더 출력
					System.out.println(id+"\t\t"+birth+"("+year+")\t\t"+phone);
				}else {
				System.out.println(id+"\t\t"+birth+"("+year+")\t\t"+phone);
				}
			} else {
				break;
			}
		}
		
	}

	public static void lookUser() throws Exception {
		Scanner scn = new Scanner(System.in);		
		
		System.out.print("조회할 아이디를 입력해주세요. >>");
		String userId = scn.next();
				
		String fileName = "C:\\html_test\\member.txt";
		
		FileReader file = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(file);
		String rowData = "";
		String id = "";
		String birth = "";
		String phone = "";
		String myData = "";
		while(true){
			if( (rowData = buffer.readLine()) != null ){
				if((rowData.indexOf(userId) > -1)) {
					myData = rowData;//아이디 유무확인용
					String[] str = rowData.split("/");//아이디 생일 휴대폰을 한줄씩 출력하기 위해 split사용
					id = str[0];
					birth = str[1];
					phone = str[2];
				}
				
			} else {
				break;
			}
		}
		
		if(myData.equals("")) {//myData에 값이 없으면 없는 아이디
			System.out.println("아이디를 확인해주세요.");
			return;
		}
		System.out.println("아이디 : "+id);
		System.out.println("출생일 : "+birth);
		System.out.println("핸드폰 : "+phone);
	}

	public static void deleteUser() throws Exception {
		
		listUser();
		Scanner scn = new Scanner(System.in);		
		
		System.out.print("삭제할 아이디를 입력해주세요. >>");
		String userId = scn.next();
				
		String fileName = "C:\\html_test\\member.txt";
		
		FileReader file = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(file);
		
		String rowData = "";
		String myData = "false";
		String otherData = "";
		while(true){
			if( (rowData = buffer.readLine()) != null ){
				if(((rowData.indexOf(userId+"/")) >- 1)) {//aaa aaa1 aaa2등을 방지하기위해 "/"까지 검색
					rowData = "";//검색된 아이디의 데이터를 삭제
					myData = "true";//아이디 유무 확인용 
				}else {
					otherData += rowData+"\n";//해당 아이디 값이 아닌 데이터를 임시저장하는 변수
				}
			} else {
				break;
			}
		}
		
		
		if(myData.equals("false")) {//if문을 통과하지 못했기때문에 myData값이 false
			System.out.println("아이디를 확인해주세요.");
			return;		
		}
		File file1 = new File(fileName);
		FileWriter fw = new FileWriter(file1,false);
		fw.write(otherData);
		System.out.println("삭제완료.");
		
		fw.close();		
	}
}
