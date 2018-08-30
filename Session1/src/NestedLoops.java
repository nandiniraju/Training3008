
public class NestedLoops {

	public static void main(String[] args) {
		// Loops
		for(int i=1; i<=5; i++) {
		System.out.println("For i: "+i);
		
		//Nested Loop
		//for(int j=1;j<=3;j++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}

	}
}
