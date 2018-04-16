package begginer;
import java.util.*;
public class IsStringNumeric {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		if(isNumeric(str)) {
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}
	public static boolean isNumeric(String str) {
		try {
			Double d=Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
}
