
public class Student{
	 int studentID;//����
	 String studentName;
	 int grade;
	 String address;
	
	public Student() {//������ �����ε�
		
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
