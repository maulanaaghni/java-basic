public class Array{

	public static void main(String[] args) {
		
		//Example 1

		// Array 
		int[] space = new int[3]; //the 'space' had 4 space
		//Array in Java start from zero (0)
		space[0] = 100; space[1] = 200; space[2] = 300; 
		//print array 
		System.out.println(space[0]);
		//print all of array with loop

		for(int i = 0; i<3; i++){
			System.out.println(space[i]);
		}



		//Example 2
		// Array
		int[] space2 = {100,200,300,400}; //automaticly create 4 space in array
		// print array
		System.out.println(space2[2]);
		// print all of array with loop
		for(int j = 0; j<4; j++){ //the array had 4 space , so 'j' is smaller than 4
			System.out.println(space2[j]);
		}
		

	}
}