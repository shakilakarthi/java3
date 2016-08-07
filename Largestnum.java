import java.util.Scanner;


public class Largestnum {

	
	public static void main(String[] args) {
    int a,b,c;
    System.out.println("Enter the numbers :");
    Scanner in=new Scanner(System.in);
    a=in.nextInt();
    b=in.nextInt();
    c=in.nextInt();
    if((a>b)&&(a>c))
    {
    	System.out.println("a is greater");
    }else if(b>c)
    {
    	System.out.println("b is greater");
    }
    else
    {
    	System.out.println("c is greater");
    }
	}

}
