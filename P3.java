import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {

		Scanner scr=new Scanner(System.in);
		
		int x=scr.nextInt();
		if((x<0)||(x>32767))
		{	System.out.println("Invalid Input");
			return;
		}
		else
		{
			int prod;
			prod=productDigits(x);
			System.out.println(prod);
		}
	}
	
	static int productDigits(int num)
	{
		int prod=1,x;
		while(num>0)
		{
		x=num%10;
		prod*=x;
		num/=10;
		}
		return prod;
	}

}