public class Continue{

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++){

			if (i == 3){
				continue; //skip the iteration 
			}
			System.out.println(i);
		}
	}
}