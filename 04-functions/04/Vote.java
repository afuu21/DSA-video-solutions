import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		eligible(n);
		
		
		
	}
	
	public static void eligible(int n) {
		if(n>=18)
			System.out.println("Eligible");
		else 
			System.out.println("Not Eligible");
	}
	
}