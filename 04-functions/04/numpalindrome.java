import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		int n,n1,r=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		n1 = n;
		while(n1!=0) {
			r=r*10;
			r+=n1%10;
			n1/=10;
		}
		if(r == n) {
			System.out.println("its palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
	
}

 