
public class DoWhileReverse {

	public static void main(String[] args) {
		
		int reversenumber =0;
		int num = 987654;
		int remainder = 0;
		
	do
	{
		remainder = num % 10;
		reversenumber = reversenumber * 10 + remainder;
		num = num / 10;
	}while(num > 0);
	
	System.out.println("Reversed number is "+reversenumber);
	
	}
}
