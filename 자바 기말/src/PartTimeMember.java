import java.util.Scanner;
public class PartTimeMember {
	private String name;
	private int age; // ex) 24
	private int finish; // 20200102
	static PartTimeMember[] parttimemember = null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getFinish() {
		return finish;
	}
	public void setFinish(int finish) {
		this.finish = finish;
	}
	public PartTimeMember(String name, int age, int finish) {
		super();
		this.name = name;
		this.age = age;
		this.finish = finish;
	}
	public static void show(){
		Scanner in = new Scanner(System.in);
		System.out.println("�˹ٻ��� �� ���Դϱ�?");
		int number = in.nextInt();
		String name;
		int age, finish;
		parttimemember = new PartTimeMember[number];
		for(int i=0;i<number;i++){
			System.out.print("�̸� : ");
			name = in.next();
			System.out.print("���� : ");
			age = in.nextInt();
			System.out.print("�˹� ������ : ");
			finish = in.nextInt();
			System.out.println("==================");
			}
		}

}
