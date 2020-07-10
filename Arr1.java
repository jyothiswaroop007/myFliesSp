import java.util.Scanner;

public class Arr1{

		public static void main(String args[]) {
			
			Scanner in = new Scanner(System.in);
			System.out.print("Size of Array: ");
			int n = in.nextInt();
			int[] arr = new int[n];
			int sum=0;
			System.out.println("Enter Array: ");
			for(int i =0;i<n;i++) {
				
				arr[i] = in.nextInt();
				sum+=arr[i];
			}
			System.out.println("Sum: "+sum);
			
			float avg = ((float)sum)/((float)n);
			System.out.println("Avarage: "+avg);
			
	}
}
