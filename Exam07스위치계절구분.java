import java.util.Scanner;

public class Exam07����ġ�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int moon = sc.nextInt();
		switch (moon) {
		//�ڹ� 12�������� ��밡��
		case 12, 1, 2:
			System.out.println(moon + "���� �ܿ��Դϴ�!");
			break;
		case 3, 4, 5:
			System.out.println(moon + "���� ���Դϴ�!");
			break;
		case 6, 7, 8:
			System.out.println(moon + "���� �����Դϴ�!");
			break;
		case 9, 10, 11:
			System.out.println(moon + "���� �����Դϴ�!");
			break;
		}
		sc.close();
		
	}

}
