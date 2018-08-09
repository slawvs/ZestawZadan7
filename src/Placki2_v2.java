import java.util.*;
import java.io.*; 

public class Placki2_v2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		ArrayList <Double> stos = new ArrayList <Double>();
		int ileZapytan=BufferToInt(bufferRead);
		for(int i = 0 ; i < ileZapytan ; i++)
		{
			char helper ;
			do 
			{
				helper = (char)bufferRead.read();
			}while(helper!='+' && helper!='-' && helper!='?');
			if( helper == '+')
			{
				stos.add(BufferToInt(bufferRead)+ 0.01 * BufferToInt(bufferRead));
			}
			if( helper == '-')
			{
				if(!stos.isEmpty())
				{
					System.out.printf(Locale.US,"%.2f",stos.get(stos.size()-1));
					System.out.println();
					stos.remove(stos.size()-1);
				}
			}
			if( helper == '?')
			{
				System.out.println(stos.size());
			}
		}	
	}
	public static int BufferToInt(BufferedReader bufferRead) throws IOException
	{
		int character;
		int result=0;
		do 
		{
			character=bufferRead.read();
		} while (character < '0' || character > '9');
		while ( (character >= '0' && character <= '9'))
		{
			result = result * 10 + character - '0';
			character = bufferRead.read();
		}
		return result;
	}
}

