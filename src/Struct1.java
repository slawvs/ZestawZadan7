import java.util.*;

public class Struct1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Punkt> Icwiartka = new ArrayList <Punkt>();
		ArrayList<Punkt> IIcwiartka = new ArrayList <Punkt>();
		ArrayList<Punkt> IIIcwiartka = new ArrayList <Punkt>();
		ArrayList<Punkt> IVcwiartka = new ArrayList <Punkt>();
		int ilePunktów = input.nextInt();
		for(int i = 0 ; i < ilePunktów; i++ )
		{
			Punkt Punkcik = new Punkt(input.next(),input.nextInt(),input.nextInt());
			if(Punkcik.x == 0 || Punkcik.y == 0)
			{
				//nie rob nic
			}else
			{
				if(Punkcik.x > 0)
				{
					if(Punkcik.y > 0) Icwiartka.add(Punkcik);
					else IVcwiartka.add(Punkcik);
				}else 
				{
					if(Punkcik.y > 0) IIcwiartka.add(Punkcik);
					else IIIcwiartka.add(Punkcik);
				}
			}
		}
		System.out.println("I");
		for(Punkt a : Icwiartka)
		{
			System.out.println(a.nazwa + " " + a.x + " " + a.y);
		}
		System.out.println("II");
		for(Punkt a : IIcwiartka)
		{
			System.out.println(a.nazwa + " " + a.x + " " + a.y);
		}
		System.out.println("III");
		for(Punkt a : IIIcwiartka)
		{
			System.out.println(a.nazwa + " " + a.x + " " + a.y);
		}
		System.out.println("IV");
		for(Punkt a : IVcwiartka)
		{
			System.out.println(a.nazwa + " " + a.x + " " + a.y);
		}		
	}
	
}

class Punkt {
	String nazwa ;
	int x;
	int y;
	
	Punkt(String nazwa, int x,int y )
	{
		this.nazwa = nazwa ;
		this.x = x;
		this.y = y;
		
	}
}