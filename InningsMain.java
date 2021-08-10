import java.util.Scanner;

public class InningsMain {


	public static void main(String[] args) {
		Innings innings=new Innings();
		innings.displayInningsDetails();
	}

}

class Innings{
	private String teamname;
	private String inningsname;
	private int runs;
	
	public void setTeamname(String teamname) 
	{
		this.teamname=teamname;
	}
	public void setInningsname(String inningsname) 
	{
		this.inningsname=inningsname;
	}
	public void setRuns(int runs) 
	{
		this.runs=runs;
	}
	public String getTeamname()
	{
		return this.teamname;
	}
	
	public String getInningsName()
	{
		return this.inningsname;
	}
	
	public int getRuns()
	{
		return this.runs;
	}
	
	public static void displayInningsDetails()
	{
		Scanner scr=new Scanner(System.in);
		Innings innings=new Innings();
		System.out.println("Enter the team name:");
		String s1=scr.nextLine();
		System.out.println("Enter session:");
		String s2=scr.nextLine();
		System.out.println("Enter runs:");
		int s3=scr.nextInt();
		innings.setTeamname(s1);
		innings.setRuns(s3);
		System.out.println("Sample output");
		System.out.println("Name:"+innings.getTeamname() );
		System.out.println("Scored:"+innings.getRuns());
		if(s2.equals("First"))
		{
			System.out.println("Need " + s3 + " to win");
		}
		else
		{
			
			System.out.println("Match ended");
		}
	}

}

