package study14;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("userId >>");
		String userid = scn.next();
		
		System.out.println("userPass >>");
		String pass = scn.next();
		
		String txt = userid+"/"+pass+"\n";
		String fileName = "C:\\html_test\\member_info12.txt";
		try {
			File file = new File(fileName);
			//	input 클래스
			FileWriter fw = new FileWriter(file,true);	//파일생성 및 이어쓰기
			//FileWriter fw = new FileWriter(file,false);	//파일생성 및 덮어쓰기
			//	input
			fw.write(txt+"\n");
			System.out.println("input success");
			fw.close();
		} catch (Exception e) {
			System.out.println("생성 실패");
		}
		
		
	}
}
