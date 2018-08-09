
public class Kwadrat extends figura {
	private double dlugoscBoku;
	
	public Kwadrat(String nazwa, double dlugoscBoku) {
		super(nazwa);
		this.dlugoscBoku = dlugoscBoku;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double pobierzPole() {
		// TODO Auto-generated method stub
		return dlugoscBoku*dlugoscBoku;
	}

	@Override
	public double pobierzObwod() {
		// TODO Auto-generated method stub
		return 4*dlugoscBoku;
	}

}
