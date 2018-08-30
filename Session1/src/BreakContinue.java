
public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int homeFloor = 15;
		
		for(int floor=1;floor<100;floor++) {
			System.out.println("floor is: "+floor);
			
			if(floor == homeFloor) {
				break;//break shall terminate the loop
			}
			
		}
		System.out.println("============");
			for(int i =1;i<=10;i++) {
				//1,2,3,4 and 5 will be skipped
				if(i<=5) {
					continue;//continue shall skip the instructions below and take the loop in next iteration
				}
				System.out.println("i is: "+i);
			}
			System.out.println(">>>>>>>>>>>>>>>>>>");
			for(int p=1;p<=5;p++) {
				System.out.println("for p: "+p);
				for(int q=1;q<5;q++) {
					if(q==3) {
						break;
					}
					System.out.print(q+" ");
				}
				System.out.println();
			}
			System.out.println(">>>>>>>>>>>>>>>>>>");
	}

}
