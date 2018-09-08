/**
 * 
 */

/**
 * @author Nandini
 *
 */
public class Assignment1 {

	/**
	 * This assignment is to demonstrate data types and operations
	 */
	public static void main(String[] args) {
		// Addition, Subtraction, Multiplication and Division
		int num1 = 2;
		int num2 = 4;

		System.out.println("*********************Using integers****************************");
		System.out.println("Sum of "+num1+" and "+num2+" results in "+(num1+num2));
		System.out.println("Difference of "+num2+" and "+num1+" results in "+(num2-num1));
		System.out.println("Multiplication of "+num1+" and "+num2+" results in "+(num1*num2));
		System.out.println("Division of "+num2+" and "+num1+" results in "+(num2/num1));
		System.out.println();
		
		float num3 = 4.4f;
		float num4 = 2.2f;
		
		System.out.println("***********Using float numbers*********");
		System.out.println("Sum of "+num3+" and "+num4+" results in "+(num3+num4));
		System.out.println("Difference of "+num3+" and "+num4+" results in "+(num3-num4));
		System.out.println("Multiplication of "+num3+" and "+num4+" results in "+(num3*num4));
		System.out.println("Division of "+num3+" and "+num4+" results in "+(num3/num4));
		System.out.println();
		
		double num5 = 6.6;
		double num6 = 3.3;
		
		System.out.println("****************Using double numbers*********");
		System.out.println("Sum of "+num5+" and "+num6+" results in "+(num5+num6));
		System.out.println("Difference of "+num5+" and "+num6+" results in "+(num5-num6));
		System.out.println("Multiplication of "+num5+" and "+num6+" results in "+(num5*num6));
		System.out.println("Division of "+num5+" and "+num6+" results in "+(num5/num6));
		System.out.println();
		
		char a = 'N';
		System.out.println("****************Using Character*********");
		System.out.println("Character is "+a);
		a = (char) (a + 5); //This will result in S
		System.out.println("Incremeneted Character by 5 letters post N results in "+a);
		
		byte a1 = 90;
		byte a2 = 30;
				
		System.out.println("****************Using byte**************************");
		System.out.println("Sum of "+a1+" and "+a2+" results in "+(a1+a2));
		System.out.println("Difference of "+a1+" and "+a2+" results in "+(a1-a2));
		System.out.println("Multiplication of "+a1+" and "+a2+" results in "+(a1*a2));
		System.out.println("Division of "+a1+" and "+a2+" results in "+(a1/a2));
		System.out.println();
		
		System.out.println("****************Using boolean and long*******************");
		
		boolean isReminder = false;
		
		long a3 = 9600;
		long a4 = 80;
		long a5;
		
		if((a5 = a3%a4) == 0) {
			isReminder = true;
		}
		
		if(isReminder = true) {
			System.out.println("Remainder is zero "+a5);
		}else {
			System.out.println("Reminder is non-zero "+a5);
			
		}
		
		System.out.println("****************Using increments and decrement*******************");
		int m = 4;
		int n= m++;
		System.out.println("Before increment the value is " +n+" and post increment the value is "+m);
		
		int o = 8;
		int p = o--;
		System.out.println("Before decrement the value is " +p+" and post decrement the value is "+o);
		
	}

}