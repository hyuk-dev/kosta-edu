package assignment0203;

import java.util.Scanner;
/**
 *  주제: 
 *  작성일: 
 *  작성자:
 */

class GraduateLogic {
	
	/**
	 * 총점 구하기
	 * @param korean
	 * @param english
	 * @param math
	 * @return 총점
	 */
    private int calculatorSum(int korean, int english, int math) {
    	return korean + english + math;
    }
    
    private double calculatorAvg(int total, int size) {
    	return (double)(total/size);
    }
    
    private char calculatorGrade(double avgScore) {
        char grade = switch((int)(avgScore/10)) {
        case 9,10 -> 'A';
        case 8 -> 'B';
        case 7 -> 'C';
        case 6 -> 'D';
        default -> 'F';
        };
        
        return grade;
    }
    
    public void gradeSystem(String name, int korean, int english, int math) {
    	int total = this.calculatorSum(korean, english, math);
    	double avg = this.calculatorAvg(total, 3); // 3은 과목 개수
    	char grade = this.calculatorGrade(avg);
    	System.out.println("이름: " + name);
    	System.out.println("총점: " + total);
    	System.out.println("평균: " + avg);
    	System.out.println("학점: " + grade);
    }
}

public class Graduate {
	public static void main(String[] args) {
	        String name = new String();
	        name = "이동혁";
	        boolean isRun = true;
	        GraduateLogic gl = new GraduateLogic();
	        while(isRun) {
	        	System.out.println("1.  성적표구하기   2.  종료");
	        	Scanner sc = new Scanner(System.in);
	        	switch(sc.nextInt()) {
	        		case 1 -> {
	        			int korean = (int)(Math.random()*56+45), english = (int)(Math.random()*56+45), math = (int)(Math.random()*56+45);
	        			gl.gradeSystem(name, korean, english, math);
	        		}
	        		case 2 -> isRun = false;
	        	}
	        	
	        }
	    
	}
}
