

public interface MySubject {

	public void add(KitchenTimerObserver observer);

	public void remove(KitchenTimerObserver observer);

	public void notifyAllObservers();

}
