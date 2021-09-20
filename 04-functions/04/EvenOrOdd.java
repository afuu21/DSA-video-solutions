import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		evenorodd(n);
		
		
		
	}
	
	public static void evenorodd(int n) {
		if(n%2==0)
			System.out.println("Even");
		else 
			System.out.println("Odd");
	}
	
}