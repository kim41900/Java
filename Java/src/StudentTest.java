
public class StudentTest {
	public static void main(String[] args) {

		Student studentLee = new Student(100, "�̼���");//��ü ����
	
		studentLee.address = "����� �������� ���ǵ���";

		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "�̱� ��ȣ��";

		studentLee.showStudent();
		studentKim.showStudent();
		System.out.println(studentLee);//������
		System.out.println(studentKim);


	}

}
