import java.util.Scanner;

public class FlowCtr14{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0;
		int rem;
		while(n>0) {
			rem = n % 10;
			sum += rem;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
