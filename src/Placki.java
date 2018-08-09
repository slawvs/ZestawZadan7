import java.util.*;

public class Placki {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		ArrayList <Double> stos = new ArrayList <Double>();
		int ileZapytan = input.nextInt();
		for(int i = 0 ; i < ileZapytan ; i++)
		{
			String helper = input.next();
			if( helper.equals("+"))
			{
				stos.add(input.nextDouble());
			}
			if( helper.equals("-"))
			{
				if(!stos.isEmpty())
				{
					System.out.println(stos.get(stos.size()-1));
					stos.remove(stos.size()-1);
				}
			}
			if( helper.equals("?"))
			{
				System.out.println(stos.size());
			}
		}
		
	}
}

