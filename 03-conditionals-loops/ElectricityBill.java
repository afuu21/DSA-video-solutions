import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,price;
		n = sc.nextInt();
		
		System.out.println("Enter the price of single unit: ");
		price = sc.nextInt();
		
		System.out.println("total bill = " + price*n);
	}
	
	
}