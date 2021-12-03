import java.util.Scanner;

public class Exam07스위치계절구분 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int moon = sc.nextInt();
		switch (moon) {
		//자바 12버전부터 사용가능
		case 12, 1, 2:
			System.out.println(moon + "월은 겨울입니다!");
			break;
		case 3, 4, 5:
			System.out.println(moon + "월은 봄입니다!");
			break;
		case 6, 7, 8:
			System.out.println(moon + "월은 여름입니다!");
			break;
		case 9, 10, 11:
			System.out.println(moon + "월은 가을입니다!");
			break;
		}
		sc.close();
		
	}

}
