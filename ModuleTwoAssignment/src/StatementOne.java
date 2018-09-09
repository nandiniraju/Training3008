import java.util.Scanner;

public class StatementOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of employees required to be stored");
		
		// Read Employee numbers
		int ArraySize = scanner.nextInt();
		int[] empNum = new int[ArraySize];
		System.out.println("Enter "+ArraySize+ " employee numbers");
		
	     for(int i = 0; i < ArraySize; i++) {
	         empNum[i] = scanner.nextInt();
	       }
		
	   // Read Employee names
	     String[] empName = new String[ArraySize];
	     System.out.println("Enter "+ArraySize+ " employee names");
			
	     for(int i = 0; i < ArraySize; i++) {
	         empName[i] = scanner.next();
	       }
	     
		   // Read Employee Salary
	     double[] empSal = new double[ArraySize];
	     System.out.println("Enter "+ArraySize+ " employee salary");
			
	     for(int i = 0; i < ArraySize; i++) {
	         empSal[i] = scanner.nextDouble();
	       }
	     
	     System.out.println("Employee details recorded are as shown below");
	     System.out.println("ID            Name          Salaray");
	     
	     for(int i = 0; i < ArraySize; i++) {
	    	 System.out.println(empNum[i]+"           "+empName[i]+"             "+empSal[i]);
	     }
	     
	}

}
