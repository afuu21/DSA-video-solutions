import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = count_digits(n);
		int rfd, rld;
		int no_ofTimes = count/2;
		int times_iterated = 0;
		boolean b = true;
		while(times_iterated < no_ofTimes) {
			if(n/(int)(Math.pow(10, count-1)) == n%10) {
				rfd = n%(int)(Math.pow(10, count-1));
				rld = rfd/10;
				n =rld;
				count-=2;
			}
			else {
				b = false;
				break;
			}
			times_iterated++;
		}
		
		if(b)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
}
	
	public static int count_digits(int n) {
		int count=0;
		while(n!=0) {
			n/=10;
			count++;
		}
		return count;
	}
}