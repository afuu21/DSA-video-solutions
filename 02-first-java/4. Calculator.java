//Video link: https://youtu.be/QKfy0qakB_o
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char op;
		a = sc.nextInt();
		b = sc.nextInt();
		op = sc.next().charAt(0);
		
		if(op=='+')
			System.out.println(a+b);
		if(op=='-')
			System.out.println(a-b);
		if(op=='*')
			System.out.println(a*b);
		if(op=='/')
			System.out.println(a/b);
		
	}
	
	
}
