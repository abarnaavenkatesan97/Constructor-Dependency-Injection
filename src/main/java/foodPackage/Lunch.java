package foodPackage;

public class Lunch implements Food{
	private String spclitem;
	
	

	public Lunch(String spclitem) {
		this.spclitem = spclitem;
	}



	public void displayMenu()
	{
		System.out.println("Today's special item for lunch is " + spclitem);
	}

}
