package assignment0203.conditional;

public class Excercise06 {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				for(int k=1; k<=5; k++) {
					if(i == 1) {
						if(k<=j) {
							System.out.print("★");
						} else {
							System.out.print("   ");
						}
					} else if(i == 2) {
						if(j<=5-k+1) {
							System.out.print("★");
						} else {
							System.out.print("   ");
						}
					} else if(i == 3) {
						if(j>=5-k+1) {
							System.out.print("★");
						} else {
							System.out.print("   "); 
						}
					} else if(i == 4) {
						if(k>=j) {
							System.out.print("★");
						} else {
							System.out.print("   ");
						}
					}
				}
				System.out.println("");
			}
			if(i<4) System.out.println("***************************");
		}	
	}

}
