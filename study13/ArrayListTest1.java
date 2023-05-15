package study13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest1 {

	public static void main(String[] args) {
		List<String>list1 = new ArrayList<String>();
		list1.add("50");
		list1.add("60");
		list1.add("70");
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println("list1 저장된 객체 수 : "+list1.size());
		//System.out.println(list1.get(10)); //주석 풀면 익셉션 에러
		
		List<String>list2 = new ArrayList<String>();
		list2.add("80");
		list2.add("90");
		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		list2.remove(0);
		System.out.println(list2.get(0));
		System.out.println("list1 저장된 객체 수 : "+list2.size());
		//System.out.println(list2.get(1)); //주석 풀면 error
		
		List<String>list3 = new ArrayList<String>();
		list3.add(0,"10");
		list3.add(1,"20");
		list3.add(2,"30");
		
		System.out.println(list3.get(0));
		System.out.println(list3.get(1));
		//System.out.println(list3.get(3)); //주석풀면 error
		
		for(int i=0;i<list3.size();i++) {
			System.out.println(i+":"+list3.get(i));
		}
	}
}
