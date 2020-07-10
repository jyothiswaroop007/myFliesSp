import java.util.Scanner;

public class Arr3{

		public static void main(String args[]) {
			
			Scanner in = new Scanner(System.in);
			System.out.println("Size of Array: ");
			int n = in.nextInt();
			System.out.println("Enter Element to Find: ");
			int k = in.nextInt();
			int pos = -1;
			int[] arr = new int[n];
			System.out.println("Enter Array: ");
			for(int i =0;i<n;i++) {
				arr[i] = in.nextInt();
				if(k==arr[i]) {
					pos = i;
				}	
			}
			System.out.println(pos);
			
	}
		
}
