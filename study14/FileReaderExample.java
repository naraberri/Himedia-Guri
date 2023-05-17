package study14;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderExample{

	public static void main(String[] args) throws Exception  {
		//	특정 파일을 인지하는 클래스.가져오는 능력은 없음
		FileReader file = new FileReader("C:\\html_test\\test.txt");
		//	파일안의 내용을 읽어드리는 클래스.
		BufferedReader buffer = new BufferedReader(file);
		String rowData = "";
		while(true){
			if( (rowData = buffer.readLine()) != null ){//끝에 다다르면 break를 통해 종료함
				System.out.println(rowData);
			} else {
				break;
			}
		}
		file.close();//읽어드린 파일을 종료. 메모리 낭비를 방지하기 위해 쓰는게 좋음
	}
}
