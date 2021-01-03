package Member;

class Calculator {
	static double PI=3.14;//객체마다 다른 값을 갖지 않는다. 각각의 객체마다 똑같은 정보를 주는 경우는 옳지않다.
	static int base = 0;
	int left, right;

	public void setOperands(int left,int right){
		this.left =left;
		this.right =right; //this.은 우리가 생성한 c1에 담겨있는 Calculator라는 클래스를 구체화 시킨 인스턴스를 가리키는 것을 this라고 한다. this.left는 Calculator를 정의할 때 int left 변수를 가르키는 것이다. this는 인스턴스 자신을 의미 ,객체 전역에서 접근 가능한 int left라는 변수에 담김
	}
	public void sum(){//sum과 avg는 우리가 가진 값에 따라 다른 값을 갖게 된다. 왜냐? 객체마다 다른 변수값을 갖기 때문이다.  
		System.out.println(this.left+this.right+base);
	}
	public void avg(){
		System.out.println((this.left+this.right+base)/2);
	}
}
public class Calculator1{

	public static void main(String[] args) {
		Calculator c1= new Calculator();//Calculator라는 클래스를 new를 통해 인스턴스화 시켜서 c1에 담는다.
		//c1.setOperands(10,20);//left와 right의 이름의 변수를 가지고 있지만 c1과 c2변수의 값은 다르다. 인스턴스 마다 서로 다른 값을 초기화하고 싶다.
		c1.sum();
		System.out.println(c1.PI);
		
		Calculator c2= new Calculator();
		c2.setOperands(20,40);
		c2.sum();
		System.out.println(c2.PI);
		
		Calculator.base = 10;
		
		c1.sum();
		
	
	}
}

