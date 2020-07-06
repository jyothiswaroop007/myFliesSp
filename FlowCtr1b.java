package javanewpackage;
public class FlowCtr1b {
	public static boolean lastDigit(int a, int b) {
		while(a>10) {
			a=a%10;
		}
		while(b>10) {
			b=b%10;
		}
		return a==b;
	}
	public static void main(String args[]) {
		System.out.println(lastDigit(7,17));
		System.out.println(lastDigit(6,17));
		System.out.println(lastDigit(3,113));
	}
}
