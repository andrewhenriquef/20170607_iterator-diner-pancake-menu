package menu;

import iterator.DinerMenuIterator;
import iterator.Iterator;

public class DinerMenu {

	static final int MAX_ITENS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu(){
		menuItems = new MenuItem[MAX_ITENS];
		
		addItem("Costelinha", "Arroz feijao e costelinha", false, 10.00);
		addItem("Frango a parmegiana", "Arroz feijao e frango a parmegiana", false, 20.00);
		addItem("Mandioca", "Arroz feijao e Mandioca", true, 30.00);
		addItem("Beringela", "Arroz feijao e beringela frita", true, 40.00);
		addItem("Contra filé", "Arroz feijao e contra filé", false, 50.00);
		addItem("Feijoada", "feijoada", false, 60.00);
		
	}

	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian , price);
		
		if(numberOfItems >= MAX_ITENS){
			System.out.println("Sorry , max size");
		}else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems += 1; 
		}
		
	}
	
	public Iterator createIterator(){
		return new DinerMenuIterator(menuItems);
		
	}
}

