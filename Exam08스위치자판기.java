import java.util.Scanner;

public class Exam08����ġ���Ǳ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		System.out.println("�޴��� ������");
		System.out.print("1. �ݶ�(800��) 2. ���� (500��) 3. ��Ÿ�ο���(1500��) >>");
		int select = sc.nextInt();
		
		//int coke = 800;
		//int water = 500;
		//int vitamien = 1500;
		int result = 0;
		
		
		switch (select) {
		case 1:
			//System.out.println(money >= coke ? "�ܵ� :" + (money - coke) +"��" : "���� �����ؿ�");
			//System.out.println(money <= coke ? "�ܵ� :" + money +"��" : "");
			result = money - 800;
			//System.out.println("�ܵ� :" + (money - coke) +"��");
			//money -=coke;
			break;
		case 2:
			//System.out.println(money >= water ? "�ܵ� :" + (money - water) +"��" : "���� �����ؿ�");
			//System.out.println(money <= water ? "�ܵ� :" + money +"��" : "");
			result = money - 500;
			//System.out.println("�ܵ� :" + (money - water) +"��");
			//money -=water;
			break;
		case 3:
			//System.out.println(money >= vitamien ? "�ܵ� :" + (money - vitamien) +"��" : "���� �����ؿ�");
			//System.out.println(money <= vitamien ? "�ܵ� :" + money +"��" : "");
			result = money - 1500;
			//System.out.println("�ܵ� :" + (money - vitamien) +"��");
			//money -=vitamien;
			break;
		}
		if(result < 0) {
			System.out.println("���� �����ؿ�");
		}
		else {
			System.out.println("���ְ� �弼��");
			System.out.println("�ܵ���" + result);
		}
		//System.out.println("�ܵ� :" + money +"��");
		sc.close();
		
	}

}
