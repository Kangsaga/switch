import java.util.Scanner;

public class Exam05��ĳ�ʽ���ġȦ¦���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int num1 = num % 2;
		switch (num1) {
			case 0:
				System.out.println("¦���Դϴ�!");
				break;
			case 1:
				System.out.println("Ȧ���Դϴ�!");
				break;
		}
		
		
		sc.close();
		
		
	}

}
