package foodPackage;

public class Breakfast implements Food {
	private String SpclItem;
    
	public Breakfast(String SpclItem) {
		this.SpclItem = SpclItem;
	}

	public void displayMenu() {
		System.out.println("Today's special item for breakfast is " + SpclItem);

	}

}
