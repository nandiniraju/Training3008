
public class DoWhileAddDigit {

	public static void main(String[] args) {
		
		int x = 123456;
		
		int rem, totnum=0;
		
		do
		{
			rem = x % 10;
			totnum = totnum + rem;
			x = x / 10;
			
			
		}while (x > 0);
		
		System.out.println("Added digits of a number is "+totnum);
	}

}
