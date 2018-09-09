import java.util.Scanner;

public class StatementThree {
	void display(int id[], double salary[], String name[] )
	{
		System.out.println("ID            Name          Salaray");
		
		int length = id.length;
		for (int i=0; i < length; ++i)
		{
			System.out.println(id[i] + "             " + name[i] + "          " + salary[i]);
		}
	}
	
	//Displays the arrays.
	void display(int id[], String name[] )
	{
			System.out.println("ID            Name   ");
			
			int length = id.length;
			for (int i=0; i < length; ++i)
			{
				System.out.println(id[i] + "            " + name[i] + "        ");
			}	
			
	}

	void display(String searchName, int id[], String name[], double sal[] )
	{
			
			System.out.println("ID            Name          Salaray");
			
			int length = id.length;
			for (int i=0; i < length; ++i)
			{
				 
				if (name[i].equals(searchName)){
				  System.out.println(id[i] + "            " + name[i] + "          " + sal[i]);
				}
				 
			}
	}
	public static void main(String[] args) {
		
		int id[]       = new int[5];
		String name[]  = new String[5];
		double salary[] = new double[5];
		
		Scanner sc = new Scanner (System.in);
		 
		for (int i = 0;  i < 5; ++i)
		{
		   System.out.println("Enter "+i+" employee records in ID Name salary format...");
			id[i] = sc.nextInt();
			name[i]= sc.next();
			salary[i] = sc.nextDouble();
		}

		StatementThree emp = new StatementThree();
		emp.display(id, salary, name);
		System.out.println();
		
		emp.display(id, name);
		
		System.out.println("Enter a name to search for...");
		String searchName = sc.next();
		emp.display(searchName, id, name, salary);
	}
}