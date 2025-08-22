package Rough;

class Animal {
	void speak() {
		System.out.println("Animal sound");
	}
}

class Dog extends Animal {
	void speak() {
		System.out.println("Bark");
	}
}

public class Test {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.speak();
	}
}
