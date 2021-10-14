import java.util.Scanner;
public class YearProfit {
	int j , f , m , a , may , jun , jul , au , sep , oct , no , de;
	
	public YearProfit(int j, int f, int m, int a, int may, int jun, int jul, int au, int sep, int oct, int no, int de) {
		super();
		this.j = j;
		this.f = f;
		this.m = m;
		this.a = a;
		this.may = may;
		this.jun = jun;
		this.jul = jul;
		this.au = au;
		this.sep = sep;
		this.oct = oct;
		this.no = no;
		this.de = de;
		
	}
	
	public void sum() {
		Scanner in = new Scanner(System.in);
		int sum, first, second, third, fourth;
		System.out.print("1월 수익 : ");
		j = in.nextInt();
		System.out.print("2월 수익 : ");
		f = in.nextInt();
		System.out.print("3월 수익 : ");
		m = in.nextInt();
		System.out.print("4월 수익 : ");
		a = in.nextInt();
		System.out.print("5월 수익 : ");
		may = in.nextInt();
		System.out.print("6월 수익 : ");
		jun = in.nextInt();
		System.out.print("7월 수익 : ");
		jul = in.nextInt();
		System.out.print("8월 수익 : ");
		au = in.nextInt();
		System.out.print("9월 수익 : ");
		sep = in.nextInt();
		System.out.print("10월 수익 : ");
		oct = in.nextInt();
		System.out.print("11월 수익 : ");
		no = in.nextInt();
		System.out.print("12월 수익 : ");
		de = in.nextInt();
		
		first = j + f + m ;
		second = a + may + jun;
		third = jul + au + sep;
		fourth = oct + no + de;
		sum = j + f + m + a + may + jun + jul + au + sep + oct + no + de;
		System.out.println("1분기 총 수익 : " + first);
		System.out.println("2분기 총 수익 : " + second);
		System.out.println("3분기 총 수익 : " + third);
		System.out.println("4분기 총 수익 : " + fourth);
		System.out.println("년 간 총 수익 : " + sum);
	}
	
	public void avg() {
		Scanner in = new Scanner(System.in);
		int avg, first, second, third, fourth;
		System.out.print("1월 수익 : ");
		j = in.nextInt();
		System.out.print("2월 수익 : ");
		f = in.nextInt();
		System.out.print("3월 수익 : ");
		m = in.nextInt();
		System.out.print("4월 수익 : ");
		a = in.nextInt();
		System.out.print("5월 수익 : ");
		may = in.nextInt();
		System.out.print("6월 수익 : ");
		jun = in.nextInt();
		System.out.print("7월 수익 : ");
		jul = in.nextInt();
		System.out.print("8월 수익 : ");
		au = in.nextInt();
		System.out.print("9월 수익 : ");
		sep = in.nextInt();
		System.out.print("10월 수익 : ");
		oct = in.nextInt();
		System.out.print("11월 수익 : ");
		no = in.nextInt();
		System.out.print("12월 수익 : ");
		de = in.nextInt();
		
		first = (j + f + m) / 3;
		second = (a + may + jun) / 3;
		third = (jul + au + sep) / 3;
		fourth = (oct + no + de) / 3;
		avg = (j + f + m + a + may + jun + jul + au + sep + oct + no + de) / 12;
		System.out.println("1분기 총 수익 평균 : " + first);
		System.out.println("2분기 총 수익 평균 : " + second);
		System.out.println("3분기 총 수익 평균 : " + third);
		System.out.println("4분기 총 수익 평균 : " + fourth);
		System.out.println("년 간 총 수익 평균 : " + avg);
	}
	
	public void comparison() {
		
		Scanner in = new Scanner(System.in);
		int min = 0, max = 0, first, second, third, fourth;
		System.out.print("1월 수익 : ");
		j = in.nextInt();
		System.out.print("2월 수익 : ");
		f = in.nextInt();
		System.out.print("3월 수익 : ");
		m = in.nextInt();
		System.out.print("4월 수익 : ");
		a = in.nextInt();
		System.out.print("5월 수익 : ");
		may = in.nextInt();
		System.out.print("6월 수익 : ");
		jun = in.nextInt();
		System.out.print("7월 수익 : ");
		jul = in.nextInt();
		System.out.print("8월 수익 : ");
		au = in.nextInt();
		System.out.print("9월 수익 : ");
		sep = in.nextInt();
		System.out.print("10월 수익 : ");
		oct = in.nextInt();
		System.out.print("11월 수익 : ");
		no = in.nextInt();
		System.out.print("12월 수익 : ");
		de = in.nextInt();
		
		first = j + f + m ;
		second = a + may + jun;
		third = jul + au + sep;
		fourth = oct + no + de;
		
		if (first > second && first > third && first > fourth) {
			System.out.println("분기별 최고 수익은 1분기 "+ first +"원 입니다.");
		}
		else if (second > first && second > third && second > fourth) {
			System.out.println("분기별 최고 수익은 2분기 "+ second +"원 입니다.");
		}
		else if (third > first && third > second && third > fourth) {
			System.out.println("분기별 최고 수익은 3분기 "+ third +"원 입니다.");
		}
		else if (fourth > first && fourth > second && fourth > third) {
			System.out.println("분기별 최고 수익은 4분기 "+ fourth +"원입니다.");
		}
		else {
			System.out.println("최고 수익이 두 분기 이상 같습니다.");
			System.out.println("1분기 : "+ first);
			System.out.println("2분기 : "+ second);
			System.out.println("3분기 : "+ third);
			System.out.println("4분기 : "+ fourth);
		}
		
		if (first < second && first < third && first < fourth) {
			System.out.println("분기별 최저 수익은 1분기 "+ first +"원 입니다.");
		}
		else if (second < first && second < third && second < fourth) {
			System.out.println("분기별 최저 수익은 2분기 "+ second +"원 입니다.");
		}
		else if (third < first && third < second && third < fourth) {
			System.out.println("분기별 최저 수익은 3분기 "+ third +"원 입니다.");
		}
		else if (fourth < first && fourth < second && fourth < third) {
			System.out.println("분기별 최저 수익은 4분기 "+ fourth +"원 입니다.");
		}
		else {
			System.out.println("최저 수익이 두 분기 이상 같습니다.");
			System.out.println("1분기 : "+ first);
			System.out.println("2분기 : "+ second);
			System.out.println("3분기 : "+ third);
			System.out.println("4분기 : "+ fourth);
		}
	}
}
