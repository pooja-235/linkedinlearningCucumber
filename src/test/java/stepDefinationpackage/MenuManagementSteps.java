package stepDefinationpackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linkedlearning.cucumbercourse.RestareuntMeuItem;
import linkedlearning.cucumbercourse.RestaurentMenu;

public class MenuManagementSteps {
	RestareuntMeuItem NewMenuItem;
	RestaurentMenu locationMenu=new RestaurentMenu();
	
	@Given("I have a munu item with name {string} and price {int}")
	public void i_have_a_munu_item_with_name_and_price(String Menuitemname, Integer price) {
		RestareuntMeuItem rmt;
		NewMenuItem= new RestareuntMeuItem(Menuitemname,Menuitemname,price);
		System.out.println("step one");
	}

	@When("I add that menu item")
	public void i_add_that_menu_item() {
		locationMenu.addMenuItem(NewMenuItem);
	//	locationMenu.ItemList();
		System.out.println("step two");
	}

	@Then("menu item with name {string} should be added")
	public void menu_item_with_name_should_be_added(String string) {
		boolean Exists=locationMenu.DoesItemExist(NewMenuItem);
		System.out.println("Step three " + Exists);
	}

}
