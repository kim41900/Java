package Member;

class CalculatorDemo4{
	static double PI=3.14;//��ü���� �ٸ� ���� ���� �ʴ´�. ������ ��ü���� �Ȱ��� ������ �ִ� ���� �����ʴ�.
	static int base = 0;
	int left, right;

	public CalculatorDemo4(int left,int right){
		this.left =left;
		this.right =right; //this.�� �츮�� ������ c1�� ����ִ� Calculator��� Ŭ������ ��üȭ ��Ų �ν��Ͻ��� ����Ű�� ���� this��� �Ѵ�. this.left�� Calculator�� ������ �� int left ������ ����Ű�� ���̴�. this�� �ν��Ͻ� �ڽ��� �ǹ� ,��ü �������� ���� ������ int left��� ������ ���
	}
	public void sum(){//sum�� avg�� �츮�� ���� ���� ���� �ٸ� ���� ���� �ȴ�. �ֳ�? ��ü���� �ٸ� �������� ���� �����̴�.  
		System.out.println(this.left+this.right+base);
	}
	public void avg(){
		System.out.println((this.left+this.right+base)/2);
	}
}

class SubstractionableCalculator extends CalculatorDemo4 {
	public SubstractionableCalculator(int left,int right){
		super(left,right);//�θ�Ŭ������ ������
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
