package study14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class IOTest4Teacher {

	public static void bankPlus() throws Exception {
		Scanner scn = new Scanner(System.in);
		String path = "c:/html_test/money.txt"; // 저장파일 경로
		
		FileReader fr = new FileReader(path);
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
					System.out.println(str[1]);
					sumMoney = money + Integer.parseInt(str[1]);
					System.out.println(sumMoney);
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
		
		FileReader fr = new FileReader(path);
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
					sumMoney = Integer.parseInt(str[1]) - money;
					if(sumMoney>=0) {
						myData = id+":"+sumMoney;//사용자가 입력한 구성
					}else {
						myData = id+":"+Integer.parseInt(str[1]);
						System.out.println("잔액이 부족합니다.");
						break;
					}
					
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
		
		System.out.println(id+"님의 계좌에 "+money+"원이 출금되었습니다.");
		
	}
	
	public static void bankSearch() {
		// TODO Auto-generated method stub
		
	}	
	
	public static void main(String[] args) throws Exception {
		System.out.println("1.입금 2.출금 3.잔액");
		Scanner scn = new Scanner(System.in);
		System.out.print("번호선택 >>");
		int number = scn.nextInt();
		switch(number) {
			case 1 : bankPlus();
				break;
			case 2 : bankMinus();
				break;
			case 3 : bankSearch();
				break;
		}
	}	
}
