import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Arr12{
		public static int [] middleWay(int[] a,int [] b) {
			int [] c=new  int[2];
			c[0]=a[1];
			c[1]=b[1];
			return c;
		}

		public static void main(String args[]) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter array1 of 3 elements with seperated comma: ");
			String[] strr = br.readLine().split(",");
			int[] arr1 = new int[strr.length];
			for(int i =0;i<strr.length;i++) {
				arr1[i] = Integer.parseInt(strr[i]);	
			}
			System.out.println("Enter array2 of 3 elements with seperated comma: ");
			strr = br.readLine().split(",");
			int[] arr2 = new int[strr.length];
			for(int i =0;i<strr.length;i++) {
				arr2[i] = Integer.parseInt(strr[i]);	
			}
			
			System.out.print(Arrays.toString(middleWay(arr1,arr2)));
	}
		
}
