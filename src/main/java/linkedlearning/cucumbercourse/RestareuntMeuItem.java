package linkedlearning.cucumbercourse;

public class RestareuntMeuItem {
	private String itemName;
	private String Description;
	private int Price;
	
	public RestareuntMeuItem(String menuItemName, String description, int price) {
		super();
		itemName=menuItemName;
		Description=description;
		Price=price;
		
		
	}
	
	public String getItemName() {
		return itemName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
}
