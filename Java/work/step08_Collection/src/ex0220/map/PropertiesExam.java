package ex0220.map;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesExam {

	Properties pro = new Properties();
	public PropertiesExam() {
		// 직접 저장
		pro.setProperty("id", "hyuk");
		pro.setProperty("age", "10");
		pro.setProperty("addr", "서울");
		
		// 모든 키 정보 가져오기
		for (String key : pro.stringPropertyNames()) {
			// 저장된 정보 조회
			String value = pro.getProperty(key);
			System.out.println(key + " = " + value);
		}
		
	} // 생성자 끝
	
	/////////////////////////////////////////////////////
	/**
	 * 외부의 ~.properties파일을 로딩하는 방법 2가지
	 * 1) IO를 이용한 방법
	 * 2) ResourceBundle을 이용한 방법
	 */
	
	// 1) IO를 이용한 방법
	public void test01() throws Exception {
		System.out.println("=======================");
		pro.clear(); // 초기화
		
		//FileInputStream은 기본적으로 src부터 읽는다.
//		pro.load(new FileInputStream("src/ex0220/map/info.properties"));
		
		//1. 파일의 위치의 기준 프로젝트가 기준!-경로설정할때 src기준...
	 	/*InputStream inputStream = 
	 			new FileInputStream("src/ex0729/map/dbInfo.properties");
	    pro.load(inputStream);*/
	    
	 
	    //2. 클래스 위치한 패키지 내에서 파일 로딩할때 - / 생략(상대경로)
		// PropertiesExam.class 클래스가 있는 위치(폴더)가 기준이된다.
//		   InputStream inputStream =
//		   PropertiesExam.class.getResourceAsStream("info.properties");
//		   pro.load(inputStream);
	
		 //3.클래스 위치한 패키지 내에서 파일 로딩할때 - / 생략(상대경로)
//		 InputStream inpupStream = 
//		this.getClass().getResourceAsStream("info.properties"); 
//		 pro.load(inpupStream);
		  
	
		 //4.ClassLoader의 모든 경로에서 파일 읽음. 보통 resources 폴더의 파일 읽을때 사용.
		 InputStream inpupStream = 
//		this.getClass().getClassLoader().getResourceAsStream("a.properties"); 
		this.getClass().getClassLoader().getResourceAsStream("ex0220/map/info.properties"); 
		 pro.load(inpupStream);
//		 
	
		
		// 모든 키 정보 가져오기
		for (String key : pro.stringPropertyNames()) {
			// 저장된 정보 조회
			String value = pro.getProperty(key);
			System.out.println(key + " = " + value);
		}
	}
	
	// 2) ResourceBundle을 이용한 방법
	public void test02() {
		
		// ResourceBundle은 ~.properties파일을 로딩하는 전용 클래스
		ResourceBundle rb = ResourceBundle.getBundle("a"); // classes 폴더를 기준으로 a.properties로딩
		for(String key : rb.keySet()) {
			String value = rb.getString(key);
			System.out.println(key+" = "+value);
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		PropertiesExam pe = new PropertiesExam();
//		pe.test01();
		System.out.println("---------");
		pe.test02();
	}

}
