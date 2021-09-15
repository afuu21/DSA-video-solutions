import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		
		int year;
		Scanner sc = new Scanner(System.in);
		
		year = sc.nextInt();
		
		if ((year%4 == 0 && year%100 !=0) || year%400 == 0)
			System.out.println("LEap year");
		else 
			System.out.println("Not a leap year");
	}
}