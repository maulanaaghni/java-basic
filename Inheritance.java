class Animal{
	

	int age;
	String colour;

	int get_age(){
		return age;
	}

}

class Inheritance extends Animal{
	public static void main(String[] args) {
		herbivore cow = new herbivore();
		cow.age = 20;
		System.out.println(cow.age);
	}
}