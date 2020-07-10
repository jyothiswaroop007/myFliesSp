
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Demo{

		public static void main(String args[]) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter array with seperated comma: ");
			String[] strr = br.readLine().split(",");
			int[] arr = new int[strr.length];
			for(int i =0;i<strr.length;i++) {
				arr[i] = Integer.parseInt(strr[i]);	
			}
			for(int i = 0;i<strr.length;i++) {
				for(int j=i+1;j<strr.length;j++) {
					if(arr[i]==arr[j]) {
						arr[j]=0;
					}
				}
			}
			for(int i:arr) {
				if ((i!=0) && (i!=arr[arr.length-1])){
					System.out.print(i+",");
				}
				else if(i==arr[arr.length-1]) {
					System.out.print(i);
				}
			}
	}
		
}
