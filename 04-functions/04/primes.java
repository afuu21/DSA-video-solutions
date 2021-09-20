import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		primeornot(n1,n2);
	}
	
	public static void primeornot(int n1, int n2) {
		boolean b;
		for(int i=n1; i<=n2; i++) {
			b=true;
			for(int j= 2; j<i ;j++) {
				if(i%j==0){
					b=false;
				}
			}
			if(b==true) {
				System.out.println(i+" ");
			}
		}
	}
}
