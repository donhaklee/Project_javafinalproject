import java.io.IOException;
import java.util.Scanner;

public class Manager {
	Scanner in = new Scanner(System.in);
	
	public void System() {
		int menu;

		Scanner in = new Scanner(System.in);
		do {
			System.out.println("**** ��� ���� �� ���� ���α׷� ****");
			System.out.println("     	 1. ����");
			System.out.println("      	 2. �����");
			System.out.println("     	 3. �˹� �޿� ���");
			System.out.println("     	 4. �� �� �� ���� ���");  
			System.out.println("     	 5. �� �� ���� �� �� �� ���");
			System.out.println("         6. �˹ٻ� ���");
			System.out.println("         7. ���� �����");
			System.out.println("      	 0. ���α׷� ����");
			System.out.print("�޴����� : "); 
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
			System.out.println("**** ���� ****");
			System.out.println("   1. �����");
			System.out.println("   2. �˹� �޿� ���");
			System.out.println("   3. �Ѵ� ������ ���");
			System.out.println("   4. �� �� ���� �� �� �� ��� Ȯ��");
			System.out.println("   5. �˹ٻ� ���");
			System.out.println("   0. �������");
			System.out.print("�޴����� : "); 
			menu = in.nextInt();
			in.nextLine();
			switch(menu) {
			case 1: System.out.println("�Ǹ��� ������ ����� ������ �����Ͻø� ���� �ݾ��� ǥ�� �˴ϴ�."); break;
			case 2: System.out.println("���Ͼ˹ٿ� �ָ��˹ٰ� ���� �� �ð��� �����Ͻø� ������ ǥ�� �˴ϴ�."); break;
			case 3: System.out.println("�Ǹż���, �Ӵ��, �� �ϼ��� ���, ���⼼, �˹ٱ޿��� 5������ �Է��ϸ� ������ �� �� �� �������� ����� �� �ֽ��ϴ�."); break;
			case 4: System.out.println("�ſ� ������ �Է��Ͻø� �ش� �⵵�� �� �հ� ��� ��, �б⺰ ������ �� �� �ֽ��ϴ�."); break;
			case 5: System.out.println("�˹ٻ��� ���� �Է��Ͻð� �̸�, ����, ��� ���� �����ϱ��� �����Ͻø� �˴ϴ�."); break;
			}
		} while(menu != 0);
		System();
	}
	public void Income() {
		int s, r, g, d, sum;
		System.out.print("�����̾� : ");
		s = in.nextInt();
		System.out.print("��� : ");
		r = in.nextInt();
		System.out.print("��� : ");
		g = in.nextInt();
		System.out.print("���̾Ƹ�� : ");
		d = in.nextInt();
		sum = s*10000 + r*20000 + g*50000 + d*100000;
		System.out.println("�Ǹ� ���� :" + sum);
	}
}
