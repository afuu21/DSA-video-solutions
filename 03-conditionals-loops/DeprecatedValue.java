import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,pv,r;
		n = sc.nextInt();
		r = sc.nextInt();
		pv = sc.nextInt();
	
		System.out.println(pv*Math.pow((1+0.01*r), n));
		
		
		
		System.out.println("Final value =" + pv*Math.pow((1+0.01*r), n));
	}
	
	
}