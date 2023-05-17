package study14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("userId >>");
		String userid = scn.next();
		
		System.out.println("userPass >>");
		String pass = scn.next();
		
		String txt = userid+"/"+pass+"\n";
		String fileName = "C:\\html_test\\test101.txt";
		try {
			File file = new File(fileName);
			//	input 클래스
			FileWriter fw = new FileWriter(file,true);	//파일생성 및 이어쓰기
			//FileWriter fw = new FileWriter(file,false);	//파일생성 및 덮어쓰기
			//	input
			fw.write(txt+"\n");
			System.out.println("생성 성공");
			fw.close();
		} catch (Exception e) {
			System.out.println("생성 실패");
		}
		
		String fileName2 = "C:\\html_test\\test102.txt";
		
		FileReader fr1 = new FileReader(fileName);
		BufferedReader br1 = new BufferedReader(fr1);
		String rowData = "";
		
		while(true) {
			if((rowData = br1.readLine())!=null) {
				File file2 = new File(fileName2);
				FileWriter fw = new FileWriter(file2,true);
				fw.write(rowData+"\n");
				fw.close();
			}else {
				break;
			}
		}
	}
}
