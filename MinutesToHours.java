package begginer;
import java.util.*;
public class MinutesToHours {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int min=scan.nextInt();
		System.out.println((min/60)+" "+(min%60));
	}
}
