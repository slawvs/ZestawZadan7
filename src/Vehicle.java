
public abstract class Vehicle {
	private int numberOfWheel;
	private String producer;
	private int weight;
	

	
	public Vehicle(int numberOfWheel,int weight,String producer) {
		this.numberOfWheel = numberOfWheel;
		this.producer = producer;
		this.weight = weight;
	}

	public void runEngine()
	{
		if(weight <= 1500)
		{
			System.out.println("pyrpyrpyr");
		}else if(weight <= 2500)
		{
			System.out.println("wrrwrrwrr");
		}else
		{
			System.out.println("burburbur");
		}
		
	}
	
	public int getNumberOfWheel() {
		return numberOfWheel;
	}
	public void setNumberOfWheel(int numberOfWheel) {
		this.numberOfWheel = numberOfWheel;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
