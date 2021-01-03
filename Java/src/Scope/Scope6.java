package Scope;

public class Scope6 {
	
	static int i=5;
	
	static void a() {
		int i=10;//동적인 유효범위(a가 가지고 있는 지역변수 10이 b에 출력된다)
		b();
	}
	static void b () {//정적인 유효범위(자기자신에 있거나 전역변수를 받는 고정된 범위)
		System.out.println(i);
	}

	public static void main(String[] args) {
		a();
	}

}
