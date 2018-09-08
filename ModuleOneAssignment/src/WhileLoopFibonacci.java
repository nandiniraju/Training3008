
public class WhileLoopFibonacci {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int num3;
		
		System.out.print("Fibonacci numbers are ");
		System.out.print(num1);
		System.out.print(" ");
		System.out.print(num2);
		System.out.print(" ");
		
		int i = 0;
		while(i <= 10)
		{
			num3 = num1 + num2;
			System.out.print(num3);
			System.out.print(" ");
			num1 = num2;
			num2 = num3;
			i++;
		}

	}

}
