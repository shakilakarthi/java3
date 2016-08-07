import java.util.Scanner;


public class Factorial {


	public static void main(String[] args) {
		System.out.println("Enter the num :");
		Scanner in =new Scanner(System.in);		
        int n=in.nextInt();
        int c,fact=1;
        for(c=1;c<=n;c++)
        {
        	fact=fact*c;
        }System.out.println(fact);
	}

}
