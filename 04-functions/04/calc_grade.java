import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		cal_grade(n);
		
		
		
		
	}
	
	public static void cal_grade(int n) {
		String grade;
		if(n>=91 && n<=100)
			grade = "AA";
		else if(n>=81 && n<=90)
			grade = "AB";
		else if(n>=71 && n<=80)
			grade = "BB";
		else if(n>=61 && n<=700)
			grade = "BC";
		else if(n>=51 && n<=60)
			grade = "CD";
		else if(n>=41 && n<=50)
			grade = "DD";
		else
			grade = "Fail";
		System.out.println(grade);
		
	}
		
}
