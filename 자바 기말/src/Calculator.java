import java.util.Scanner;
public class Calculator {
	
	public static void PartTimeIncome() {
	
		Scanner in = new Scanner(System.in);
		int menu = 0;
		String name;
		do {
			System.out.println("**** 알바 급여 계산 ****");
			int type, sum, pay, dayhour, nighthour;
			System.out.println("1. 평일 알바생");
			System.out.println("2. 주말 알바생");
			System.out.print("입력 : ");
			type = in.nextInt();
			if (type == 1) {
				System.out.print("이름 : ");
				name = in.next();
				System.out.print("시급 : ");
				pay = in.nextInt();
				System.out.print("주간 업무 시간 : ");
				dayhour = in.nextInt();
				System.out.print("야간 업무 시간 : ");
				nighthour = in.nextInt();
				sum = (int) (dayhour * pay + nighthour * pay * 1.2);
				System.out.println("알바비 : " + sum);
			}
			else if (type == 2) {
				System.out.print("이름 : ");
				name = in.next();
				System.out.print("시급 : ");
				pay = in.nextInt();
				System.out.print("주간 업무 시간 : ");
				dayhour = in.nextInt();
				System.out.print("야간 업무 시간 : ");
				nighthour = in.nextInt();
				sum = (int) (dayhour * pay + nighthour * pay*1.3);
				System.out.println("알바비 : " + sum);
			}
			
		} while(menu != 0);
	}
	
	public static void Salary() {
		Scanner in = new Scanner(System.in);
		int sell, store, water, elect, parttime, profit = 0;
		System.out.print("매출액 : ");
		sell = in.nextInt();
		System.out.print("임대료 : ");
		store = in.nextInt();
		System.out.print("상 하수도 요금 : ");
		water = in.nextInt();
		System.out.print("전기세 : ");
		elect = in.nextInt();
		System.out.print("알바급여비 : ");
		parttime = in.nextInt();
		if(sell < 50000000) {
			profit = (int) (sell - (store + elect + water + parttime + (sell*0.2))) ;
		}
		else if (sell >= 50000000){
			profit = (int) (sell - (store + elect + water + parttime + (sell*0.3))) ;
		}
		System.out.println("한 달 순 수익 :" + profit);
	}
	
	public static void Year() {
		Scanner in = new Scanner(System.in);
		YearProfit yp = new YearProfit(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		int menu;
		do {
			System.out.println("**** 년 간 수익 총 합 및 평균 ****");
			System.out.println("  		1. 총 합 계산");
			System.out.println("  	 	2. 평균 계산");
			System.out.println("  		3. 분기별 비교 파악");
			System.out.println(" 		0. 목록으로");
			System.out.print("메뉴선택 : "); 
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
