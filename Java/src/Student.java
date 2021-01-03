
public class Student{
	 int studentID;//변수
	 String studentName;
	 int grade;
	 String address;
	
	public Student() {//생성자 오버로딩
		
	}
	public Student(int id, String name) {
		
	}

	public void showStudent() {
		System.out.println(studentName + "," + address);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;

	}



}
