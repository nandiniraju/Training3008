final class ProblemTwo{
	final double amt1 = 1000;
	
	final void savingDisplay()
	{
		System.out.println("Minimum balance of Savings account is "+amt1);
	}

	final double amt2 = 50000;
	
	final void currentDisplay()
	{
		System.out.println("Minimum balance of Current account is "+amt2);
	}
    public static void main(String[] args) {
		
	ProblemTwo ref = new ProblemTwo();
	ref.savingDisplay();
	ref.currentDisplay();
	}
	
}
