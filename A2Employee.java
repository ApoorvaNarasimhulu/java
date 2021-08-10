import java.util.Scanner;
class A2Employee
{
 private String name;
 private String address;
 private String mobile;
 A2Employee(String name, String address, String mobile )
 {
	this.name = name;
	this.address = address;
	this.mobile = mobile;
 }
 public void getinfo()
 {
	 System.out.println();
	 System.out.println("Employee Details");
	 System.out.println("Name:" +this.name);
	 System.out.println("Address:" + this.address);
	 System.out.println("Mobile:" + this.mobile);
 }
}
	 
class EmployeeMain
{
	EmployeeMain()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter Address");
		String address = sc.nextLine();
		System.out.println("Enter Mobile ");
		String mobile= sc.nextLine();
		
		A2Employee e = new A2Employee(name,address,mobile);
        e.getinfo();		
}
}