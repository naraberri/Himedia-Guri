package study14;

import java.io.File;

public class FIleDelete {

	public static void main(String[] args) {
		String path = "C:\\html_test\\member_info12.txt";
		File file = new File(path);
		// exists() : 존재여부
		if( file.exists() ) {
			file.delete();//	파일 및 폴더 삭제
			System.out.println("삭제성공");
		}
		//file.mkdir();	// 폴더 생성
	}
}
