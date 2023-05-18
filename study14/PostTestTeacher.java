package study14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class PostTestTeacher {
	
	public static void main(String[] args) throws Exception {		
		
		String path = "c:/html_test/post1.csv"; // 저장파일 경로
		String savePath = "c:/html_test/post_gurisi.txt";
		
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String searchWord = "구리시";
		String rowData = "";
		String saveData = "";
		
		while(true) {
			if((rowData = br.readLine()) != null) {
				if((rowData.indexOf(searchWord)) > -1) {
					saveData += rowData+"\n";
				}
			} else {
				break; // while문 종료
			}
		}
		
		File file = new File(savePath);
		FileWriter fw = new FileWriter(file);
		fw.write(saveData);
		fw.close();
		System.out.println("데이서 저장 성공");
	}	
}
