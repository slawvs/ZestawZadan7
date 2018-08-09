
public class Sleigh extends Vehicle {

	private int maxNumberOfKids ;
	
	public Sleigh(int numberOfWheel, int weight, String producer,int maxNumberOfKids) {
		super(numberOfWheel, weight, producer);
		this.maxNumberOfKids = maxNumberOfKids;
	}

	public void runEngine() {
		System.out.println("szuuuuu");
	}
	
	public void organizeSleighRide()
	{
		for(int i = 0 ; i < maxNumberOfKids; i++ )
		{
			System.out.println("Hurra!");
		}
	}
	
}
