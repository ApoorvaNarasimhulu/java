import java.util.Scanner;

public class P2 {

	static int countRepeaters(int arr[], int x)
	{
		for(int i=0;i<x;i++)
		{
			for(int j=i+1;j<x;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int u=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=u;
				}
			}
		}
		int count=1,maxl=0;
		for(int i=0;i<x-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
				if(count>maxl)
				{
						maxl=count;
				}
			}
			else
			{	count=1;}
			
		}
		return maxl;
	}
	
	static int arr[]=new int[20];
	public static void main(String[] args) {
		
		int y;
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		if(x<0)
		{	System.out.println("Invalid input");return;}
		for(int i=0;i<x;i++)
		{
			arr[i]=scanner.nextInt();
			if(arr[i]<0)
			{ System.out.println("Invalid input");return;}
		}
		int max=countRepeaters(arr,x);
		System.out.println(max);
	}

	
}