import java.io.IOException;
import java.util.Scanner;

public class Manager {
	Scanner in = new Scanner(System.in);
	
	public void System() {
		int menu;

		Scanner in = new Scanner(System.in);
		do {
			System.out.println("**** 쥬얼리 가계 돈 관리 프로그램 ****");
			System.out.println("     	 1. 사용법");
			System.out.println("      	 2. 매출액");
			System.out.println("     	 3. 알바 급여 계산");
			System.out.println("     	 4. 한 달 순 수익 계산");  
			System.out.println("     	 5. 년 간 수익 총 합 및 평균");
			System.out.println("         6. 알바생 등록");
			System.out.println("         7. 파일 입출력");
			System.out.println("      	 0. 프로그램 종료");
			System.out.print("메뉴선택 : "); 
			menu = in.nextInt();
			in.nextLine();
			switch(menu) {
			case 1: HowToUse() ;  break;
			case 2: Income() ; break;
			case 3: Calculator.PartTimeIncome() ; break;
			case 4: Calculator.Salary() ; break;
			case 5: Calculator.Year(); break;
			case 6: PartTimeMember.show();break;
			case 7: try {
					Main.FileRead();
				} catch (IOException e) {
					e.printStackTrace();
				}break;
			}
		} while(menu != 0);
	}
	public void HowToUse() {
		int menu;
		do {
			System.out.println("**** 사용법 ****");
			System.out.println("   1. 매출액");
			System.out.println("   2. 알바 급여 계산");
			System.out.println("   3. 한달 순수익 계산");
			System.out.println("   4. 년 간 수익 총 합 및 평균 확인");
			System.out.println("   5. 알바생 등록");
			System.out.println("   0. 목록으로");
			System.out.print("메뉴선택 : "); 
			menu = in.nextInt();
			in.nextLine();
			switch(menu) {
			case 1: System.out.println("판매한 각각의 쥬얼리의 수량을 기입하시면 수입 금액이 표기 됩니다."); break;
			case 2: System.out.println("평일알바와 주말알바가 일을 한 시간을 기입하시면 월급이 표기 됩니다."); break;
			case 3: System.out.println("판매수익, 임대료, 상 하수도 요금, 전기세, 알바급여비 5가지를 입력하면 세금을 뺀 한 달 순수익을 계산할 수 있습니다."); break;
			case 4: System.out.println("매월 수익을 입력하시면 해당 년도의 총 합과 평균 값, 분기별 수익을 알 수 있습니다."); break;
			case 5: System.out.println("알바생의 수를 입력하시고 이름, 나이, 계약 종료 예정일까지 기입하시면 됩니다."); break;
			}
		} while(menu != 0);
		System();
	}
	public void Income() {
		int s, r, g, d, sum;
		System.out.print("사파이어 : ");
		s = in.nextInt();
		System.out.print("루비 : ");
		r = in.nextInt();
		System.out.print("골드 : ");
		g = in.nextInt();
		System.out.print("다이아몬드 : ");
		d = in.nextInt();
		sum = s*10000 + r*20000 + g*50000 + d*100000;
		System.out.println("판매 수익 :" + sum);
	}
}
