package Member;

class CalculatorDemo2{
	static double PI=3.14;//��ü���� �ٸ� ���� ���� �ʴ´�. ������ ��ü���� �Ȱ��� ������ �ִ� ���� �����ʴ�.
	static int base = 0;
	int left, right;

	public CalculatorDemo2(int left,int right){
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
public class Calculator2{

	public static void main(String[] args) {
		CalculatorDemo2 c1= new CalculatorDemo2(10,20);//Calculator��� Ŭ����(Ŭ������ �ƴ� ������)�� new�� ���� �ν��Ͻ�ȭ ���Ѽ� c1�� ��´�.
		//c1.setOperands(10,20);//left�� right�� �̸��� ������ ������ ������ c1�� c2������ ���� �ٸ���. �ν��Ͻ� ���� ���� �ٸ� ���� �ʱ�ȭ�ϰ� �ʹ�.
		c1.sum();

		System.out.println(c1.PI);

		CalculatorDemo2 c2 = new CalculatorDemo2(20,40);//�ν��Ͻ� ������
		//c2.setOperands(20,40);
		c2.sum();
		System.out.println(c2.PI);

		Calculator.base = 10;

		c1.sum();


	}
}

