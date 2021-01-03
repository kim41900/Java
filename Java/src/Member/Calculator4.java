package Member;

class CalculatorDemo4{
	static double PI=3.14;//객체마다 다른 값을 갖지 않는다. 각각의 객체마다 똑같은 정보를 주는 경우는 옳지않다.
	static int base = 0;
	int left, right;

	public CalculatorDemo4(int left,int right){
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

class SubstractionableCalculator extends CalculatorDemo4 {
	public SubstractionableCalculator(int left,int right){
		super(left,right);//부모클래스의 생성자
	}
	public void substruct() {
		System.out.println(this.left-this.right);
	}
}

class Multiplicationable extends CalculatorDemo4{
	
	public Multiplicationable(int left,int right){
		super(left,right); 
	}
	public void multipliCation() {
		System.out.println(this.left*this.right);
	}
}
class Divisionable extends  Multiplicationable{
	public Divisionable(int left,int right){
		super(left,right); 
	}
	public void devision() {
		System.out.println(this.left/this.right);
	}
}




public class Calculator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstractionableCalculator c1 = new  SubstractionableCalculator(10,20);
		
		c1.sum();
		c1.avg();
		c1.substruct();
		
		Multiplicationable c2 = new Multiplicationable(20,40);
		
		c2.sum();
		c2.avg();
		c2.multipliCation();
		
		Divisionable c3 = new Divisionable(50,20);
		c3.multipliCation();
		c3.devision();
		
	}
}
