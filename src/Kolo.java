
public class Kolo extends figura {
	private double dlugoscPromienia;

	public Kolo(String nazwa, double dlugoscPromienia) {
		super(nazwa);
		// TODO Auto-generated constructor stub
		this.dlugoscPromienia = dlugoscPromienia;
	}

	@Override
	public double pobierzPole() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(dlugoscPromienia, 2);
	}

	@Override
	public double pobierzObwod() {
		// TODO Auto-generated method stub
		return 2*Math.PI*dlugoscPromienia;
	}

}
