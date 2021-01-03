
public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rank = 1;
		char medalColor;
		
		switch(rank){
			case 1: case 4: case 5: 
				medalColor = 'G';
				break;
			case 2: medalColor = 'S';
				break;
			case 3 : medalColor = 'B';
				break;
			default: medalColor = 'A';
			
		}
		System.out.println(rank+"메달의 색은"+medalColor);
	}

}
