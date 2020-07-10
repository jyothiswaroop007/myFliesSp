
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Arr10{
		public static int[] evenodd(int[] a) {
			int [] even=new int[a.length];
			int [] odd=new int[a.length];
			int [] out=new int[a.length];
			int i=0,j=0;
			for(int p:a) {
				if (p % 2 == 0) {
					even[i++]=p;
				}
				else {
					odd[j++]=p;
				}
			}
			int p=0,l=0;
			while(p<i) {
				out[p]=even[p];
				p++;
			}
			while(l<j) {
				out[p++]=odd[l++];
			}
			return out;
		}

		public static void main(String args[]) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter array with seperated comma: ");
			String[] strr = br.readLine().split(",");
			int[] arr = new int[strr.length];
			for(int i =0;i<strr.length;i++) {
				arr[i] = Integer.parseInt(strr[i]);	
			}
			System.out.print(Arrays.toString(evenodd(arr)));
	}
		
}
