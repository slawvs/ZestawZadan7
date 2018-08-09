import java.util.Scanner;

public class Flamaster {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int iloscWierszy = input.nextInt();
		for(int i = 0; i < iloscWierszy ;i++)
		{
			String temp = input.next();
			int licznik = 0;
			char literka=temp.charAt(0);
			for(int j = 0 ; j < temp.length() ; j++)
			{
				if(licznik == 0)
				{
					System.out.print(literka);
					licznik=1;
				}else
				{
					if(literka == temp.charAt(j))
					{
						licznik++;
					}else
					{
						if(licznik == 1)
						{
							licznik=0;
							if(j>1) System.out.print(literka);
						} else if(licznik == 2)
							{
								System.out.print(literka);
								licznik=0;
							}else
							{
								System.out.print(licznik);
								licznik=0;
							}
					}
				}
				literka = temp.charAt(j);
				if(j==temp.length()-1)
				{
					if(licznik==0) System.out.print(literka);
					if(licznik==1) System.out.print(literka);
					if(licznik==2) System.out.print(""+ literka + literka);
					if(licznik>2) System.out.print(licznik);
				}
						
			}
			System.out.println();
			
		}

	}

}
