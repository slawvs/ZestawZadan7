
public class Trapez extends figura {
	private double dlugoscPodstawyA;
	private double dlugoscPodstawyB;
	private double dlugoscBokuC;
	private double dlugoscBokuD;
	private double wysokoscTrapezu;
	
	public Trapez(String nazwa, double dlugoscPodstawyA,double dlugoscPodstawyB,double dlugoscBokuC,double dlugoscBokuD,double wysokoscTrapezu) {
		super(nazwa);
		this.dlugoscPodstawyA = dlugoscPodstawyA;
		this.dlugoscPodstawyB = dlugoscPodstawyB;
		this.dlugoscBokuC = dlugoscBokuC;
		this.dlugoscBokuD = dlugoscBokuD;
		this.wysokoscTrapezu = wysokoscTrapezu;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double pobierzPole() {
		// TODO Auto-generated method stub
		return (dlugoscPodstawyA+dlugoscPodstawyB)/2*wysokoscTrapezu;
	}

	@Override
	public double pobierzObwod() {
		// TODO Auto-generated method stub
		return dlugoscPodstawyA + dlugoscPodstawyB + dlugoscBokuC + dlugoscBokuD ;
	}

}
