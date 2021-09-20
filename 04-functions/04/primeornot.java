import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		primeornot(n);
		
		
		
		
	}
	
	public static void primeornot(int n) {
		boolean flag = true;
		for (int i=2;i<n;i++) {
			if(n%i==0)
				flag=false;
		}
		
		if(flag)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
		
	}
		
}

 