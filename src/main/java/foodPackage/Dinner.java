package foodPackage;

public class Dinner implements Food {
	private String dinnerSpecialItemfortoday;
	
	
	public Dinner(String dinnerSpecialItemfortoday) {
		this.dinnerSpecialItemfortoday = dinnerSpecialItemfortoday;
	}


	public void displayMenu()
	{
		System.out.println("Today's special item for dinner is " + dinnerSpecialItemfortoday);
	}
	

}
