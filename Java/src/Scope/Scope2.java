package Scope;

public class Scope2 {
	static int i;//전역변수:클래스에 직접 속해있는 변수

	static void a(){
		i=0;
	}

	public static void main(String[] args) {
		for(i=0;i<5;i++) {
			a();
			System.out.println(i);
		}
		
	}

}
