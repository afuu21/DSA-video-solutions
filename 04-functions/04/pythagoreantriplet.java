import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,4,12,6,5};
		for(int i=0; i<5;i++) {
			arr[i] = arr[i]*arr[i];
		}
		Arrays.sort(arr);
		int l,r,i;
		l=0;
		i = arr.length-1;
		r = i-1;
		boolean b = false;
		while(i>1) {
			if(arr[l] + arr[r] == arr[i]) {
				b=true;
				break;
			} else if(arr[l] + arr[r] < arr[i]) {
				l++;
			} else {
				r--;
			}
			
			if(r==l) {
				l=0;
				i--;
				r=i-1;
			}
		}
		
		if(b==true)
			System.out.println("Pythagorean triplet is possible");
		else 
			System.out.println("its not possible");
	}
	
}