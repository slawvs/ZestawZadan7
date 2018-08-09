
public class PoliceCar extends Vehicle implements RadioMessagesReceiver {
	
	private boolean secretPoliceCar;
	private boolean sirenIsOn = false;

	public PoliceCar(int numberOfWheel, int weight, String producer ,boolean secretPoliceCar) {
		super(numberOfWheel, weight, producer);
		this.secretPoliceCar = secretPoliceCar;
		// TODO Auto-generated constructor stub
	}
	

	public void runEngine() {
		if(sirenIsOn && !secretPoliceCar)
		{
			System.out.println("³uu³uu-³uu³uu");
			System.out.println("wrrwrrwrr");
			System.out.println("³uu³uu-³uu³uu");
		}else
		{
			System.out.println("wrrwrrwrr");
		}		
	}

	public void turnOffSiren()
	{
		sirenIsOn = false;
	}
	
	public void turnOnSiren()
	{
		sirenIsOn = true;
	}
	
	private void detonate()
	{
		System.out.println("kabuuum!");
	}


	@Override
	public void newEmergencyCall(String call) {
		System.out.println("Wezwanie do wypadku, podajê dok³adne informacje: " + call);
		turnOnSiren();
		runEngine();
		
	}


	@Override
	public void newInformation(String information) {
		System.out.println("Uwaga nowy komunikat do wszystkich patroli: " + information);
		
	}


	@Override
	public void newOrder(String order) {
		switch (order)
		{
		case "TurnOnSiren" :
			turnOnSiren();
			break;
		case "TurnOffSiren" :
			turnOffSiren();
			break;
		case "Detonate" :
			detonate();
			break;
		case "MakeCoffe" :
			break;
		default :
			System.out.println("Uwaga, nieznany rozkaz: " + order);
			break;
				
		}
	}
}
