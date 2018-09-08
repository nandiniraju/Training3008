
public class WhileLoopAddNum {

	public static void main(String[] args) {
		
		int x = 12345;
		
		int rem, totnum=0;
		
		while (x > 0)
		{
			rem = x % 10;
			totnum = totnum + rem;
			 x = x / 10;
		}
		System.out.println("Added digits of a number is "+totnum);
	}

}
