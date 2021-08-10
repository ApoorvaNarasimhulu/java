import java.io.*;
import java.util.Scanner;
public class salary {

		
	static int calculateSal(int salary, int shifts)
	{
		float f=salary*0.5f + 0.02f*salary*shifts;
		return (int)f;
	}

	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		
		
		if(x>8000)
		{	System.out.println("Salary too large");}
		else
		{	if(x<0)
				{	System.out.println("Salary too small");	}
			else 
			{		int y=scanner.nextInt();
					if(y<0)
					{ System.out.println("Shifts too small");	}
					else
					{
						int k=calculateSal(x,y);	
						System.out.println(k);	}
			}
		}
	}
	
	
}