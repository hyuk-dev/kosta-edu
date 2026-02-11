package ex0211.enum_test;

public class EnumExam {
	public static void main(String[] args) {
		Grade g = Grade.BASIC;
//		switch(g) {
//			case BASIC : 
//				System.out.println("기본 고객");
//				break;
//			case SILVER : 
//				System.out.println("중급 고객");
//				break;
//			case GOLD :
//				System.out.println("고급 고객");
//				break;
//			default: 
//				System.out.println("잘못된 등급 정보입니다.");
//		}
		System.out.print(g.getCode() + " ");
		System.out.println(g.getName());
	}
}
