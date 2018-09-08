
public class ForLoop {

	public static void main(String[] args) {
		
		//Write a program to print 10 even numbers and 10 odd numbers.
		System.out.println("Even number: ");
		for(int i=0;i<=20;i++) {
			if(i%2 == 0) {
				System.out.println(+i);
			}
		}	
		System.out.println("Odd number: ");
		for(int i=0;i<=20;i++) {
			if(i%2 != 0) {
				System.out.println(+i);
			}
		}	
	}

}
