package study14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class PostTest {
	
	public static void main(String[] args) throws Exception {
		System.out.println("검색할 지역을 입력해주세요.");
		Scanner scn = new Scanner(System.in);
		String nn = scn.next();
		
		String inputFile = "c:\\html_test\\korea\\"+nn+"_info.txt";
		
		File file100 = new File(inputFile);
		if(file100.exists()) {
			System.out.println("이미 생성된 파일 입니다.");
			return;
		}		
		
		String path = "c:/html_test/post1.csv"; // 저장파일 경로
		
		// 물리적인 위치로의 전환(인식) 관련 클래스
		FileReader fr = new FileReader(path);
		// 물리적인 파일 내용 확인 클래스
		BufferedReader br = new BufferedReader(fr);
		
		String rowData = "";	//읽어들인 한줄을 저장
		String tempData = "";
		
		while(true) {
			if((rowData = br.readLine()) != null) {
				if((rowData.indexOf(nn)) >- 1) {
					tempData += rowData+"\n";
				}
			} else {
				break; // while문 종료
			}
		}
		
		File file1 = new File(inputFile);
		FileWriter fw = new FileWriter(file1,true);						
		fw.write(tempData);
		fw.close();
		System.out.println("생성완료");
		
	}	
}
