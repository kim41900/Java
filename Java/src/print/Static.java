package print;
class Fool {

	public static String classVar = "I class";
	public String instanceVar = "I instance";
	public static void classMethod() {
		System.out.println(classVar);//ok
		//System.out.println(instanceVar);//no
	}
	
	public void instanceMethod() {
		System.out.println(classVar);//ok
		System.out.println(instanceVar);//ok
	}

}

public class Static {
	public static void main(String[] args) {
	System.out.println(Fool.classVar);//ok
	//System.out.println(Fool.instanceVar);//no
	
	Fool.classMethod();//ok
	//f1.instanceMethod();//no
	
	Fool f1 = new Fool();
	}

}
