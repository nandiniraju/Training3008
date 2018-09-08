
public class DoWhileTable {

	public static void main(String[] args) {
		
		int num = 10;
		int i = 1;
		/*while(i<=9) {
			i++;
			System.out.println(num+" * "+ i +" is "+i * num);
		}*/
		
		do
		{
			System.out.println(num+" * "+ i +" is "+i * num);
			i++;
		}while(i<=10);

	}

}
