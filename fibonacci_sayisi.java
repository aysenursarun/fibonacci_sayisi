package fibonacci_sayisi;

import java.util.Scanner;

public class fibonacci_sayisi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Eleman sayısını girin: ");
		int elemansayisi = scan.nextInt();

		int ilksayi = 0;
		int ikincisayi = 1;
		System.out.print(ilksayi);

		for (int i = 2; i <= elemansayisi; i++) {
			int sonrakisayi = ilksayi + ikincisayi;
			System.out.print(" " + sonrakisayi);
			ilksayi = ikincisayi;
			ikincisayi = sonrakisayi;
		}
	}

}
