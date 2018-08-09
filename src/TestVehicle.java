import java.util.ArrayList;

public class TestVehicle {

	public static void main(String[] args) {
		ArrayList <Vehicle> lista = new ArrayList<Vehicle>();
		lista.add(new Truck(6, 10000, "San"));
		lista.add(new PoliceCar(4, 1000, "Fiat", false));
		lista.get(1).runEngine();
		PoliceCar secretPoliceCar = new PoliceCar(4, 1500, "BMW", true);
		PoliceCar normalPoliceCar = new PoliceCar(4, 1200, "Panda", false);
		secretPoliceCar.newEmergencyCall("Potracenie pieszego na przejsciu na ul.Wielickiej");
		secretPoliceCar.newInformation("Akcja na Kurdwanowie ...");
		secretPoliceCar.newOrder("Prosze o wsparcie na Kurdwanowie");
		normalPoliceCar.newEmergencyCall("Potracenie pieszego na przejsciu na ul.Wielickiej");
		
	}

}
