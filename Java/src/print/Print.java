package print;

public class Print {
	public static String delimeter="";

	public static void main(String[] args) {
		
		delimeter="----";
		printA();
		printA();
		printB();
		printB();
		
		delimeter="****";
		printA();
		printA();
		printB();
		printB();
		
	}

	private static void printB() {
		System.out.println(delimeter);
		System.out.println("B");
		System.out.println("B");
		
	}

	private static void printA() {
		System.out.println(delimeter);
		System.out.println("A");
		System.out.println("A");
		
	}

}
