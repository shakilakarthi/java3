import java.util.Scanner;


public class String1 {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner in =new Scanner(System.in);		
        String s=in.nextLine();
        StringBuffer sb=new StringBuffer(s);
        String ss=new String(sb.reverse());
        System.out.println(ss);

	}

}
