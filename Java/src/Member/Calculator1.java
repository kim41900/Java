package Member;

class Calculator {
	static double PI=3.14;//��ü���� �ٸ� ���� ���� �ʴ´�. ������ ��ü���� �Ȱ��� ������ �ִ� ���� �����ʴ�.
	static int base = 0;
	int left, right;

	public void setOperands(int left,int right){
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
public class Calculator1{

	public static void main(String[] args) {
		Calculator c1= new Calculator();//Calculator��� Ŭ������ new�� ���� �ν��Ͻ�ȭ ���Ѽ� c1�� ��´�.
		//c1.setOperands(10,20);//left�� right�� �̸��� ������ ������ ������ c1�� c2������ ���� �ٸ���. �ν��Ͻ� ���� ���� �ٸ� ���� �ʱ�ȭ�ϰ� �ʹ�.
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

