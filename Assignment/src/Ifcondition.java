
public class Ifcondition {

	public static void main(String[] args) {
		
		//Write a program to check if a candidate is eligible for voting or not. (Hint: Check age)
		System.out.println("****************************************");
		System.out.println("1: Check for eligibility of voting age");
		byte candidateage = 17;
		byte eligibleage = 18;
		
		if(candidateage >= eligibleage) {
			System.out.println("Candidate is eligible for voting, as his age is"+candidateage);
		}else {
			System.out.println("Candidate is not eligible for voting as he is less than "+eligibleage+", and his actual age is "+candidateage);
		}
		
		//Write a program to check if the number is positive or negative.
		//Extend the previous program to check whether the given number is positive, zero or negative.
		//(Hint: use if	-else conditions)
		System.out.println("********************************************************************");
		System.out.println("2: Check positive, zero or negative");
		int num = -11;
		
		if(num > 0) {
			System.out.println("Number "+num+" is positive");
		}else {
			if(num < 0) {
				System.out.println("Number "+num+" is Negative");
			}else {
				System.out.println("Number is zero");
			}
		}
		
		//Write a program to find largest of two numbers.
		System.out.println("****************************************");
		System.out.println("3. To find the largest between numbers");
		float num1 = 3.24f;
		float num2 = 3.11f;
		
		if(num1 > num2) {
			System.out.println("num1 ("+num1+") is the greatest number compared to num1("+num2+")");
			}
		else {
			System.out.println("num2 ("+num2+") is the greatest number compared to num1 ("+num1+")");
		}
		System.out.println("*************************************************************************");
		
		//Write a program to check given number is even or odd. (Hint: use % operator)
		System.out.println("4. Check if the given number is even or odd");
		long num3 = 20;
		if (num3%2==0) {
			System.out.println(+num3+" is even number");
		}else {
			System.out.println(+num3+" is odd number");
		}
	}

}