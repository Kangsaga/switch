
public class Exam04����ġ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// swich - ���ǹ�
		// ���� ������ ���� ���´�
		int num = 10;
		// num�� ���� 10�̸� �ȳ��ϼ���
		// 20�̸� �ȳ��� ������
		// 30�̸� �������
		// �̿��� ���ڸ� �Է��ϸ� ��Ȯ�� ���ڰ� �ƴմϴ�.
		//���� ���̺��̶�� �Ҹ���. �ӵ��� �����ٴ� ������ �ִ�.
		//��)���Ǳ�
		//�񱳳� �������� ���� if���� ����.

		switch (num) {
		case 10:
			System.out.println("�ȳ��ϼ���");
			break;
		case 20:
			System.out.println("�ȳ���������");
			break;
		case 30:
			System.out.println("�������");
			break;
		default:
			System.out.println("��Ȯ�� ���ڰ� �ƴմϴ�.");
			break;
		}

	}

}
