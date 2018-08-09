import java.util.*;

public class Placki3
{
	public static void main (String[] args) throws java.lang.Exception
	{
				Scanner input = new Scanner(System.in).useLocale(Locale.US);
				stos stosik = new stos();
				int ileZapytan = input.nextInt();
				for(int i = 0 ; i < ileZapytan ; i++)
				{
					String helper = input.next();
					if( helper.equals("+"))
					{
						stosik.dodaj(input.nextDouble());
					}
					if( helper.equals("-"))
					{
						if(stosik.licznik>0)
						{
							System.out.printf(Locale.US,"%.2f",stosik.top.liczba);
							System.out.println();
							stosik.usun();
						}
					}
					if( helper.equals("?"))
					{
						System.out.println(stosik.licznik);
					}
				}
	}
}
	class stos
	{
		element top = null;
		int licznik = 0;
		public void dodaj(double liczba)
		{
			if(top==null)
			{
				top = new element(liczba,null);
			}else
			{
				element temp = new element(liczba,top);
				top = temp;
			}
			licznik++;
		}
		
		public void usun()
		{
			if(top!=null)
			{
				top = top.ref_poprzednik;
				licznik--;
			}
		}
		
		public int ileElementow()
		{
			return licznik;
		}
	}
	
	class element
	{
		double liczba;
		element ref_poprzednik;
		element(double liczba,element ref_poprzednik){
			this.liczba = liczba;
			this.ref_poprzednik=ref_poprzednik;
		}
	}
