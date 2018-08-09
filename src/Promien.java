import java.util.Locale;
import java.util.Scanner;
import java.math.*;

public class Promien {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double Xa = input.nextInt();
		double Ya = input.nextInt();
		double Xb = input.nextInt();
		double Yb = input.nextInt();
		double Xc = input.nextInt();
		double Yc = input.nextInt();
		System.out.println();
		double odcinekAB = Math.sqrt( Math.pow(Xb-Xa, 2) + Math.pow(Yb-Ya, 2));
		double odcinekBC = Math.sqrt( Math.pow(Xc-Xb, 2) + Math.pow(Yc-Yb, 2));
		double odcinekAC = Math.sqrt( Math.pow(Xc-Xa, 2) + Math.pow(Yc-Ya, 2));
		double PoleTrojkataABC = 0.5 * Math.abs((Xb - Xa) * (Yc-Ya) - (Yb-Ya) * (Xc-Xa));
		double Promien = (odcinekAB*odcinekBC*odcinekAC) / (4*PoleTrojkataABC);
		System.out.printf(Locale.US,"%.2f",Promien);
	}

}
