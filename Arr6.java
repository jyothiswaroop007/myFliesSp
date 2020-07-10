import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Arr6{

		public static void main(String args[]) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter array with seperated space: ");
			String[] strr = br.readLine().split(" ");
			int[] arr = new int[strr.length];
			for(int i =0;i<strr.length;i++) {
				arr[i] = Integer.parseInt(strr[i]);
			}
			Arrays.sort(arr);
			for(int j =0;j<arr.length;j++) {
				System.out.print(arr[j]+" ");
			}
			
	}
		
}
