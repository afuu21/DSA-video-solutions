import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		double avg;
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			sum+=sc.nextInt();
		}
		avg = sum/n;
		System.out.println("Avg=" + avg);
	}
	
	
}

