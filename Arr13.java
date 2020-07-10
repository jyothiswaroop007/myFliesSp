
public class Arr13{
		
		public static void main(String args[]) {
			int [][] arr=new int[2][2];
			int [][] rev=new int[2][2];
			int k=0,l=1,p=1;
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					arr[i][j]=Integer.parseInt(args[k++]);
					rev[l-i][l-j]=arr[i][j];
				}
			}
			System.out.println("The given array is:");
			for(int[] i :arr) {
				System.out.println(i[0]+" "+i[1]);
			}
			System.out.println("The reverse of array is:");
			for(int[] i :rev) {
				System.out.println(i[0]+" "+i[1]);
			}
			
	}
		
}
