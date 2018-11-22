import java.util.ArrayList;
import java.util.List;

public class GroceryList {

	//List groceryList1 = new ArrayList(); // here we can put to Array any type of data

	List<String> groceryList2 = new ArrayList<String>();// here our Array can only hold string

	public void addGroceryItem(String item) {
		groceryList2.add(item);// here we use ready method .add() to add item to our Array
	}
	
	public void printGroceryList() {
		System.out.println("We have "+groceryList2.size()+ " items in our grocery list");
		for(int i=0; i<groceryList2.size(); i++) {
			System.out.println((i+1) + ". "+groceryList2.get(i)); // here for getting value of elements of Array we use .get() method.
		}
	}
	
	public void modifyGroceryItem(int position, String newItem) {
		groceryList2.set(position, newItem); //here we replacing one item with new item.
		
	}
	
	public void removeGroceryItem(int position) {
		groceryList2.remove(position); // here we removing any item from our Array.
	}
	
	public String findItem(String searchItem) {
		boolean exist_or_not = groceryList2.contains(searchItem);
		System.out.println(exist_or_not);
		int position = groceryList2.indexOf(searchItem);
		if(position>=0) {
			return groceryList2.get(position);
		}
		return null;
	}
}
