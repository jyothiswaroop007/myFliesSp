public class FlowCtr13{
	public static void main(String args[]) {
		int flag=0;
		System.out.println("Prime numbers between 10 to 99 are:");
		for(int n=10;n<100;n++) {
			for(int i=2;i<(Math.sqrt(n));i++) {
				if (n%i == 0) {
					flag=11;
					break;
				}
			}
			if (flag==0) {
				System.out.print(n+" ");
			}
			flag=0;
		}
		
		
	}
}
