import java.util.Scanner;

public class FlowCtr17{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = n;
		int rev=0;
		int rem;
		while(n>0) {
			rem = n % 10;
			rev = rev*10 + rem;;
			n = n / 10;
		}
		if (rev == temp) {
			System.out.println(temp+" is a Palindrome Number");
		}else {
			System.out.println(temp+" is Not a Palindrome Number");
		}
	}
}
