
public class DoWhileEvenOdd {

	public static void main(String[] args) {
		
		int i = 0;
		System.out.print("Even numbers are...");
		i = 0;
		do
		{
			System.out.print(i);
			System.out.print(" ");
			 i = i + 2;
		}while ( i < 20);
		
		System.out.println();
		System.out.print("Odd numbers are...");
		i = 1;
		do
		{
			System.out.print(i);
			System.out.print(" ");
			 i = i + 2;
		}while ( i < 20);
		
	
	}

}
