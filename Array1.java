public class Demo{

		public static void main(String args[]) {
			
			int [] arr;
			arr=new int[] {1,2,3,4,5};
			int sum=0;
			for(int i:arr) {
				sum+=i;
			}
			System.out.println("Sum of array elements is :"+sum);
			System.out.println("Average of array elements is :"+sum/arr.length);
			
	}
}
