import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		
		int sn=0, se=0, so=0, n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n!=0) {
			if(n<0)
				sn+=n;
			else if(n%2==0)
				se+=n;
			else
				so+=n;
			n = sc.nextInt();
		}
		
		System.out.println("Sum of negative numbers: " + sn);
		System.out.println("Sum of even numbers: " + se);
		System.out.println("Sum of odd numbers: " + so);
		
	}
}