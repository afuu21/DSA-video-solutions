import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double gpaSum=0;
		
		
		for(int i=1; i<=8; i++) {
			System.out.println("Enter the gpa of sem" + i);
			gpaSum+=sc.nextDouble();
		}
		System.out.println(gpaSum/8);
		
	}
	
	
}
