import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		
		int x=scr.nextInt();
		int arr[][]= new int [x][2];
		
		for(int i=0;i<x/2;i++)
		{
			int t=scr.nextInt();
			int y=scr.nextInt();
			arr[t][0]=y;
		}
		for(int i=0;i<x/2;i++)
		{
			int t=scr.nextInt();
			int y=scr.nextInt();
			arr[t][1]=y;
		}
		for(int i=0;i<x;i++)
		{
			if((arr[i][0]!=0)||(arr[i][1]!=0))
			{
				int c=Math.max(arr[i][0],arr[i][1]);
				System.out.println(i);
				System.out.println(c);
			}
		}
	}
}