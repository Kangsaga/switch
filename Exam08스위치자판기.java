import java.util.Scanner;

public class Exam08½ºÀ§Ä¡ÀÚÆÇ±â {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("±İ¾×À» ÀÔ·ÂÇÏ¼¼¿ä : ");
		int money = sc.nextInt();
		System.out.println("¸Ş´º¸¦ °í¸£¼¼¿ä");
		System.out.print("1. Äİ¶ó(800¿ø) 2. »ı¼ö (500¿ø) 3. ºñÅ¸¹Î¿öÅÍ(1500¿ø) >>");
		int select = sc.nextInt();
		
		//int coke = 800;
		//int water = 500;
		//int vitamien = 1500;
		int result = 0;
		
		
		switch (select) {
		case 1:
			//System.out.println(money >= coke ? "ÀÜµ· :" + (money - coke) +"¿ø" : "µ·ÀÌ ºÎÁ·ÇØ¿ä");
			//System.out.println(money <= coke ? "ÀÜµ· :" + money +"¿ø" : "");
			result = money - 800;
			//System.out.println("ÀÜµ· :" + (money - coke) +"¿ø");
			//money -=coke;
			break;
		case 2:
			//System.out.println(money >= water ? "ÀÜµ· :" + (money - water) +"¿ø" : "µ·ÀÌ ºÎÁ·ÇØ¿ä");
			//System.out.println(money <= water ? "ÀÜµ· :" + money +"¿ø" : "");
			result = money - 500;
			//System.out.println("ÀÜµ· :" + (money - water) +"¿ø");
			//money -=water;
			break;
		case 3:
			//System.out.println(money >= vitamien ? "ÀÜµ· :" + (money - vitamien) +"¿ø" : "µ·ÀÌ ºÎÁ·ÇØ¿ä");
			//System.out.println(money <= vitamien ? "ÀÜµ· :" + money +"¿ø" : "");
			result = money - 1500;
			//System.out.println("ÀÜµ· :" + (money - vitamien) +"¿ø");
			//money -=vitamien;
			break;
		}
		if(result < 0) {
			System.out.println("µ·ÀÌ ºÎÁ·ÇØ¿ä");
		}
		else {
			System.out.println("¸ÀÀÖ°Ô µå¼¼¿ä");
			System.out.println("ÀÜµ·Àº" + result);
		}
		//System.out.println("ÀÜµ· :" + money +"¿ø");
		sc.close();
		
	}

}
