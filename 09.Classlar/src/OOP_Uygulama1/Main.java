package OOP_Uygulama1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("*******************uygulamaya hosgeldiniz*******************");
		Scanner scanner = new Scanner(System.in);
		System.out.print("no degerini giriniz : ");
		int no = scanner.nextInt();
		scanner.nextLine();
		System.out.print("isim degerini giriniz : ");
		String isim = scanner.nextLine();
		System.out.print("soyisim degerini giriniz : ");
		String soyisim = scanner.nextLine();
		System.out.print("tecrube degerini giriniz : ");
		int tecrube = scanner.nextInt();
		System.out.print("maas degerini giriniz : ");
		double maas = scanner.nextDouble();
		Calisan calisan1 = new Calisan(no, isim, soyisim, tecrube, maas);

		String islemler = "1- CALISAN  BILGILERINI GOSTER\n" + "2-ZAM YAP\n" + "3-FORMAT AT\n" + "BIR SECIM YAPIN : ";
		System.out.println(islemler);
		int secim = scanner.nextInt();
		scanner.nextLine();
		switch (secim) {
		case 1:
			calisan1.calisanBilgileriGoster();
			break;
		case 2:
			System.out.println("zam degerini giriniz");
			int zamDegeri = scanner.nextInt();
			scanner.nextLine();
			calisan1.zamYap(zamDegeri);
			break;
		case 3:
			System.out.println("kim format atacak ismini giriniz : ");
			String kisi=scanner.nextLine();
			System.out.println("isletim sistemini yaziniz : ");
			String isletimSistemi=scanner.nextLine();
			calisan1.formatAt(isletimSistemi, kisi);
			break;
		default:
			System.out.println("lutfen belirtilen aralikta deger secimi yapiniz.");
			break;
		}
		

	}

}
