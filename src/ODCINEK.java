import java.util.Scanner;

public class ODCINEK {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] odcinek1 = new int[2];
		int [] odcinek2 = new int[2];
		for(int i = 0; i < 2 ; i++)
		{
			odcinek1[i]=input.nextInt();
		}
		for(int i = 0; i < 2 ; i++)
		{
			odcinek2[i]=input.nextInt();
		}
		if(odcinek1[1] < odcinek2[0] || odcinek1[0] > odcinek2[1])
		{
			System.out.print("null");
		}
		else if(odcinek1[0] < odcinek2[0])
		{
			if(odcinek1[1] >= odcinek2[0] && odcinek1[1] <= odcinek2[1] )
			{
				System.out.print(odcinek2[0] + " " + odcinek1[1]);
			}
			else
			{
				System.out.print(odcinek2[0] + " " + odcinek2[1]);
			}
		}
		else if(odcinek1[0] >= odcinek2[0] )
		{
			if(odcinek1[1] <= odcinek2[1])
			{
				System.out.print(odcinek1[0] + " " + odcinek1[1]);
			}
			else
			{
				System.out.print(odcinek1[0] + " " + odcinek2[1]);
			}
			
		}
	}

}
