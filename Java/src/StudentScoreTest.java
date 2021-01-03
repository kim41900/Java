
public class StudentScoreTest {
	public static void main(String[] args) {
		
		StudentScore kim = new StudentScore(100,"james");
		kim.setKorea( 100);
		kim.setMath( 100);
		
		StudentScore lee = new StudentScore(101,"kim");
		lee.setKorea( 80);
		lee.setMath( 60);
		
		kim.showStudentInfo();
		lee.showStudentInfo();
	}

}
