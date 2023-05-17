package study14;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class DirList {

	public static void main(String[] args) throws IOException {
		// 파일 및 폴더를 인지하는 클래스
		File dir = new File("c:\\html_test");
		/*
		if(dir.exists()==false) dir.mkdirs();
		File file1 = new File("c:\\html_test\\test.txt");
		if(file1.exists()==false) file1.createNewFile();
		*/
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		//	특정 디렉토리(폴더)안의 정보들을 가져옴
		File[] names = dir.listFiles();
		for(int i=0; i<names.length;i++) {
			//	디렉토리 여부 확인
			if(names[i].isDirectory()) {
				System.out.print("<폴더> ");
			} else {
				System.out.print("<파일> ");
			}
			
			System.out.print(names[i].getName()+"\t\t");
			System.out.print(names[i].length()+"\t");
			System.out.println(df.format(names[i].lastModified()));
		}
	}
}
