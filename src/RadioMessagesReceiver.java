
public interface RadioMessagesReceiver {

	public void newEmergencyCall(String call);
	public void newInformation(String information);
	public void newOrder(String order);
	
}
