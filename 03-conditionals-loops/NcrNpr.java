import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int ncr, npr;
		ncr = fact(n)/(fact(r)*fact(n-r));
		npr = fact(n)/(fact(n-r));
		
		System.out.println("The ncr is: " + ncr + "The npr is: " + npr);
	}
	
	public static int fact(int n) {
		for(int i=n-1;i>0;i--) {
			n*=i;
		}
		return n;
	}
	
	
}