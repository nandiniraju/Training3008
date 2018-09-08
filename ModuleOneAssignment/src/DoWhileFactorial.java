
public class DoWhileFactorial {

	public static void main(String[] args) {
		
		int fact = 0;
		int num = 6;
		int i = 0;
		
		do
		{
			fact = num * i;
			i++;
		}while(i<=num);
		
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
