import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int s = sumofn_numbers(n);
		System.out.println(s);
	}
	
	public static int sumofn_numbers(int n) {
		int sum = n*(n+1)/2;
		return sum;
	}
}

 