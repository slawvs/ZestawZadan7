
abstract class figura
{
	private String nazwa;
	private String przymiotnik;
	public figura(String nazwa)
	{
		this.nazwa = nazwa;
		this.przymiotnik = "Czarny";
	}
	public abstract double pobierzPole();
	public abstract double pobierzObwod();
	public void wypiszInfo()
	{
		System.out.println("Nazwa: " + przymiotnik + " " + nazwa);
		System.out.println("Pole to: " + pobierzPole());
		System.out.println("Obwod to: " + pobierzObwod());
	}
	public void ustawPrzymiotnik(String przymiotnik)
	{
		this.przymiotnik = przymiotnik;
	}
}