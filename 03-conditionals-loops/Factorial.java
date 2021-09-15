import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,fact=1;
		n = sc.nextInt();
		
		while(n!=1) {
			fact*=n;
			n--;
		}
		
		System.out.println(fact);
	}
	
	
}

