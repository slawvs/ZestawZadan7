import java.util.Scanner;

public class Flamaster2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int iloscWierszy = input.nextInt();
		for(int i = 0; i < iloscWierszy ;i++)
		{
			String temp = input.next();
			int licznik = 1;
			char literka=temp.charAt(0);
			if(temp.length()==1)
			{
				System.out.println(literka);
			}else
			{
				for(int j=1;j<temp.length();j++)
				{
					if(literka == temp.charAt(j))
					{
						licznik++;
					}
					if(literka != temp.charAt(j) || j==temp.length()-1)
					{
						if(licznik==1)
						{
							System.out.print(literka);
						}else if(licznik==2)
						{
							System.out.print("" + literka + literka);
						}else if (licznik>2)
						{
							System.out.print("" + literka + licznik);
						}
						licznik=1;
					}
					if(j==temp.length()-1 && literka!=temp.charAt(j))
					{
						System.out.print(temp.charAt(j));
					}
					literka=temp.charAt(j);
				}
			}
			System.out.println();
			
		}

	}

}
