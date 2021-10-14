import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Manager mgr = new Manager();
		
		mgr.System();
		
	}
	public static void FileRead() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\abc\\workspace\\MoneyManagement\\bin\\Main.class"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;
            System.out.println(line);
        }
        br.close();
        
        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\abc\\workspace\\MoneyManagement\\bin\\Manager.class"));
        while(true) {
            String line = br1.readLine();
            if (line==null) break;
            System.out.println(line);
        }
        br1.close();
        
        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\abc\\workspace\\MoneyManagement\\bin\\Calculator.class"));
        while(true) {
            String line = br2.readLine();
            if (line==null) break;
            System.out.println(line);
        }
        br2.close();
        
        BufferedReader br3 = new BufferedReader(new FileReader("C:\\Users\\abc\\workspace\\MoneyManagement\\bin\\YearProfit.class"));
        while(true) {
            String line = br3.readLine();
            if (line==null) break;
            System.out.println(line);
        }
        br3.close();
        
        BufferedReader br4 = new BufferedReader(new FileReader("C:\\Users\\abc\\workspace\\MoneyManagement\\bin\\PartTimeMember.class"));
        while(true) {
            String line = br4.readLine();
            if (line==null) break;
            System.out.println(line);
        }
        br4.close();
    }
}


