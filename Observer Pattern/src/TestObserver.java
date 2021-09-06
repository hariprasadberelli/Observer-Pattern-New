

public class TestObserver {

	public static void main(String[] args) throws InterruptedException {

		 
		FoodItem tea = new FoodItem();
		tea.setFoodItemName("Tea");
		
		
		 
		FoodItem tiffin = new FoodItem();
		tiffin.setFoodItemName("Tiffin");

		System.out.println("Preparing " + tea.getFoodItemName() + "," + tiffin.getFoodItemName());

		MyChef chef = new MyChef();
		chef.setName("Booby Fay");
		
		chef.add(tea);
		chef.add(tiffin);
		
		System.out.println("After 15 mints ");
		
		Thread.sleep(6000);

		chef.getFoodItemStatusUpdate(false);
 
		Thread.sleep(6000);
		System.out.println("After 25 mints ");

		chef.getFoodItemStatusUpdate(true);

	}

}
