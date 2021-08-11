package inheritance;

import java.util.Scanner;

public class Vehicle 
{
	private String make;
	private String vehicleNumber;
	private String fuelType;
	private String fuelCapacity;
	private Integer cc;
	
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity1, Integer cc) 
	{
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(String fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public Integer getCc() {
		return cc;
	}

	public void setCc(Integer cc) {
		this.cc = cc;
	}
	
	public void displayMake()
	{
		System.out.println("Vehicle make:" + make);
	}
	
	public void displayBasicInfo()
	{
		System.out.println("*"+make+"*");
		System.out.println("--Basic Information--");
		System.out.println("Vehicle Number:" + vehicleNumber);
		System.out.println("Fuel Type:" + fuelType);
		System.out.println("Fuel Capacity:" + fuelCapacity);
		System.out.println("CC:" + cc);
	}
	
	public void displayDetailInfo()
	{
		
	}
}

 class TwoWheeler extends Vehicle
{
	private Boolean KickStartAvailable;

	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity1, Integer cc,
			Boolean kickStartAvailable)
	{
		super(make, vehicleNumber, fuelType, fuelCapacity1, cc);
		KickStartAvailable = kickStartAvailable;
	}

	public Boolean getKickStartAvailable() {
		return KickStartAvailable;
	}

	public void setKickStartAvailable(Boolean kickStartAvailable) {
		KickStartAvailable = kickStartAvailable;
	}
	
	public void displayDetailInfo()
	{
		System.out.println("Detail Info");
		System.out.println("Kick Satrt Avaialble: " + KickStartAvailable);
		
	}
		
}
 
 class FourWheeler extends Vehicle
 {
	 private String audioSystem;
	 private Integer numberOfDoors;
	
	 public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, Integer cc,
			String audioSystem, Integer numberOfDoors) 
	 {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	 }

	public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public Integer getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(Integer numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	 
	 public void displayDetailInfo()
	 {
		 System.out.println(" Detail Info");
		 System.out.println("Audio System:" + audioSystem);
		 System.out.println("Number of Doors: " + numberOfDoors);
	 }	 
	 
 }
 class Main
 {
	 public static void main(String[] args)
	 {
		 Scanner input = new Scanner(System.in);

			System.out.println("1. Four Wheeler");
			System.out.println("2. Two Wheeler");
			System.out.println("Enter Vehicle Type:");
			int x = input.nextInt();
			switch(x) {
			case 1:
				System.out.println("Vehicle Make:");
				input.nextLine();
				String make = input.nextLine();
				System.out.println("Vehicle Number:");
				String vehicleNumber = input.nextLine();
				System.out.println("Fuel Type:");
				System.out.println("1. Petrol");
				System.out.println("2. Diesel");
				int y = input.nextInt();
				String fuelType = "";
				if(y==1) {
					fuelType = "Petrol";
				}
				else if(y==2) {
					fuelType = "Diesel";
				}
				System.out.println("Fuel Capacity:");
				input.nextLine();
				int fuelCapacity = input.nextInt();
				System.out.println("Engine CC:");
				int cc = input.nextInt();
				System.out.println("Audio System:");
				input.nextLine();
				String audioSystem = input.nextLine();
				System.out.println("Number of Doors:");
				int numberOfDoors = input.nextInt();
				Vehicle four = new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
				four.displayBasicInfo();
				four.displayDetailInfo();
				break;
			case 2:
				System.out.println("Vehicle Make:");
				input.nextLine();
				String make1 = input.nextLine();
				System.out.println("Vehicle Number:");
				String vehicleNumber1 = input.nextLine();
				System.out.println("Fuel Type:");
				System.out.println("1. Petrol");
				System.out.println("2. Diesel");
				int y1 = input.nextInt();
				String fuelType1 = "";
				if(y1==1) {
					fuelType1 = "Petrol";
				}
				else if(y1==2) {
					fuelType1 = "Diesel";
				}
				System.out.println("Fuel Capacity:");
				input.nextLine();
				int fuelCapacity1 = input.nextInt();
				System.out.println("Engine CC:");
				int cc1 = input.nextInt();
				System.out.println("Kick Start Available:");
				boolean kickStartAvailable = input.nextBoolean();
				Vehicle two = new TwoWheeler(make1, vehicleNumber1, fuelType1, fuelCapacity1, cc1, kickStartAvailable);
				two.displayBasicInfo();
				two.displayDetailInfo();
			}
	 }	 
	 
 }
 




