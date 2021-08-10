import java.util.Scanner;
class A2P1
{
	public static void main(String[] args)	
	{
		    Scanner sc = new Scanner(System.in);
			System.out.println("Enter First name");
			String Firstname = sc.nextLine();
			System.out.println("Enter Second name");
			String Secondname = sc.nextLine();
			
			String frst = Firstname.substring(0,1);
			String rem = Firstname.substring(1);
			
			frst = frst.toUpperCase();
			rem = rem.toLowerCase();
			String name = frst + rem;
			
			String sec = Secondname.toUpperCase();
			
			System.out.println(name + "" +sec);
	}
}
	
		