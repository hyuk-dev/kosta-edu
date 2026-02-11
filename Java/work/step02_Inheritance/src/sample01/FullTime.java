package sample01;

public class FullTime {
	int empNo;
	String eName;
	String job;
	int mgr;
	String hiredate;
	String deptName;
	int salary;
	int bonus;
	
	/**
	 * 인자가 없는 생성자
	 */
	FullTime() {
		
	}
	
	/**
	 * 인자가 있는 생성자
	 * @param empNo
	 * @param eName
	 * @param job
	 * @param mgr
	 * @param hiredate
	 * @param deptName
	 * @param salary
	 * @param bonus
	 */
	FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int salary, int bonus) {
		
	}
	
	int getEmpNo() {
		return this.empNo;
	}
}
