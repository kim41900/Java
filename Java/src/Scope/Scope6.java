package Scope;

public class Scope6 {
	
	static int i=5;
	
	static void a() {
		int i=10;//������ ��ȿ����(a�� ������ �ִ� �������� 10�� b�� ��µȴ�)
		b();
	}
	static void b () {//������ ��ȿ����(�ڱ��ڽſ� �ְų� ���������� �޴� ������ ����)
		System.out.println(i);
	}

	public static void main(String[] args) {
		a();
	}

}
