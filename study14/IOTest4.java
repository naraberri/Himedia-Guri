package study14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class IOTest4 {

	public static void main(String[] args) throws Exception {
		String path = "C:\\html_test";
		File file = new File(path); //파일경로 
		File[] names = file.listFiles(); //파일정보 가져옴
		String fileName = "BankDump.txt";
		String inputFile = "C:\\html_test\\bank.txt";
		System.out.println("1.입금 2.출금 3.잔액");
		
		Scanner scn = new Scanner(System.in);
		System.out.print("번호선택 >>");
		int number = scn.nextInt();
		
		if(number == 1) {
			System.out.println("1.입금");
			System.out.print("아이디 >>");
			String userid = scn.next();
			System.out.print("입금액 >>");
			int money = scn.nextInt();
			FileReader file1 = new FileReader(path+"/"+fileName);
			BufferedReader buffer = new BufferedReader(file1);
			String rowData = "";
			while(true) {
				if((rowData = buffer.readLine()) != null) {
					if((rowData.indexOf(userid+":")) >- 1) {
						String[] str = rowData.split(":");
						money += Integer.parseInt(str[1]);
						rowData = userid+":"+money;
					} else {
						
					}
									
				} else {
					break;
				}
			
			}
		}	
	}
}

