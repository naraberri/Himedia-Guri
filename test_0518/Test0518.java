package test_0518;

import java.util.Scanner;

public class Test0518 {

	public static void main(String[] args) throws Exception {
		UserModify um = new UserModify();
		while(true) {
			System.out.println("1.등록 2.목록. 3.상세 4.삭제");
			Scanner scn = new Scanner(System.in);
			String number = scn.next();		
			
			if(number.equals("1")) {
				um.saveUser();
				break;
			}else if(number.equals("2")) {
				um.listUser();
				break;
			}else if(number.equals("3")) {
				um.lookUser();
				break;
			}else if(number.equals("4")) {
				um.deleteUser();
				break;
			}else {
				System.out.println("번호를 확인해주세요.");
			}
		}
	}
}
