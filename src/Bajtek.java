import java.util.Scanner;

public class Bajtek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int iloscWierszy = input.nextInt();
		System.out.println();
		for(int i = 0; i < iloscWierszy ; i++)
		{
			int min=input.nextInt();
			int max=min;
			for(int j = 0 ; j < 5 ; j++)
			{
				int liczba = input.nextInt();
				if(liczba<min)
				{
					min=liczba;
				}else if(liczba>max)
				{
					max=liczba;
				}
			}
			System.out.println(PoliczKoleczka(min) + " " + PoliczKoleczka(max));
		}
	}
	
	private static int ileKoleczekWcyfrze(int a)
	{
		if(a == 8) return 2;
		else if(a==0 || a==6 || a==9) return 1;
		else return 0;
	}

	private static int PoliczKoleczka(int a)
	{
		int SumaKoleczek=0;
		if(a!=0)
		{
			for(;a>0;a=(a-a%10)/10)
			{
				SumaKoleczek += ileKoleczekWcyfrze(a%10);
			}
			return SumaKoleczek;
		}
		else return 1;
	}
}
