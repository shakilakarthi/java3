import java.util.Scanner;


public class Logic {

	public static void main(String[] args)
	{
		     int n;
             System.out.println("Enter the number :");
             Scanner in=new Scanner(System.in);
             n=in.nextInt();
             if(n%2==0)
             {
            	 System.out.println("Given num is even");
             }
             else
             {
            	 System.out.println("Given num is odd");
             }
	}

}
