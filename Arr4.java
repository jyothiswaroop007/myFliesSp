import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Arr4{

		public static void main(String args[]) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] starr=br.readLine().split(" ");
			for (String i:starr) {
				int num=Integer.parseInt(i);
			System.out.print((char)num + " ");
			}
			
	}
		
}
