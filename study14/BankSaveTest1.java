package study14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class BankSaveTest1 {

	public static void bankPlus() throws Exception {
		Scanner scn = new Scanner(System.in);
		String path = "c:/html_test/money.txt"; // 저장파일 경로
		
		// 물리적인 위치로의 전환(인식) 관련 클래스
		FileReader fr = new FileReader(path);
		// 물리적인 파일 내용 확인 클래스
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("\n\n[ 입금화면 ] \n");
		System.out.print("아이디 >>");
		String id = scn.next();
		System.out.print("입금액 >>");
		int money = scn.nextInt();
		
		String rowData = "";	//읽어들인 한줄을 저장
		String otherData = "";	//관련없는 데이터 저장
		String myData = "";		//사용자가 입력한 Id와 Money의 세팅
		int sumMoney = 0;		//사용자가 입력한 금액과 저장된 금액의 합
		
		while(true) {
			if((rowData = br.readLine()) != null) {
				if((rowData.indexOf(id+":")) >- 1) {
					String[] str = rowData.split(":");//id와 money 분리
					sumMoney = money + Integer.parseInt(str[1]);//계산
					myData = id+":"+sumMoney;//사용자가 입력한 구성
				} else {
					otherData += rowData+"\n";//관련없는 데이터를 otherData에 누적
				}
			} else {
				break; // while문 종료
			}
		}
		if(myData.equals("")) {
			myData = id+":"+money;
		}
		File file = new File(path);
		FileWriter fw = new FileWriter(file,false);//덮어쓰기 용도로 false사용
		fw.write(otherData+myData);
		fw.close();
		
		System.out.println(id+"님의 계좌에 "+money+"원이 입금되었습니다.");
	}
	
	public static void bankMinus() throws Exception {
		Scanner scn = new Scanner(System.in);
		String path = "c:/html_test/money.txt"; // 저장파일 경로
		
		// 물리적인 위치로의 전환(인식) 관련 클래스
		FileReader fr = new FileReader(path);
		// 물리적인 파일 내용 확인 클래스
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("\n\n[ 출금화면 ] \n");
		System.out.print("아이디 >>");
		String id = scn.next();
		System.out.print("출금액 >>");
		int money = scn.nextInt();
		
		String rowData = "";	//읽어들인 한줄을 저장
		String otherData = "";	//관련없는 데이터 저장
		String myData = "";		//사용자가 입력한 Id와 Money의 세팅
		int sumMoney = 0;		//사용자가 입력한 금액과 저장된 금액의 합
		
		while(true) {
			if((rowData = br.readLine()) != null) {
				if((rowData.indexOf(id+":")) >- 1) {
					String[] str = rowData.split(":");//id와 money 분리
					
					sumMoney = Integer.parseInt(str[1]) - money;//계산
					
					if(sumMoney < 0) {
						System.out.println(id+"님의 잔액이 부족합니다.");
						return;
					}
					myData = id+":"+sumMoney;//사용자가 입력한 구성
				} else {
					otherData += rowData+"\n";//관련없는 데이터를 otherData에 누적
				}
			} else {
				break; // while문 종료
			}
		}
		if(myData.equals("")) {
			System.out.println("아이디를 확인해주세요.");
			return;
		}
		File file = new File(path);
		FileWriter fw = new FileWriter(file,false);//덮어쓰기 용도로 false사용
		fw.write(otherData+myData);
		fw.close();
		
		System.out.println(id+"님의 계좌에서 "+money+"원이 출금되었습니다.");
	}
	
	public static void bankSearch() throws Exception {
		Scanner scn = new Scanner(System.in);
		String path = "c:/html_test/money.txt"; // 저장파일 경로
		
		// 물리적인 위치로의 전환(인식) 관련 클래스
		FileReader fr = new FileReader(path);
		// 물리적인 파일 내용 확인 클래스
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("\n\n[ 출금화면 ] \n");
		System.out.print("아이디 >>");
		String id = scn.next();
		
		String rowData = "";	//읽어들인 한줄을 저장
		String myData = "";		//사용자가 입력한 Id와 Money의 세팅
		
		while(true) {
			if((rowData = br.readLine()) != null) {
				if((rowData.indexOf(id+":")) >- 1) {
					
					String[] str = rowData.split(":");//id와 money 분리					
					myData = id+"님의 잔액은 "+str[1]+"입니다.";//사용자가 입력한 구성
					
					System.out.println(myData);
					return;
				}
				
			} else {
				break; // while문 종료
			}
		}
		if(myData.equals("")) {
			System.out.println("아이디를 확인해주세요.");
			return;
		}	
	}	
	
	public static void main(String[] args) throws Exception {
		System.out.println("1.입금 2.출금 3.잔액");
		Scanner scn = new Scanner(System.in);
		System.out.print("번호선택 >>");
		int nn = scn.nextInt();
		
		if(nn == 1) {
			bankPlus();
		} else if(nn == 2) {
			bankMinus();
		} else {
			bankSearch();
		}
	}	
}
