import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,p,c=0,prod=1;
		n = sc.nextInt();
		p = sc.nextInt();
	
		while(c!=p) {
			prod*=n;
			c++;
		}
		
		
		
		System.out.println("Power of the number =" + prod);
	}
	
	
}