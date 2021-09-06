

public class FoodItem implements KitchenTimerObserver{
	
	private String foodItemName;
	
	private MySubject subject ;
	
 
	 


	public MySubject getSubject() {
		return subject;
	}


	public void setSubject(MySubject subject) {
		this.subject = subject;
	}
	
	@Override
	public void update(String  chefName) {
		System.out.println("Hi "+ chefName +" :: your "+foodItemName+" is ready"); 
		
	}


	public String getFoodItemName() {
		return foodItemName;
	}


	public void setFoodItemName(String foodItemName) {
		this.foodItemName = foodItemName;
	}
	
	

}
