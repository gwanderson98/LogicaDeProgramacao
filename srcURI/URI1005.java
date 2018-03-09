import java.util.Locale;
import java.util.Scanner;

public class URI1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A = 3.5;
		double B = 7.5;
		double C = sc.nextDouble();
		double D = sc.nextDouble();
		double F = (A * C) / 11 + (B * D) / 11;
		System.out.printf("MEDIA = %.5f%n", F);
		sc.close();

	}
}
