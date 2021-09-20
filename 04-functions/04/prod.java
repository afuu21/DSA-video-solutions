import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		int prod = sum(n1, n2);
		System.out.println("The product is:" + prod);
		
		
		
	}
	
	public static int sum(int n1, int n2) {
		return n1*n2;
	}
		
}

 