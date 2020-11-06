package linkedlearning.cucumbercourse;

import java.util.ArrayList;

public class RestaurentMenu {
	
	ArrayList<RestareuntMeuItem> MenuItems = new ArrayList<RestareuntMeuItem>();
	public boolean addMenuItem(RestareuntMeuItem newMenuItem) {
		return MenuItems.add(newMenuItem);
	}
	
	public void ItemList() {
		System.out.println(MenuItems);
	}
	
	
	public boolean DoesItemExist(RestareuntMeuItem newMenuItem) {
		boolean Exists=false;
		if(MenuItems.contains(newMenuItem))
			Exists=true;
		
		return Exists;
	}

}
