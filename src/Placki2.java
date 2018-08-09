import java.util.*;
import java.io.*; 

public class Placki2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList <String> stos = new ArrayList <String>();
		int znak=br.read();
		int ileZapytan=0;
		while ( (znak >= '0' && znak <= '9'))
		{
			ileZapytan = ileZapytan * 10 + znak - '0';
			znak = br.read();
		}
		br.read();
		for(int i = 0 ; i < ileZapytan ; i++)
		{
			String helper = br.readLine();
			if( helper.charAt(0) == '+')
			{
				stos.add(helper.substring(2,7));
			}
			if( helper.charAt(0) == '-')
			{
				if(!stos.isEmpty())
				{
					System.out.println(stos.get(stos.size()-1));
					stos.remove(stos.size()-1);
				}
			}
			if( helper.charAt(0) == '?')
			{
				System.out.println(stos.size());
			}
			
		}	
	}
}

