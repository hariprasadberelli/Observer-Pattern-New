

import java.util.ArrayList;
import java.util.List;

public class MyChef implements MySubject{

	
	private String name;
	
	private List<KitchenTimerObserver> observers = new ArrayList<KitchenTimerObserver>();
	
	 
	
	@Override
	public void add(KitchenTimerObserver observer) {
		observers.add(observer);
		
	}

	@Override
	public void remove(KitchenTimerObserver observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyAllObservers() {
		 System.out.println("Kitchen Timmer will notify When item is ready ");
		 for(KitchenTimerObserver observer:observers){
			 observer.update(name);
		 }
		
	}
 
	 

	 
	 

	public List<KitchenTimerObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<KitchenTimerObserver> observers) {
		this.observers = observers;
	}

	public void getFoodItemStatusUpdate(boolean isDone) {
		 
		if(isDone){
			notifyAllObservers();
			
		}else{
			System.out.println("Item not Ready Please wait for 25 mnts");
		}
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 
	
}
