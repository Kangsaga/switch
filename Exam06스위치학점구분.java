import java.util.Scanner;

public class Exam06����ġ�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int ts = sc.nextInt();

		switch (ts / 10) {
		case 10:
		case 9:
			System.out.println("A�����Դϴ�.");
			break;
		case 8:
			System.out.println("B�����Դϴ�");
			break;
		case 7:
			System.out.println("C�����Դϴ�");
			break;
		default:
			System.out.println("D�����Դϴ�");
		}

		sc.close();
	}

}
