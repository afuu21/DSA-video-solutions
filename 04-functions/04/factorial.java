import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int factorial = fact(n);
		System.out.println(factorial);
		
		
		
	}
	
	public static int fact(int n) {
		int prod = 1;
		if(n==0)
			return 1;
		else if(n==1)
			return 1;
		else 
		{
			for(int i = 2; i<=n; i++) {
				prod*=i;
			}
		}
		
		return prod;
		
	}
		
}