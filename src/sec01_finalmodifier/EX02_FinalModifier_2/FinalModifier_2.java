package sec01_finalmodifier.EX02_FinalModifier_2;

/*final 메서드와 final 클래스의 특징 */

class A {
	void abc() {}
	final void bcd() {}
}
class B extends A {
	void abc() {}
	//void bcd() {} //final 메서드는 오버라이딩 불가
}
final class C {}

//class D extends C {} //final 클래스는 상속자체가 불가

public class FinalModifier_2 {
	public static void main(String[] args) {
		
	}
}
