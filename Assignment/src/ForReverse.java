
public class ForReverse {

	public static void main(String[] args) {
		// Reversing the number
		
		int reversenumber =0;
		int num = 250612;
		int remainder = 0;
		
		for (;num > 0; num = num / 10)
		{
			remainder = num % 10;
			reversenumber = reversenumber * 10 + remainder;
			 
		}
		System.out.println("Reversed number is "+reversenumber);

	}

}
