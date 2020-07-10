
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Arr9{
		public static int[] withoutten(int[] a) {
			for(int i=0;i<a.length;i++) {
				if(a[i] == 10) {
					a[i]=0;
				}
			}
			for(int i=0;i<a.length;i++) {
				for(int j=i;j<a.length;j++) {
					if( (a[i] == 0) && (a[j] != 0)) {
						a[i]=a[j];
						a[j]=0;
					}
				}
			}
			return a;
		}

		public static void main(String args[]) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter array with seperated comma: ");
			String[] strr = br.readLine().split(",");
			int[] arr = new int[strr.length];
			for(int i =0;i<strr.length;i++) {
				arr[i] = Integer.parseInt(strr[i]);	
			}
			System.out.print(Arrays.toString(withoutten(arr)));
	}
		
}
