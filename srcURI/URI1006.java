import java.util.Locale;
import java.util.Scanner;

public class URI1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A = 2;
		double B = 3;
		double C = 5;
		double D = sc.nextDouble();
		double E = sc.nextDouble();
		double F = sc.nextDouble();
		double G = (D * A) / 10 + (E * B) / 10 + (F * C) / 10;
		System.out.printf("MEDIA = %.1f%n", G);
		sc.close();
	}

}
