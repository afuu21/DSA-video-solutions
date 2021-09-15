import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		
		int n1,n2,temp,temp1,temp2;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		temp1 = n1;
		temp2 = n2;
		while(temp2 != 0) {
			temp = temp2;
			temp2 = temp1%temp2;
			temp1 = temp;
		}
		
		double hcf = temp1;
		double lcm = n1*n2/temp1;
		
		System.out.println("HCF:" + hcf + "LCM:" + lcm);
	}
}