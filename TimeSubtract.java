package begginer;
import java.util.*;

public class TimeSubtract {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int h1=scan.nextInt();
		int m1=scan.nextInt();
		int h2=scan.nextInt();
		int m2=scan.nextInt();
		int hr1=(h1*60)+m1;
		int hr2=(h2*60)+m2;
		int sub;
		if(hr1>hr2)
			sub=hr1-hr2;
		else
			sub=hr2-hr1;
		System.out.println((sub/60)+" "+(sub%60));
	}
}
