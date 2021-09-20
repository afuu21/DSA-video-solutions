import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int max_val = fn_max(a,b,c);
		int min_val = fn_min(a,b,c);
		
		System.out.println("The max no is:"+max_val+" \nThe min val:" + min_val);
		
	}
	
	public static int fn_max(int a, int b, int c) {
		int max = 0;
		if(a>max)
			max =a;
		if(b>max)
			max = b;
		if(c>max)
			max = c;
		return max;
	}
	
	public static int fn_min(int a, int b, int c) {
		int min = 999;
		if(a<min)
			min =a;
		if(b<min)
			min = b;
		if(c<min)
			min = c;
		return min;
	}
}