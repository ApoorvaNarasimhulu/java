import java.util.Scanner;

class Company
{
	private String name;
 private String address;
 private String mobile;
Company(String name, String address, String mobile )
 {
	this.name = name;
	this.address = address;
	this.mobile = mobile;
 }
 public void getinfo()
 {
	 
	 
	 System.out.println("Name:" +this.name);
	 System.out.println("Address:" + this.address);
	 System.out.println("Mobile:" + this.mobile);
 }
}

class CompanyMain
{
	CompanyMain()
	{
		System.out.println("Enter the details");
		Scanner sc = new Scanner(System.in);
		String info = sc.nextLine();
		String[] data = info.split(",");
		String name = data[0];
		String address = data[1];
		String mobile = data[2];
		
		Company c = new Company(name, address, mobile);
		c.getinfo();
	}
}

