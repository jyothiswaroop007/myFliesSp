import java.util.Scanner;

public class FlowCtr12{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int flag=0;
		for(int i=2;i<(Math.sqrt(n));i++) {
			if (n%i == 0) {
				System.out.println(n+" is Not a Prime Number");
				flag=11;
				break;
			}
		}
		if (flag==0) {
			System.out.println(n+" is a Prime Number");
		}
		
	}
}
