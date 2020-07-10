import java.util.Scanner;

public class Arr2{

		public static void main(String args[]) {
			
			Scanner in = new Scanner(System.in);
			System.out.print("Size of Array: ");
			int n = in.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter Array: ");
			arr[0] = in.nextInt();
			int max = arr[0];
			int min = arr[0];
			for(int i =1;i<n;i++) {
				arr[i] = in.nextInt();
				if(arr[i]>max) {
					max = arr[i];
				}
				if(arr[i]<min) {
					min = arr[i];
				}
			}
			System.out.println("Max: "+max);

			System.out.println("Min: "+min);
			
	}
}
