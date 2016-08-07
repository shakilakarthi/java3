import java.util.Scanner;


public class Int {

	public static void main(String[] args) {
		System.out.println("Enter the num :");
		Scanner in =new Scanner(System.in);		
        int n=in.nextInt();
        int count=0,m;
        while(n>0)
        {
        	m=n%10;
             count++;
        	n=n/10;
        }System.out.println(count);

	}

}
