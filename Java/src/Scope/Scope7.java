package Scope;

class C {
	int v =10;//�⺻��
	
	void m() {
		int v = 20;//m�޼ҵ� �ȿ����� ��밡��
		System.out.println(v);//���������� �켱������ ���Ƽ� 20�̴�.
		System.out.println(this.v);//�������� v�� ���´�.
	}
}

	public class Scope7 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
	}
}
