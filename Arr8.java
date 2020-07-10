import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Arr8{

		public static void main(String args[]) throws IOException {
			int sum=0;
			int dsum=0;
			int flag=11;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter array with seperated comma: ");
			String[] strr = br.readLine().split(",");
			int[] arr = new int[strr.length];
			for(int i =0;i<strr.length;i++) {
				arr[i] = Integer.parseInt(strr[i]);	
			}
			for(int i=0;i<arr.length;i++) {
				if ( arr[i]==6 ) {
					flag=22;
				}
				if ((flag==11)) {
					sum+=arr[i];
				}
				if((flag==22)) {
					dsum+=arr[i];
					if (arr[i]==7) {
						flag=11;
					}
				}
			}
			if(flag==22) {
				sum+=dsum;
			}
			System.out.print(sum);
	}
		
}
