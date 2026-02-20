package ex0220.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExam {

	Map<Integer, String> map = new TreeMap<Integer, String>(); 
	/**
	 *  - 맵은 중복일 때 덮어쓰기
	 *  HashMap은 키 정렬 순서 상관없음.
	 */
	
	public MapExam() {
		//map에 추가
		map.put(7, "혁");
		map.put(1, "가혁");
		map.put(23, "나혁");
		map.put(5, "다혁");
		map.put(15, "라혁");
		map.put(7, "혁2");
		
		System.out.println("저장된 개수 = " + map.size());
		System.out.println(map);
		
		// map에 들어있는 key, value 꺼내기 (key와 value의 한쌍 = Entry)
		
		//모든 key의 정보를 가져온다.
		Set<Integer> keySet = map.keySet(); // key들만 먼저 조회
		Iterator<Integer> it = keySet.iterator(); // key를 꺼내기 위한 사전작업
		
//		while(it.hasNext()) { // 다음 요소가 있다면
//			int key = it.next(); //  요소를 꺼낸다
//			String value = map.get(key); // 꺼낸 key에 해당하는 value를 조회
//			System.out.println(key + " 와 " + value);
//		}
//		
		System.out.println("----개선된 for 문 사용----");
		for(Integer key : map.keySet()) {
			String value = map.get(key); // 꺼낸 key에 해당하는 value를 조회
			System.out.println(key + " 와 " + value);
		}
		
		System.out.println("----Entry 형태로 조회하기----");
		Set<Entry<Integer, String>> set = map.entrySet();
		for(Entry<Integer, String> e : set) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		//삭제
		map.remove(1);
		
		System.out.println("삭제 후 = " + map);
		
	}
	
	public static void main(String[] args) {
		new MapExam();
	}

}
