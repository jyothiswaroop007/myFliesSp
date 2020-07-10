public class Arr14{
		
		public static void main(String args[]) {
			if (args.length!=9) {
				System.out.println("Please Give 9 commandline arguments");
			}
			else {
				int [][] arr=new int[3][3];
				int k=0,mx=0;
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						arr[i][j]=Integer.parseInt(args[k++]);
						if (arr[i][j]>mx) {
							mx=arr[i][j];
						}
					}
				}
				System.out.println("The given array is:");
				for(int[] i :arr) {
					System.out.println(i[0]+" "+i[1]);
				}
				System.out.println("Biggest number int he given Array is: "+mx);
				
			}
	}
		
}
