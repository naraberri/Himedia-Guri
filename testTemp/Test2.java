package testTemp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class Test2 {
	public static void saveUser() throws Exception {
		Scanner scn = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		System.out.print("사용하실 아이디를 입력해주세요.(6~12자. 영어 대소문자와 _,-까지만 허용) >>");
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
		int yyy = cal.get(Calendar.YEAR);
		System.out.println(yyy);
		pattern = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";
		if(userBirth.matches(pattern)) {
			String[] tempBirth = userBirth.split("-");
			int yy = Integer.parseInt(tempBirth[0]);
			int mm = Integer.parseInt(tempBirth[1]);
			int dd = Integer.parseInt(tempBirth[2]);
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
		String tempPh1 = "";
		String tempPh2 = "";
		String tempPh3 = "";
		if(userPhone.length() == 10) {
			tempPh1 = userPhone.substring(0,3);
			tempPh2 = userPhone.substring(3,6);
			tempPh3 = userPhone.substring(6);
		} else if(userPhone.length() == 11) {
			tempPh1 = userPhone.substring(0,3);
			tempPh2 = userPhone.substring(3,7);
			tempPh3 = userPhone.substring(7);
		} else {
			System.out.println("핸드폰번호를 다시 확인해주세요");
			saveUser();
		}
		
		userPhone = tempPh1+"-"+tempPh2+"-"+tempPh3;
		
		if(userPhone.matches(pattern)) {
			System.out.println("올바른 핸드폰 번호");
		} else {
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
		//	파일안의 내용을 읽어드리는 클래스.
		BufferedReader buffer = new BufferedReader(file);
		String rowData = "";
		String id = "";
		String birth = "";
		String phone = "";
		while(true){
			if( (rowData = buffer.readLine()) != null ){//끝에 다다르면 break를 통해 종료함
				
				String[] str = rowData.split("/");
				id = str[0];
				birth = str[1];
				phone = str[2];
				id = id.substring(0,3);
				birth = birth.substring(0,4);
				int yy = cal.get(Calendar.YEAR);
				int year = yy-Integer.parseInt(birth);
				if(year<10) {
					System.out.println(id+"\t\t"+birth+"("+year+")\t\t\t"+phone);
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
		//	파일안의 내용을 읽어드리는 클래스.
		BufferedReader buffer = new BufferedReader(file);
		String rowData = "";
		String id = "";
		String birth = "";
		String phone = "";
		String myData = "";
		while(true){
			if( (rowData = buffer.readLine()) != null ){//끝에 다다르면 break를 통해 종료함
				if((rowData.indexOf(userId) > -1)) {
					myData = rowData;
					String[] str = rowData.split("/");
					id = str[0];
					birth = str[1];
					phone = str[2];
				}
				
			} else {
				break;
			}
		}
		
		if(myData.equals("")) {
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
		//	파일안의 내용을 읽어드리는 클래스.
		BufferedReader buffer = new BufferedReader(file);
		
		String rowData = "";
		String myData = "false";
		String otherData = "";
		while(true){
			if( (rowData = buffer.readLine()) != null ){//끝에 다다르면 break를 통해 종료함
				if(((rowData.indexOf(userId+"/")) >- 1)) {
					rowData = "";
					myData = "true";
				}else {
					otherData += rowData+"\n";
				}
			} else {
				break;
			}
		}
		
		
		if(myData.equals("false")) {
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
