import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price, discount;
		price = sc.nextInt();
		discount = sc.nextInt();
		
		
		
		System.out.println("Discounted Price=" + (price - (0.01*discount)*price));
	}
	
	
}