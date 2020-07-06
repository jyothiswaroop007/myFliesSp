public class FlowCtr5{
	public static void main(String args[]) {
		char c;
		c = 'a';
	/*  c = '4';
		c = '&';  */
		if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is an Alphabet.");
		}
		else if (c >= '0' && c <= '9') {
			System.out.println(c + " is a Digit.");
		}
		else {
			System.out.println(c + " is a Special Character.");
		}
		
		
	}
}
