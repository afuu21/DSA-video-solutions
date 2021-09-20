import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		int r;
		Scanner sc = new Scanner(System.in);
		
		r = sc.nextInt();
		circandarea(r);
		
		
		
		
	}
	
	public static void circandarea(int r) {
		System.out.println("Circumference:" + 2*3.14*r);
		System.out.println("Area" + 3.14*r*r);
	}
		
}

 