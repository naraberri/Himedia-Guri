package study14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class IOTest3Teacher {

	public static void main(String[] args) throws Exception {
		
		String inputFile = "c:\\html_test\\flight_info.txt";
		
		File file100 = new File(inputFile);
		if(file100.exists()) {
			System.out.println("이미 생성된 파일 입니다.");
			return;
		}
		
		String path = "c:/20141125";
		File file = new File(path); //파일경로 인지
		File[] names = file.listFiles(); //파일정보 가져옴
		for(int i=0;i<names.length;i++) {
			// 폴더 내의 파일관련 정보에서 파일명을 가져옴
			String fileName = names[i].getName();
			//변수 값으로 정의된 파일명을 실제 물리적인 파일로 인식시킴
			FileReader file1 = new FileReader(path+"/"+fileName);
			//물리적인 파일을 위치시켜 내용을 읽어들일 수 있는 클래스를 정의함
			BufferedReader buffer = new BufferedReader(file1);
			String rowData = "";
			int cnt = 0;
			while(true) {
				if((rowData = buffer.readLine()) != null) {
					cnt++;
					if(cnt == 5) {
						String[] str = rowData.split("/");
						System.out.println(str[1]);
						File file2 = new File(inputFile);						
						FileWriter fw = new FileWriter(file2,true);
						fw.write(str[1]+"\n");
						fw.close();												
					}
				} else {
					break;
				}
			}
		}
		System.out.println("생성완료");
	}
}
