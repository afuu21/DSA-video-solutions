import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,l=0;
		n = sc.nextInt();
		
		while(n!=0) {
			if(n>l)
				l=n;
			n = sc.nextInt();
		}
		
		System.out.println(l);
	}
	
	
}

