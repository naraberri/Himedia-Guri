package study13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapTest2 {

	public static void main(String[] args) {
		//풀어보기 1
		Map<String,String>map = new HashMap<String,String>();
		
		map.put("영어", "100");
		map.put("국어", "80");
		map.put("수학", "90");
		
		String key = "";
		String value = "";
		String failed = "";
		int result = 0;
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			key = keys.next();
			value = map.get(key);
			result += Integer.parseInt(value);
		}
		System.out.println("총점 : "+result);
		System.out.println("평균 : "+result/3);
		System.out.println();
		
		//풀어보기 2
		Map<String,String>map1 = new HashMap<String,String>();
		
		map1.put("영어", "50");
		map1.put("국어", "40");
		map1.put("수학", "70");
		
		double result1 = 0;
		int temp = 0;
		String avg;
		Iterator<String> keys1 = map1.keySet().iterator();
		while(keys1.hasNext()) {
			key = keys1.next();
			value = map1.get(key);
			temp = Integer.parseInt(value);
				if(temp<60) {
					failed += key+",";
				}
			result1 += Double.parseDouble(value);			
		}
		
		avg = String.format("%.1f", result1/map1.size());
		System.out.println("총점 : "+(int)result1);
		System.out.println("평균 : "+avg);
		System.out.println("낙제과목 : "+failed);
		System.out.println();
		
		//풀어보기3
		Map<String,String>map2 = new HashMap<String,String>();
		
		map2.put("이름", "홍길동");
		map2.put("영어", "90");
		map2.put("국어", "10");
		map2.put("수학", "70");
		
		key = "";
		value = "";
		result = 0;
		
		Iterator<String> keys2 = map2.keySet().iterator();
		while(keys2.hasNext()) {
			key = keys2.next();
			value = map2.get(key);
			if(key.equals("이름")) {
				
			} else {
				if(key.equals("국어")) {
					map2.put("국어", "80");
					value = "80";
				}
				result += Integer.parseInt(value);
			}
			
		}
		System.out.println("총점 : "+result);
		System.out.println("평균 : "+result/(map2.size()-1));
		System.out.println();
		
		//풀어보기4
		List<String> list1 = new ArrayList<String>();
		
		list1.add("50");
		list1.add("60");
		list1.add("70");
		
		int result2 = 0;
		
		for(int i=0; i<list1.size();i++) {
			result2 += Integer.parseInt(list1.get(i));
		}
		System.out.println("총점 : "+result2);
		System.out.println("평균 : "+result2/list1.size());
	}
}
