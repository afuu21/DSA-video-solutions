import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			sum+=sc.nextInt();
		}
		System.out.println(sum/n);
		
	}
	
	
}

