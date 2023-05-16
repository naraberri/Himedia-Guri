package study13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JumsuArray {

	public static void main(String[] args) {
		List<Map> list1 = new ArrayList<Map>();
		Map<String,String> map1 = new HashMap<String,String>();
		
		map1.put("id", "test1");
		map1.put("eng", "90");
		map1.put("kor", "80");
		map1.put("math", "84");
		list1.add(map1);
		
		map1 = new HashMap<String,String>();//주석을 풀어야 정상가동
		//맵을 초기화 하지 않을 경우 이미 들어가 있는 같은 키의 값들을 변화시킴
		//리스트는 맵의 저장 위치를 가지게 되는데 새로 만들지 않을 경우 기존 값을 변화 시키므로
		
		map1.put("id", "test2");
		map1.put("eng", "80");
		map1.put("kor", "82");
		map1.put("math", "90");
		list1.add(map1);
		
		System.out.println("list 전체: "+list1);
		System.out.println("list 행 길이: "+list1.size());
		System.out.println("list 1행: "+list1.get(0));
		System.out.println("list 2행: "+list1.get(1));
		System.out.println("list 1행 길이: "+list1.get(0).size());
		System.out.println("list 2행 길이: "+list1.get(1).size());
		System.out.println();
		
		//풀어보기 1		
		for(int i=0; i<list1.size();i++) {
			System.out.println((i+1)+"행 : "+list1.get(i));
		}
		System.out.println();		

		//풀어보기 2
		Map<String,String> map2 = new HashMap<String,String>();// list값을 넣을 맵 생성
		
		for(int i=0; i<list1.size();i++) {
			map2 = list1.get(i);
			Iterator<String> keys = map2.keySet().iterator();
			while(keys.hasNext()) {
				String key = keys.next();
				String value = map2.get(key);
				System.out.println(key+":"+value);				
			}
		}
		System.out.println();
		
		//풀어보기 2
		Map<String,String> map3 = new HashMap<String,String>();// list값을 넣을 맵 생성
		
		for(int i=0; i<list1.size();i++) {
			map3 = list1.get(i);
			for (String key : map3.keySet()) {
				String value = map3.get(key);
				System.out.println(key+":"+value);
			}
		}
		System.out.println();		
	}
}
