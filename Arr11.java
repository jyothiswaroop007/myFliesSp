
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Arr11{
		public static boolean only14(int[] a) {
			for(int i : a) {
				if ((i == 4) || (i==1)) {}
				else {
					return false;
				}
			}
			
			return true;
		}

		public static void main(String args[]) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter array with seperated comma: ");
			String[] strr = br.readLine().split(",");
			int[] arr = new int[strr.length];
			for(int i =0;i<strr.length;i++) {
				arr[i] = Integer.parseInt(strr[i]);	
			}
			System.out.print(only14(arr));
	}
		
}
