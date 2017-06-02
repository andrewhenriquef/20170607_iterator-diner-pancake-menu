package menu;

import java.util.ArrayList;

public class PancakeHouseMenu {
	
	ArrayList menuItems;
	
	public PancakeHouseMenu(){
		
		menuItems = new ArrayList();
		
		addItem("Panquecas de queijo", "Panquecas com queijo prato", true, 1.00);
		addItem("Panquecas de morango", "Panquecas com morango fresco", true, 2.00);
		addItem("Panquecas de carne", "Panquecas com carne moida e cebola ", false, 3.00);
		addItem("Panquecas de frango", "Panquecas com frango caipira", false, 4.00);
		
	}

	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList getMenuItems(){
		return menuItems;
	}

}
