package study13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//풀어보기 3
public class BoardListMap {

	public static void main(String[] args) {
		List<Map> list = new ArrayList<Map>();
		Map<String,String> board = new HashMap<String,String>();
		
		board.put("no", "1");
		board.put("hit", "35");
		board.put("rdate", "2021-05-01");
		board.put("name", "홍길동");
		board.put("title", "공지사항1");
		list.add(board);
		
		board = new HashMap<String,String>();
		
		board.put("no", "2");
		board.put("hit", "3");
		board.put("rdate", "2021-05-05");
		board.put("name", "제임스");
		board.put("title", "공지사항2");
		list.add(board);
		
		//풀어보기 4
		Map<String,String> map = new HashMap<String,String>();//리스트 값을 넣을 Map생성
		int read = 0;// 총 조회수를 넣을 변수
		
		for(int i=0; i<list.size();i++) {
			map = list.get(i);
			Iterator<String> keys = map.keySet().iterator();
			while(keys.hasNext()) {
				String key = keys.next();
				String value = map.get(key);
				if(key.equals("rdate")) {
					list.get(i).put(key,value.replace("-", ""));//-를 없애고 다시 map에 넣음
				} else if(key.equals("hit")) {//풀어보기 5
					int temp = Integer.parseInt(value);//조회수를 추가하기 위한 임시값을 넣을 변수
					temp += 100;
					read += temp;
					list.get(i).put(key,Integer.toString(temp));//조회수를 100씩 더한값을 다시 넣음
				}
			}
			System.out.println(list.get(i));
		}
		//풀어보기 6
		System.out.println("총 조회수 :"+read+" 조회수 평균 :"+read/list.size());
	}	
}
