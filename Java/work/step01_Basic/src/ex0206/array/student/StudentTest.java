package ex0206.array.student;

public class StudentTest {
	public static void main(String[] args) {
		System.out.println("***학생 관리 프로그램 시작합니다.******");
		
		String [][] data = new String [][] {
			{"동혁", "29", "부산"},
			{"가혁", "30", "마산"},
			{"나혁", "31", "진산"},
			{"다혁", "32", "고산"},
			{"라혁", "33", "가산"},
		};
		
		
		StudentService service = new StudentService();//StudentService의 전역변수들이 초기화 
		service.init(data); // 초기치데이터 세팅
		
		
		
		//전체학생정보 출력
		Student[] stArr = service.selectAll();
		StudentEndView.printSelectedAll(stArr);
		
		//등록하기
		System.out.println("--1. 등록하기 -----");
		Student student = new Student();
		student.setName("미미");
		student.setAge(25);
		student.setAddr("오리역");
		
		int result = service.insert(student);
		if(result ==0) StudentEndView.printMessage(student.getName()+"중복입니다. 실패");
		else if(result==-1) StudentEndView.printMessage("인원 초과하여 등록할 수 없습니다.");
		else StudentEndView.printMessage("성공적으로 등록되었습니다.");
		
		System.out.println("--2. 전체검색 ----");
		StudentEndView.printSelectedAll(stArr);
		
		
		//이름으로 검색하기
		System.out.println("--3. 이름으로 검색 -----");
		Student existedStudent = service.selectByName("가혁");
		if(existedStudent == null) {
			StudentEndView.printMessage("검색 결과가 없습니다.");
			
		} else {
			StudentEndView.printSelectByName(existedStudent);
		}
		
		System.out.println("--이름이 없는경우----");
		existedStudent = service.selectByName("삼순이");
		if(existedStudent == null) {
			StudentEndView.printMessage("검색 결과가 없습니다.");
			
		} else {
			StudentEndView.printSelectByName(existedStudent);
		}
		
		//수정하기 
		System.out.println("--4. 수정하기 -----");
		Student st2 =new Student();
		st2.setName("가혁");//조건
		st2.setAge(23);
		st2.setAddr("대전");
		
		if(service.update(st2)) {
			StudentEndView.printMessage(st2.getName() + "님의 정보를 업데이트 완료!");
		} else {
			StudentEndView.printMessage("업데이트 실패!");
		}
		
		
		System.out.println("---변경후 ---");
		StudentEndView.printSelectedAll(stArr);

	}

}








