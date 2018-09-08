
public class ForFactorial {

	public static void main(String[] args) {
		// Factorial of a number
		
		int fact = 0;
		int num = 6;
		for(int i =0;i<=num;i++) {
			fact = num * i;
		}
		System.out.println("Factorial of "+num+" is "+fact);

	}

}
