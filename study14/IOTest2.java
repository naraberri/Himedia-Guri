package study14;

import java.io.File;

public class IOTest2 {

	public static void main(String[] args) {
		String path = "c:\\Temp";
		File dir = new File(path);
		File[] names = dir.listFiles();
		
		for(int i=0; i<names.length;i++) {
			if(names[i].getName().contains(".java") == true) {
				System.out.println(names[i].getName());
			}
		}
		
		
	}
}
