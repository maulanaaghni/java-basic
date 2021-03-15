public class ConditionElseIf{

	public static void main(String[] args) {
		
		int x = 350;

		if(x>100){
			System.out.println("x is bigger than 100");
		}else if (x<100) {
			System.out.println("x is smaller than 100");
			
		}else{
			System.out.println("This condition doesn't exist");
		}
	}
}