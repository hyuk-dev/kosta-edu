package mvc.controller;

import java.util.List;

import mvc.dto.Electronics;
import mvc.exception.SearchNotFoundException;
import mvc.service.ElectronicsService;
import mvc.service.ElectronicsServiceImpl;
import mvc.view.FailView;
import mvc.view.SuccessView;



/**
 * View와 Model 사이에서 중간 역할 
 *  : 사용자의 요청을 받아서 그에 해당하는 서비스를 호출하고
 *    호출한 결과를 받아서 결과값에 따라 결과 뷰를 호출해준다.
 */

public class ElectronicsController {
	 private ElectronicsService service = ElectronicsServiceImpl.getInstance();

    /**
     * 전체검색
     */
    public void selectAll() {
		// 서비스 호출하고 그 결과에 따라 성공 or 실패
    	List<Electronics> list = service.selectAll();
    	SuccessView.printAll(list);
    	
    }
 

	 /**
     * 전자제품 등록 
     */
   
    public void insert(Electronics electronics) {
    	try {
    	       service.insert(electronics);	
    	       SuccessView.printMessage("등록 성공!");
    	} catch (Exception e) {
    		FailView.errorMessage(e.getMessage());
    	}
    }
    
    

    /**
     * 모델번호에 해당하는 전자제품 검색
     * @param modelNo
     */
    public void searchByModelNo(int modelNo) {
    	try {
        	Electronics electronics = service.searchByModelNo(modelNo);	
        	SuccessView.printSearchByModelNo(electronics);
    	} catch (SearchNotFoundException e) {
    		FailView.errorMessage(e.getMessage());
    	}
    } 

    /**
     * 모델번호에 해당하는 전자제품 수정하기 
     * @param electronics
     */
    public void update(Electronics electronics) {
    	try {
    		service.update(electronics);
    		SuccessView.printMessage("수정 성공!");
    	} catch(SearchNotFoundException e) {
    		FailView.errorMessage(e.getMessage());
    	}
    }
    
    /**
     * 모델번호에 해당하는 전자제품 삭제하기 
     * @param electronics
     */
	public void deleteModelNo(int modelNo) {
		try {
			service.delete(modelNo);
			SuccessView.printMessage("삭제 완료!");
		} catch(SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
     *  가격을 기준으로 정렬하기
     *  만약, 가격이 같으면 modelNo를 기준으로 정렬한다.
     * @return
     */
    public void selectSortByPrice() {
    	SuccessView.printAll(service.selectSortByPrice());
    }
    
    /**
     * 모델번호 기준으로 역순 정렬
     */
    public void selectSortByReverseModelNo() {
    	SuccessView.printAll(service.selectSortByReverseModelNo());
    }
    
    /**
     *모델 이름 기준으로 정렬 
     */
    public void selectSortByModelName() {
    	SuccessView.printAll(service.selectSortByModelName());
    }
    
    /**
     * 로또 번호 추출 
     */
    public void getLottoNums() {
    	SuccessView.printSet(service.getLottoNums());
    }
}











