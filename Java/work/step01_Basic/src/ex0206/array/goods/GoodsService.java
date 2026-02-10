package ex0206.array.goods;
/**
  각 요청에 대한 로직(기능)을 담당할 클래스
  (등록 , 전체검색, 부분검색, 수정, 삭제 등등.....)
*/
public class GoodsService{

	//상품을 관리할 배열 선언
	private Goods [] goodsArr = new Goods [10];
	public static int count;//0 배열방에 저장 객체의 개수 



   /**
      초기치 데이터를 세팅하는 메소드
	  String [][] data = new String [][]{
			 {"A01" , "새우깡" , "2500" , "짜고 맛나다."},  //---> Goods 
			 {"A02" , "고구마깡" , "3500" , "고구맛이고 달다."},  //---> Goods 
			 {"A03" , "감자깡" , "5000" , "감자맛에 고소한맛."}, // ---> Goods 
			 {"A04" , "허니버터칩" , "2200" , "달콤 하다."},
			 {"A05" , "콘칩" , "3000" , "고소하다."}
			 
		};
   */
   public void init(String [][] data){
	 for(int i=0; i<data.length; i++) {
		 goodsArr[count++] = create(data[i]);
	 }
	   

   }//메소드끝


   /**
      Goods를 생성해서 값을 설정하고 생성된 Goos를 리턴하는 메소드 
   */
   private Goods create(String [] row){//{"A01" , "새우깡" , "2500" , "짜고 맛나다."}
         Goods g = new Goods();    
         g.setCode(row[0]);
         g.setExplain(row[3]);
         g.setName(row[1]);
         g.setPrice(Integer.parseInt(row[2]));
         return g;
   }





   /**
     등록(등록실패 - 중복인경우, 배열의 길이 벗어난경우)
	 @return : 
			 0이면 상품코드 중복 ,
			 1이면 등록성공, 
			 -1이면 배열의 길이 벗어남
   */
   public int insert(Goods goods){

	   // 배열의 길이 체크
	   if(count >= goodsArr.length) {
		   return -1;
	   }

	   //중복체크 - selectByCode 활용
	   if(selectByCode(goods.getCode()) != null) {
		   return 0;
	   }
	   
	   
	   //등록
	   goodsArr[count++] = goods;
	   return 1;
   }


   /**
     전체검색
   */
   public Goods[]  selectAll( ){
     
      return goodsArr;//
   }

   /**
     상품코드에 해당하는 상품 검색
	 @return : 만약 code에 해당하는 값이 있으면 Goods를 리턴하고
	           없으면 null 리턴
   */
   public Goods selectByCode(String code){
	   String upperCode = code.toUpperCase();
       for(int i=0; i<count; i++) {
    	   if(goodsArr[i].getCode().equals(upperCode)) {
    		   
    		   return goodsArr[i];
    	   }
       }
       
       return null;
   }


   /**
    상품코드에 해당하는 가격, 설명 수정하기 
	@return : true이면 수정완료, false이면 수정실패
   */
   public boolean update(Goods goods){ //수정하려는 코드, 변경값 - 가격, 설명
      Goods existedGoods = selectByCode(goods.getCode());
	   if(existedGoods != null) {
    	  // 수정 로직
    	  existedGoods.setPrice(goods.getPrice());
    	  existedGoods.setExplain(goods.getExplain());
    	  return true;
      }
       return false;
   }
   
   /**
    * 상품코드에 해당하는 상품 삭제하기
    * @return : true 이면 삭제완료, false 이면 삭제 실패
    */
   public boolean delete(String code) {
	   System.out.println("-- 삭제 메서드 호출 -- ");
	   int index = this.findLocate(code);
	   if(index == -1) return false;
	   
	   goodsArr[index] = null;

	   // 이후에 있는 배열 요소들을 한칸씩 앞으로 이동하기.
	   for(int i=index;i<count-1;i++) {
		   goodsArr[i] = goodsArr[i+1];
	   }
	   goodsArr[--count] = null;
	   return true;

   }
   
   private int findLocate(String code) {
	   Goods existedGoods = selectByCode(code);
	   if(existedGoods == null) return -1;
	   int index = 0;
	   // 해당하는 배열 요소 찾아서 제거 (null로)
	   for(int i=0; i<count; i++) {
		   if(goodsArr[i].getCode().equals(existedGoods.getCode())) {
			   index = i;
		   }
	   }
	   return index;
   }
}