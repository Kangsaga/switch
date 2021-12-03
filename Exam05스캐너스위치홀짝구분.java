import java.util.Scanner;

public class Exam05스캐너스위치홀짝구분 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int num1 = num % 2;
		switch (num1) {
			case 0:
				System.out.println("짝수입니다!");
				break;
			case 1:
				System.out.println("홀수입니다!");
				break;
		}
		
		
		sc.close();
		
		
	}

}
