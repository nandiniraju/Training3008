
public class WhileLoopEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to print 10 even numbers and 10 odd numbers.
		
		int i = 0;
		System.out.println("Even numbers are ");
		i = 0;
		
		while ( i < 20)
		{
			System.out.println(i);
			 i = i + 2;
		}
		
		System.out.println("Odd numbers are ");
		i = 1;
		while ( i < 20)
		{
			System.out.println(i);
			 i = i + 2;
		}
	}

}
