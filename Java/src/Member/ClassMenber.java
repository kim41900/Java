package Member;

class C1 {
	static int static_variable = 1;
	int instance_Variable = 2;
	static void static_static() {//Ŭ���� �޼ҵ尡 Ŭ���� ������ ����
		System.out.println(static_variable);
	}
	static void static_instance() {//Ŭ���� �޼ҵ尡 �ν��Ͻ� ������ ����
		//System.out.println(instance_Variable);
	}
	
	 void instance_static() { //�ν��Ͻ� �޼ҵ尡 Ŭ���� ������ ����
		System.out.println(static_variable);
	}
	 void instance_instance() {//Ŭ���� �޼ҵ尡 Ŭ���� ������ ȣ���� ��
		System.out.println(instance_Variable);
	}
}
	public class ClassMenber{
		public static void main(String[] args) {
			C1 c = new C1();
			c.static_static();
			c.static_instance();
			c.instance_static();
			c.instance_instance();
			
			C1.static_static();
			C1.static_instance();
			//C1.instance_static();//Ŭ������ ���� �ν��Ͻ� �޼ҵ尡 Ŭ���� ������ ���� ->���� 
			//������ �ν��Ͻ��� �������� �ʾҴµ� �ν��Ͻ� �޼ҵ忡 �����Ϸ��� �ϸ� Ŭ���� ���忡���� ��� �ν��Ͻ��� �����϶�� ���ΰ� 
			//C1.instance_instance();
		}
		
	}

