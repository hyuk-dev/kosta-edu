package mvc.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;

import mvc.comparator.ModelNameComparator;
import mvc.dto.Electronics;
import mvc.exception.DuplicateModelNoException;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 */

public class ElectronicsServiceImpl implements ElectronicsService {
	
	private static ElectronicsService instance = new ElectronicsServiceImpl(); 
    private static final int MAX_SIZE=6;
    List<Electronics> list = new ArrayList<Electronics>();
    Set<Integer> set = new TreeSet<>((a, b) -> b - a);
    
    
    /** 
     * 외부에서 객체 생성안됨. 
     * InitInfo.properties파일을 로딩하여  List에 추가하여
     * 초기치 데이터를 만든다.
     * 
     */
    private ElectronicsServiceImpl() {
    	System.out.println("**private constructor init.....");
    	ResourceBundle rb = ResourceBundle.getBundle("InitInfo");//InitInfo.properties
        for(String key : rb.keySet()) {
     	  String value =  rb.getString(key); //100,\uC120\uD48D\uAE30,35000,\uC0BC\uC131 \uC120\uD48D\uAE30
     	   String data[] = value.split(",");
     	   //System.out.println(key +" = " + value);
     	  
     	     list.add(new Electronics( Integer.parseInt(data[0]) ,data[1],   
     	    		 Integer.parseInt( data[2]), data[3]) );
     	  
        }
        
        System.out.println(list);
      
    }
    
    public static ElectronicsService getInstance() {
		return instance;
	}

	@Override
	public void insert(Electronics electronics) 
			  throws ElectronicsArrayBoundsException, DuplicateModelNoException {
		if(list.size() >= MAX_SIZE) {
			throw new ElectronicsArrayBoundsException("배열의 길이를 벗어나 더이상 등록할 수 없습니다.");
		}
		
		boolean duplicated = false;
		// 기존 searchByModelNo 활용하려고 했더니 예외처리가 어려움 
		for(Electronics e : list) {
			if(e.getModelNo() == electronics.getModelNo()) {
				duplicated = true;
			}
		}
		
		if(duplicated) {
			throw new DuplicateModelNoException("중복된 전자제품입니다.");
		}
		list.add(electronics);
		
	}

	@Override
	public List<Electronics> selectAll() {
		return list;
	}

	@Override
	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
		for(Electronics e : list) {
			if(e.getModelNo() == modelNo) {
				return e;
			}
		}
		// TODO 예외 던져야함
		throw new SearchNotFoundException("해당 모델을 찾을 수 없습니다.");
	}

	@Override
	public void update(Electronics electronics) throws SearchNotFoundException {
		// 찾는다
		for(Electronics e : list) {
			if(e.getModelNo() == electronics.getModelNo()) {
				// 업데이트 한다
				e.setModelDetail(electronics.getModelDetail());
				return;
			}
		}
		
		// 없다면 에러 던진다.
		throw new SearchNotFoundException("해당 모델을 찾을 수 없습니다.");
		
		
	}

	@Override
	public void delete(int modelNo) throws SearchNotFoundException {
		// 찾는다
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getModelNo() == modelNo) {
				// 삭제한다
				list.remove(i);
				return;
			}
		}
		throw new SearchNotFoundException("해당 모델을 찾을 수 없습니다.");
		
	}

	@Override
	public List<Electronics> selectSortByPrice() {
		List<Electronics> shallowList = new ArrayList<>(list);
		Collections.sort(shallowList);
		return shallowList;
	}

	@Override
	public List<Electronics> selectSortByReverseModelNo() {
		List<Electronics> shallowList = new ArrayList<>(list);
		Collections.sort(shallowList, (a, b) -> b.getModelNo() - a.getModelNo());
		return shallowList;
	}

	@Override
	public List<Electronics> selectSortByModelName() {
		List<Electronics> shallowList = new ArrayList<>(list);
		Collections.sort(shallowList, new ModelNameComparator());
		return shallowList;
	}

	@Override
	public Set<Integer> getLottoNums() {
		set.clear(); // 한 번 초기화.
		while(set.size() < 6) {
			set.add((int)(Math.random()*45)+1);
		}
		return set;
	}
	
	
	
	
    
} // 클래스 끝 

