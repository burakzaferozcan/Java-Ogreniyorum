package KapsullemeUygulama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// GİŞE UYGULAMASI
		TCKN tcknNesne = new TCKN();
		Scanner scanner = new Scanner(System.in);

		System.out.println("gise uygulamasina hosgeldiniz.");
		System.out.println("lutfen TC no'nuzu giriniz.");
		String tckn = scanner.nextLine();
		tcknNesne.setTckn(tckn);

	}

}
