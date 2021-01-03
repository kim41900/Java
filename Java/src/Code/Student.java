package Code;

public class Student {

	String studentName;
	String studentAddress;
	
	public Student(String name,String address) {
		studentName = name;
		studentAddress = address;

		System.out.print(studentName+studentAddress);
	}
	public static void main(String[] args) {
		Student studentLee = new Student("³ª¸®","±¤Áø±¸");
		
		
	}
	


}