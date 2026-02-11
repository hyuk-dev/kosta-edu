package ex0211.overriding.goods;

public enum InsertResult {
	/**
	 * 상품 코드 중복되었을 때
	 */
	INSERT_DUPLICATE, // eclipse에서 static은 자동으로 기울어짐
	
	/**
	 * 배열의 길이를 벗어났을 때
	 */
	INSERT_OUTOFINDEX,
	
	/**
	 * 등록이 완료되었을 때
	 */
	INSERT_SUCCESS;
	
}
