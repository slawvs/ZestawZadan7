
public class Truck extends Vehicle {

	private int bootCapacity = 10000;
	
	public Truck(int numberOfWheel, int weight, String producer) {
		super(numberOfWheel, weight, producer);
		
	}

	public int getBootCapacity() {
		return bootCapacity;
	}

	public void setBootCapacity(int bootCapacity) {
		this.bootCapacity = bootCapacity;
	}
	
	public boolean checkIfCouldBeTransported(int pack)
	{
		return (pack <= bootCapacity );
	}

	public void runEngine() {
		System.out.println("burburbur");
	}
	
	

}
