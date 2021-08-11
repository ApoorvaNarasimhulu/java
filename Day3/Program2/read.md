package inheritance;

import java.util.Scanner;
public class HotelRoom 
{
 private String hotelName;
 private Integer numberOfSqFeet;
 private Boolean hasTV;
 private static Boolean hasWifi;

    public HotelRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi)
    {
	super();
	this.hotelName = hotelName;
	this.numberOfSqFeet = numberOfSqFeet;
	this.hasTV = hasTV;
	HotelRoom.hasWifi = hasWifi;
    }

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Integer getNumberOfSqFeet() {
		return numberOfSqFeet;
	}

	public void setNumberOfSqFeet(Integer numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}

	public Boolean getHasTV() {
		return hasTV;
	}

	public void setHasTV(Boolean hasTV) {
		this.hasTV = hasTV;
	}

	public static Boolean getHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(Boolean hasWifi) {
		HotelRoom.hasWifi = hasWifi;
	}
    
    public int calculateTariff(int numberOfSqFeet, int costPerSqFeet)
    {
    	return  numberOfSqFeet*costPerSqFeet;
    }
    
    public int getRatePerSqFeet()
    {
		return 0;
    	
    }
}

class DeluxeRoom extends HotelRoom
{
	protected Integer ratePerSqFeet;

	public DeluxeRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi, Integer ratePerSqFeet)
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;
	}
	
	public DeluxeRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;
	}
	
	public int getRatePerSqFeet() 
	 {
		if(HotelRoom.getHasWifi()==true) 
		{
			return ratePerSqFeet+2;
		}
		else
		{
			return ratePerSqFeet;
		}
     }
}

class DeluxeSeaViewRoom extends DeluxeRoom 
{

	 DeluxeSeaViewRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi)
	 {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet = 12;
	}
	
}

class SuiteRoom extends HotelRoom
{
	private Integer ratePerSqFeet;

	public SuiteRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi, Integer ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	
	public int getRatePerSqFeet() {
		if(HotelRoom.getHasWifi()==true) {
			return ratePerSqFeet+2;
		}
		else {
			return ratePerSqFeet;
		}
	}
	
	public SuiteRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	
}
class ProgramMain
{
	 public static void main(String[] args)
	 {
		 Scanner input = new Scanner(System.in);
			System.out.println("Hotel Tariff Calculator");
			System.out.println("1. Deluxe Room");
			System.out.println("2. Deluxe AC Room");
			System.out.println("3. Suite Room");
			System.out.println("Select Room Type:");
			int x = input.nextInt();
			switch(x) {
			case 1:
				System.out.println("Hotel Name:");
				input.nextLine();
				String name = input.nextLine();
				System.out.println("Room Square Feet Area:");
				int numberOfSqFeet = input.nextInt();
				System.out.println("Room has TV:");
				input.nextLine();
				String hasTV = input.nextLine();
				
				boolean t;
				if(hasTV.equals("yes"))
				{
					t = true;
				}
				else 
					t = false;
				System.out.println("Room has Wifi:");
				
                String hasWifi = input.nextLine();
				
				boolean t1;
				if(hasWifi.equals("yes"))
				{
					t1 = true;
				}
				else 
					t1 = false;
				
				
				HotelRoom room = new DeluxeRoom(name, numberOfSqFeet, t, t1);
				int tariff = room.calculateTariff(numberOfSqFeet, room.getRatePerSqFeet());
				System.out.println("Room Tariff per day is: "+tariff);
				break;
			case 2:
				System.out.println("Hotel Name:");
				input.nextLine();
				String name2 = input.nextLine();
				System.out.println("Room Square Feet Area:");
				int numberOfSqFeet2 = input.nextInt();
				System.out.println("Room has TV:");
				boolean hasTV2 = input.nextBoolean();
				System.out.println("Room has Wifi:");
				boolean hasWifi2 = input.nextBoolean();
				HotelRoom searoom = new DeluxeSeaViewRoom(name2, numberOfSqFeet2, hasTV2, hasWifi2);
				int tariff2 = searoom.calculateTariff(numberOfSqFeet2, searoom.getRatePerSqFeet());
				System.out.println("Room Tariff per day is: "+tariff2);
				break;
			case 3:
				System.out.println("Hotel Name:");
				input.nextLine();
				String name3 = input.nextLine();
				System.out.println("Room Square Feet Area:");
				int numberOfSqFeet3 = input.nextInt();
				System.out.println("Room has TV:");
				boolean hasTV3 = input.nextBoolean();
				System.out.println("Room has Wifi:");
				boolean hasWifi3 = input.nextBoolean();
				HotelRoom suiteroom = new SuiteRoom(name3, numberOfSqFeet3, hasTV3, hasWifi3);
				int tariff3 = suiteroom.calculateTariff(numberOfSqFeet3, suiteroom.getRatePerSqFeet());
				System.out.println("Room Tariff per day is: "+tariff3);
				break;
			}
		}
	}
