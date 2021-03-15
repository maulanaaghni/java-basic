public class Constructor{ //just name class

	// this code is about constructor in Java

	int height = 150; //property

	public Constructor(int newHeight){ //thi is the constructor
		height = newHeight;
	}

	public static void main(String[] args) {
		Constructor test = new Constructor(180);
		Constructor test2 = new Constructor(200);

		System.out.println(test.height);
		System.out.println(test2.height);
	}
}