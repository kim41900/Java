
public class StudentTest {
	public static void main(String[] args) {

		Student studentLee = new Student(100, "이순신");//객체 생성
	
		studentLee.address = "서울시 영등포구 여의도동";

		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "미국 산호세";

		studentLee.showStudent();
		studentKim.showStudent();
		System.out.println(studentLee);//참조값
		System.out.println(studentKim);


	}

}
