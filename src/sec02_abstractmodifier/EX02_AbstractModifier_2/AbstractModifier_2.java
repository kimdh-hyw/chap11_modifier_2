package sec02_abstractmodifier.EX02_AbstractModifier_2;

//추상클래스/추상메서드 사용하는 경우 
abstract class Animal {
	abstract void cry();
}

class Cat extends Animal {
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}

//abstract class B {
//	void bcd() {}
//}

public class AbstractModifier_2 {
	public static void main(String[] args) {
		//#1. 객체생성
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		//#2. 메서드 호출
		animal1.cry(); //야옹
		animal2.cry(); //멍멍
	}
}
