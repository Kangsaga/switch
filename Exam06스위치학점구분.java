import java.util.Scanner;

public class Exam06스위치학점구분 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int ts = sc.nextInt();

		switch (ts / 10) {
		case 10:
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다");
			break;
		case 7:
			System.out.println("C학점입니다");
			break;
		default:
			System.out.println("D학점입니다");
		}

		sc.close();
	}

}
