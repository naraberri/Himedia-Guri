package study14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class IOTest3 {

	public static void main(String[] args) throws Exception {
		String fileName = "C:\\html_test\\number.txt";
		String path = "C:\\20141125\\";
		File dir = new File(path);
		File[] names = dir.listFiles();
		for(int i=0; i<names.length;i++) {			
			FileReader file = new FileReader(path+names[i].getName());
			//	파일안의 내용을 읽어드리는 클래스.
			BufferedReader buffer = new BufferedReader(file);
			String rowData = "";
			int cnt = 0; // 5번째 라인을 찾기위한 변수
			while(true){
				if( (rowData = buffer.readLine()) != null ){
					cnt++;					
					if(cnt == 5) {				
						String[] temp = rowData.split("/");
						File file1 = new File(fileName);
						FileWriter fw = new FileWriter(file1,true);						
						fw.write(temp[1]+"\n");
						System.out.println("input success");
						fw.close();
					}
				} else {
					break;
				}
			}
			file.close();
		}		
	}
}
