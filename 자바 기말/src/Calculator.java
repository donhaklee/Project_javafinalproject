import java.util.Scanner;
public class Calculator {
	
	public static void PartTimeIncome() {
	
		Scanner in = new Scanner(System.in);
		int menu = 0;
		String name;
		do {
			System.out.println("**** �˹� �޿� ��� ****");
			int type, sum, pay, dayhour, nighthour;
			System.out.println("1. ���� �˹ٻ�");
			System.out.println("2. �ָ� �˹ٻ�");
			System.out.print("�Է� : ");
			type = in.nextInt();
			if (type == 1) {
				System.out.print("�̸� : ");
				name = in.next();
				System.out.print("�ñ� : ");
				pay = in.nextInt();
				System.out.print("�ְ� ���� �ð� : ");
				dayhour = in.nextInt();
				System.out.print("�߰� ���� �ð� : ");
				nighthour = in.nextInt();
				sum = (int) (dayhour * pay + nighthour * pay * 1.2);
				System.out.println("�˹ٺ� : " + sum);
			}
			else if (type == 2) {
				System.out.print("�̸� : ");
				name = in.next();
				System.out.print("�ñ� : ");
				pay = in.nextInt();
				System.out.print("�ְ� ���� �ð� : ");
				dayhour = in.nextInt();
				System.out.print("�߰� ���� �ð� : ");
				nighthour = in.nextInt();
				sum = (int) (dayhour * pay + nighthour * pay*1.3);
				System.out.println("�˹ٺ� : " + sum);
			}
			
		} while(menu != 0);
	}
	
	public static void Salary() {
		Scanner in = new Scanner(System.in);
		int sell, store, water, elect, parttime, profit = 0;
		System.out.print("����� : ");
		sell = in.nextInt();
		System.out.print("�Ӵ�� : ");
		store = in.nextInt();
		System.out.print("�� �ϼ��� ��� : ");
		water = in.nextInt();
		System.out.print("���⼼ : ");
		elect = in.nextInt();
		System.out.print("�˹ٱ޿��� : ");
		parttime = in.nextInt();
		if(sell < 50000000) {
			profit = (int) (sell - (store + elect + water + parttime + (sell*0.2))) ;
		}
		else if (sell >= 50000000){
			profit = (int) (sell - (store + elect + water + parttime + (sell*0.3))) ;
		}
		System.out.println("�� �� �� ���� :" + profit);
	}
	
	public static void Year() {
		Scanner in = new Scanner(System.in);
		YearProfit yp = new YearProfit(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		int menu;
		do {
			System.out.println("**** �� �� ���� �� �� �� ��� ****");
			System.out.println("  		1. �� �� ���");
			System.out.println("  	 	2. ��� ���");
			System.out.println("  		3. �б⺰ �� �ľ�");
			System.out.println(" 		0. �������");
			System.out.print("�޴����� : "); 
			menu = in.nextInt();
			in.nextLine();
			switch(menu) {
			case 1: yp.sum(); break;
			case 2: yp.avg(); break;
			case 3: yp.comparison(); break;
			}
		} while(menu != 0);
	}
}
