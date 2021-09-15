import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		char[] cs = s.toCharArray();
		char temp;
		int n = cs.length;
		for(int i=0; i<n/2; i++) {
			temp = cs[i];
			cs[i] = cs[n-i-1];
			cs[n-i-1] = temp;
		}
		System.out.println(cs);
}
}