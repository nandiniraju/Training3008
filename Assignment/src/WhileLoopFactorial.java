
public class WhileLoopFactorial {

	public static void main(String[] args) {
		
		int fact = 0;
		int num = 6;
		int i = 1;
		while(i<=num) {
			fact = num * i;
			i++;
		}
		System.out.println("Factorial of "+num+" is "+fact);

	}

}
