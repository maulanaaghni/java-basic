public class Array2D{

	public static void main(String[] args) {
		
		// Array 2D
		String[][] space = new String[][]{

			{"Indonesia"," Jakarta"},
			{"America"," Washington DC"},
			{"France", " Paris"}


		};

		for(int x=0; x<space.length;x++){
			for (int y=0;y<space[x].length ;y++ ) {
				System.out.println(space[x][y]);
			}
				System.out.println("==============");
		}
	}
}