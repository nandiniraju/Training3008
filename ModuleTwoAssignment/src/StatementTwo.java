public class StatementTwo{
	void display(int empId[], String empName[] )
	{
		
		System.out.println("ID            Name   ");
		
		int length = empId.length;
		for (int i=0; i < length; ++i)
		{
			System.out.println(empId[i] + "            " + empName[i] + "        ");
		}	
	}

	public static void main(String[] args) {
		
		StatementTwo z = new StatementTwo();
		z.display(new int[]{00, 002, 003,004,00}, new String[]{"John","Clark","Nancy","Joe","Mary"});
	}

}
