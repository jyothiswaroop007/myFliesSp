import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Arr5{

		public static void main(String args[]) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter array with seperated space: ");
			String[] strr = br.readLine().split(" ");
			int[] arr = new int[strr.length];
			for(int i =0;i<strr.length;i++) {
				arr[i] = Integer.parseInt(strr[i]);
			}
			Arrays.sort(arr);
			System.out.print("Largest number 1: ");
			System.out.println(arr[(arr.length)-1]);

			System.out.print("Largest number 2: ");
			System.out.println(arr[(arr.length)-2]);

			System.out.print("Smallest number 1: ");
			System.out.println(arr[0]);

			System.out.print("Smallest number 1: ");
			System.out.println(arr[1]);
			
	}
		
}
