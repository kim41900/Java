package Member;

class C1 {
	static int static_variable = 1;
	int instance_Variable = 2;
	static void static_static() {//클래스 메소드가 클래스 변수에 접근
		System.out.println(static_variable);
	}
	static void static_instance() {//클래스 메소드가 인스턴스 변수에 접근
		//System.out.println(instance_Variable);
	}
	
	 void instance_static() { //인스턴스 메소드가 클래스 변수에 접근
		System.out.println(static_variable);
	}
	 void instance_instance() {//클래스 메소드가 클래스 변수를 호출할 때
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
			//C1.instance_static();//클래스를 통해 인스턴스 메소드가 클래스 변수에 접근 ->실패 
			//이유는 인스턴스는 생성되지 않았는데 인스턴스 메소드에 접근하려고 하면 클래스 입장에서는 어던 인스턴스에 접속하라는 것인가 
			//C1.instance_instance();
		}
		
	}

