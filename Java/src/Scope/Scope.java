package Scope;

public class Scope {
	
	static void a(){
		int i=0;//��������:�޼ҵ忡 �����ִ� ����
	}

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			a();
			System.out.println(i);
		}
		
	}

}
