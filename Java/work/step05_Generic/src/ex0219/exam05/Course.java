package ex0219.exam05;

/**
 * 강좌를 등록하는 객체
 */
public class Course {
	/**
	 * 모든 사람 허용 (등록)
	 */
	public void register01(Applicant<?> applicant) { // <?>는 모든 객체 허용
		// 등록하는 기능
		System.out.println(applicant.getKind().getClass().getSimpleName()+"가 등록을 했습니다. (register01)");
	}
	

	/**
	 * 직장인만 허용 (등록)
	 */
	public void register02(Applicant<? super Worker> applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName()+"가 등록을 했습니다. (register02)");
	}
	
	/**
	 * 학생만 허용 (등록)
	 */
	public void register03(Applicant<? extends Student> applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName()+"가 등록을 했습니다. (register03)");
	}
	
	
}
