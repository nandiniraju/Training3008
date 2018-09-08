
public class ForFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to generate 10 Fibonacci numbers.
		
		int num1 = 0;
		int num2 = 1;
		int num3;
		
		System.out.print("Fibonacci numbers are ");
		System.out.print(num1);
		System.out.print(" ");
		System.out.print(num2);
		System.out.print(" ");
		
		for (int i = 0; i <= 10; ++i)
		{
			num3 = num1 + num2;
			System.out.print(num3);
			System.out.print(" ");
			num1 = num2;
			num2 = num3;
		}

	}

}
