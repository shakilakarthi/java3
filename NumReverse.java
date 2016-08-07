import java.util.Scanner;


public class NumReverse {

	
	public static void main(String[] args) {
		System.out.println("Enter the num :");
		Scanner in =new Scanner(System.in);		
        int n=in.nextInt();
        int res=0,m;
        while(n>0)
        {
        	m=n%10;
        	res=res*10+m;
        	n=n/10;
        }System.out.println(res);
	}

}
