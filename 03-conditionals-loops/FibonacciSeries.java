import java.util.*;
import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,n,sum;
		n = sc.nextInt();
		
		if(n==0){
			System.out.println(0 + " ");
			return;
		}
		if(n==1){
			System.out.println(0 + " ");
		return;
		}
		if(n==2) {
			System.out.println(0 + " " + 1 + " ");
			return;
		}
		a=0;
		b=1;
		System.out.print(0 + " " + 1 + " ");
		if(n>=3)
			for(int i=3;i<=n;i++)
			{
				sum=a+b;
				System.out.print(sum + " ");
				a=b;
				b=sum;
			}
		
	}
	
	
}