import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		n = sc.nextInt();
		
		while(n!=0) {
			sum+=n;
			n=sc.nextInt();
		}
		
		System.out.println(sum);
	}
	
	
}

