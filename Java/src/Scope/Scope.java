package Scope;

public class Scope {
	
	static void a(){
		int i=0;//지역변수:메소드에 속해있는 변수
	}

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			a();
			System.out.println(i);
		}
		
	}

}
