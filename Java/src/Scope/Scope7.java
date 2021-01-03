package Scope;

class C {
	int v =10;//기본값
	
	void m() {
		int v = 20;//m메소드 안에서만 사용가능
		System.out.println(v);//지역변수가 우선순위가 높아서 20이다.
		System.out.println(this.v);//전역변수 v가 나온다.
	}
}

	public class Scope7 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
	}
}
