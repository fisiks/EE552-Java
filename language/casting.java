public class casting {
	public static void main(String[] args) {
		float a = 5;
		int b = (int)a;
		A a1 = new A();
		B b1 = new B();
		///a1 = (A)b1; illegal, not compatible
		C c1;
		D d1 = new D();
		c1 = d1;
		c1.f();

		d1 = (D)c1; // how do we know??? // if you are wrong, IllegalCastException
		
	}
}

class A{}
class B{}
class C {
	public void f() {}
}
class D extends C {
	public void g() {}
}
