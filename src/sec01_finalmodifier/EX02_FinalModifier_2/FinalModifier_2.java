package sec01_finalmodifier.EX02_FinalModifier_2;

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

}
