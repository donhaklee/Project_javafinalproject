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
		System.out.print("1�� ���� : ");
		j = in.nextInt();
		System.out.print("2�� ���� : ");
		f = in.nextInt();
		System.out.print("3�� ���� : ");
		m = in.nextInt();
		System.out.print("4�� ���� : ");
		a = in.nextInt();
		System.out.print("5�� ���� : ");
		may = in.nextInt();
		System.out.print("6�� ���� : ");
		jun = in.nextInt();
		System.out.print("7�� ���� : ");
		jul = in.nextInt();
		System.out.print("8�� ���� : ");
		au = in.nextInt();
		System.out.print("9�� ���� : ");
		sep = in.nextInt();
		System.out.print("10�� ���� : ");
		oct = in.nextInt();
		System.out.print("11�� ���� : ");
		no = in.nextInt();
		System.out.print("12�� ���� : ");
		de = in.nextInt();
		
		first = j + f + m ;
		second = a + may + jun;
		third = jul + au + sep;
		fourth = oct + no + de;
		sum = j + f + m + a + may + jun + jul + au + sep + oct + no + de;
		System.out.println("1�б� �� ���� : " + first);
		System.out.println("2�б� �� ���� : " + second);
		System.out.println("3�б� �� ���� : " + third);
		System.out.println("4�б� �� ���� : " + fourth);
		System.out.println("�� �� �� ���� : " + sum);
	}
	
	public void avg() {
		Scanner in = new Scanner(System.in);
		int avg, first, second, third, fourth;
		System.out.print("1�� ���� : ");
		j = in.nextInt();
		System.out.print("2�� ���� : ");
		f = in.nextInt();
		System.out.print("3�� ���� : ");
		m = in.nextInt();
		System.out.print("4�� ���� : ");
		a = in.nextInt();
		System.out.print("5�� ���� : ");
		may = in.nextInt();
		System.out.print("6�� ���� : ");
		jun = in.nextInt();
		System.out.print("7�� ���� : ");
		jul = in.nextInt();
		System.out.print("8�� ���� : ");
		au = in.nextInt();
		System.out.print("9�� ���� : ");
		sep = in.nextInt();
		System.out.print("10�� ���� : ");
		oct = in.nextInt();
		System.out.print("11�� ���� : ");
		no = in.nextInt();
		System.out.print("12�� ���� : ");
		de = in.nextInt();
		
		first = (j + f + m) / 3;
		second = (a + may + jun) / 3;
		third = (jul + au + sep) / 3;
		fourth = (oct + no + de) / 3;
		avg = (j + f + m + a + may + jun + jul + au + sep + oct + no + de) / 12;
		System.out.println("1�б� �� ���� ��� : " + first);
		System.out.println("2�б� �� ���� ��� : " + second);
		System.out.println("3�б� �� ���� ��� : " + third);
		System.out.println("4�б� �� ���� ��� : " + fourth);
		System.out.println("�� �� �� ���� ��� : " + avg);
	}
	
	public void comparison() {
		
		Scanner in = new Scanner(System.in);
		int min = 0, max = 0, first, second, third, fourth;
		System.out.print("1�� ���� : ");
		j = in.nextInt();
		System.out.print("2�� ���� : ");
		f = in.nextInt();
		System.out.print("3�� ���� : ");
		m = in.nextInt();
		System.out.print("4�� ���� : ");
		a = in.nextInt();
		System.out.print("5�� ���� : ");
		may = in.nextInt();
		System.out.print("6�� ���� : ");
		jun = in.nextInt();
		System.out.print("7�� ���� : ");
		jul = in.nextInt();
		System.out.print("8�� ���� : ");
		au = in.nextInt();
		System.out.print("9�� ���� : ");
		sep = in.nextInt();
		System.out.print("10�� ���� : ");
		oct = in.nextInt();
		System.out.print("11�� ���� : ");
		no = in.nextInt();
		System.out.print("12�� ���� : ");
		de = in.nextInt();
		
		first = j + f + m ;
		second = a + may + jun;
		third = jul + au + sep;
		fourth = oct + no + de;
		
		if (first > second && first > third && first > fourth) {
			System.out.println("�б⺰ �ְ� ������ 1�б� "+ first +"�� �Դϴ�.");
		}
		else if (second > first && second > third && second > fourth) {
			System.out.println("�б⺰ �ְ� ������ 2�б� "+ second +"�� �Դϴ�.");
		}
		else if (third > first && third > second && third > fourth) {
			System.out.println("�б⺰ �ְ� ������ 3�б� "+ third +"�� �Դϴ�.");
		}
		else if (fourth > first && fourth > second && fourth > third) {
			System.out.println("�б⺰ �ְ� ������ 4�б� "+ fourth +"���Դϴ�.");
		}
		else {
			System.out.println("�ְ� ������ �� �б� �̻� �����ϴ�.");
			System.out.println("1�б� : "+ first);
			System.out.println("2�б� : "+ second);
			System.out.println("3�б� : "+ third);
			System.out.println("4�б� : "+ fourth);
		}
		
		if (first < second && first < third && first < fourth) {
			System.out.println("�б⺰ ���� ������ 1�б� "+ first +"�� �Դϴ�.");
		}
		else if (second < first && second < third && second < fourth) {
			System.out.println("�б⺰ ���� ������ 2�б� "+ second +"�� �Դϴ�.");
		}
		else if (third < first && third < second && third < fourth) {
			System.out.println("�б⺰ ���� ������ 3�б� "+ third +"�� �Դϴ�.");
		}
		else if (fourth < first && fourth < second && fourth < third) {
			System.out.println("�б⺰ ���� ������ 4�б� "+ fourth +"�� �Դϴ�.");
		}
		else {
			System.out.println("���� ������ �� �б� �̻� �����ϴ�.");
			System.out.println("1�б� : "+ first);
			System.out.println("2�б� : "+ second);
			System.out.println("3�б� : "+ third);
			System.out.println("4�б� : "+ fourth);
		}
	}
}
