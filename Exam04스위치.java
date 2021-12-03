
public class Exam04스위치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// swich - 조건문
		// 값이 나오는 식을 적는다
		int num = 10;
		// num의 값이 10이면 안녕하세요
		// 20이면 안녕히 가세요
		// 30이면 어서오세요
		// 이외의 숫자를 입력하면 정확한 숫자가 아닙니다.
		//점프 테이블이라고 불린다. 속도가 빠르다는 장점이 있다.
		//예)자판기
		//비교나 범위값을 쓰면 if문을 쓴다.

		switch (num) {
		case 10:
			System.out.println("안녕하세요");
			break;
		case 20:
			System.out.println("안녕히가세요");
			break;
		case 30:
			System.out.println("어서오세요");
			break;
		default:
			System.out.println("정확한 숫자가 아닙니다.");
			break;
		}

	}

}
