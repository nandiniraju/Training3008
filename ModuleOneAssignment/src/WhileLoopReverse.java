
public class WhileLoopReverse {

	public static void main(String[] args) {
		
		int reversenumber =0;
		int num = 250612;
		int remainder = 0;
		
		while(num > 0)
		{
			remainder = num % 10;
			reversenumber = reversenumber * 10 + remainder;
			num = num / 10;
			 
		}
		System.out.println("Reversed number is "+reversenumber);

	}

}
