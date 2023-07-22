import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO if else
//		int sayi1=1;
//		int sayi2=3;
//		if(sayi1>sayi2) {
//			System.out.println(sayi1 +" sayisi "+sayi2+" sayisindan buyuktur.");
//		}else {
//			System.out.println(sayi1 +" sayisi "+sayi2+" sayisindan kucuktur.");
//		}

		// if else örnek
		// vize1 %30 vize2 30% final 40% gecme notu 60;

//		Scanner scanner=new Scanner(System.in);
//		System.out.println("adinizi giriniz");
//		String isim= scanner.nextLine();
//		System.out.println("soyisminizi giriniz");
//		String soyIsim =scanner.nextLine();
//		System.out.println("Ders ismini giriniz");
//		String ders=scanner.nextLine();
//		System.out.println("1. vize notunuzu giriniz");
//		double vize1=scanner.nextDouble();
//		System.out.println("2. vize notunuzu giriniz");
//		double vize2=scanner.nextDouble();
//		System.out.println("final notunuzu giriniz");
//		double finalNot=scanner.nextDouble();
//		
//		double sonuc=(vize1*0.3)+(vize2*0.3)+(finalNot*0.4);
//		if(sonuc>=60) {
//			System.out.println(isim+" "+soyIsim+", "+ders+" dersinizin ortalamasi = "+ sonuc+" GECTINIZ");
//		}else {
//			System.out.println(isim+" "+soyIsim+",  "+ders+" dersinizin ortalamasi = "+ sonuc+" KALDINIZ");
//		}

		// TODO switch-case örnek
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("lutfen 1-7 arasi bir sayi giriniz");
//		int sayi=scanner.nextInt();
//		
//		switch (sayi) {
//		case 1: {
//			System.out.println("pazartesi");
//			break;
//		}
//		case 2: {
//			System.out.println("sali");
//			break;
//		}
//		case 3: {
//			System.out.println("carsamba");
//			break;
//		}
//		case 4: {
//			System.out.println("persembe");
//			break;
//		}
//		case 5: {
//			System.out.println("cuma");
//			break;
//		}
//		case 6: {
//			System.out.println("cumartesi");
//			break;
//		}
//		case 7: {
//			System.out.println("pazar");
//			break;
//		}
//		default:
//			System.out.println("gecersiz bir sayi girdiniz 1-7 arasi bir deger giriniz");
//		}

		// TODO GELİŞMİŞ ATM UYGULAMASI
		// burak'in kullanıcı adı burak88 sifre 123
		// sevval'in kullanıcı adı sevval88 sifre 123
		// bakiye gorüntülemek için >>> 1
		// para çekmek için>>> 2
		// farklı hesaba para atmak için >>> 3
		// uygulamadan çıkmak içiniçin >>> q

		Scanner scanner = new Scanner(System.in);
		String islemSecenekleri = "bakiye goruntuleme >>> 1 ||||||| para cekme >>> 2 ||||||| farkli hesaba para yatirma >>> 3 ||||||| cikis icin >>> q";

		double burakBakiye = 2450;
		String burakIBAN = "TR1265 0780 127 985 123 8545 12 85";
		String burakKullanici = "burak88";
		String burakSifre = "123";
		double sevvalBakiye = 1200;
		String sevvalIBAN = "TR1855 0780 787 962 523 8205 52 75";
		String sevvalKullanici = "sevval88";
		String sevvalSifre = "123";

		System.out.println("atm'ye hosgeldiniz");
		System.out.println("lutfen bilgilerinizi giriniz");
		System.out.print("kullanici adi : ");
		String kullaniciAdi = scanner.nextLine();
		System.out.print("sifre : ");
		String sifre = scanner.nextLine();

		if (kullaniciAdi.equals(burakKullanici) && sifre.equals(burakSifre)) {
			System.out.println("burak hesabına giriş yapildi");
			System.out.println(islemSecenekleri);
			System.out.println("lutfen bir secim yapiniz");

			String secim = scanner.nextLine();
			switch (secim) {
			case "1":
				System.out.println("bakiyeniz : " + burakBakiye);
				break;

			case "2":
				
				System.out.print("cekmek istediginiz tutari giriniz : ");
				int cekilecekTutar = scanner.nextInt();
				if (burakBakiye >= cekilecekTutar) {
					burakBakiye -= cekilecekTutar;
					System.out.println("kalan tutar : " + burakBakiye);
				} else {
					System.out.println("bakiyenizden daha yüksek tutar çekemezsiniz");
				}
				break;
			case "3":
				System.out.println("ne kadar para yatırmak istiyorsunuz");
				int yatirilacakTutar = scanner.nextInt();
				if (yatirilacakTutar <= burakBakiye) {
					System.out.print("IBAN giriniz : ");
					scanner.nextLine();
					String yatirilacakIBAN = scanner.nextLine();
					if (yatirilacakIBAN.equals(sevvalIBAN)) {
						System.out.println("para sevval adli kisiye yatiriliyor");
						burakBakiye -= yatirilacakTutar;
						sevvalBakiye += yatirilacakTutar;
						System.out.println("bakiyeniz : "+burakBakiye);
					} 

				}
				else {
					System.out.println("bakiyenizden daha yüksek tutar yatiramazsiniz");
				}
				break;

			}

		} else if (kullaniciAdi.equals(sevvalKullanici) && sifre.equals(sevvalSifre)) {
			System.out.println("sevval hesabina giris yapildi");
			System.out.println(islemSecenekleri);
			System.out.println("lutfen bir secim yapiniz");

			String secim = scanner.nextLine();
			switch (secim) {
			case "1":
				System.out.println("bakiyeniz : " + sevvalBakiye);
				break;

			case "2":
				System.out.println("cekmek istediginiz tutari giriniz : ");
				int cekilecekTutar = scanner.nextInt();
				if (sevvalBakiye >= cekilecekTutar) {
					sevvalBakiye -= cekilecekTutar;
					System.out.println("kalan tutar : " + sevvalBakiye);
				} else {
					System.out.println("bakiyenizden daha yüksek tutar çekemezsiniz");
				}
				break;
			case "3":
				System.out.println("ne kadar para yatırmak istiyorsunuz");
				int yatirilacakTutar = scanner.nextInt();
				if (yatirilacakTutar <= sevvalBakiye) {
					System.out.println("IBAN giriniz :");
					scanner.nextLine();
					String yatirilacakIBAN = scanner.nextLine();
					if (yatirilacakIBAN.equals(burakIBAN)) {
						System.out.println("para burak adli kisiye yatiriliyor");
						sevvalBakiye -= yatirilacakTutar;
						burakBakiye += yatirilacakTutar;
						System.out.println("bakiyeniz : "+sevvalBakiye);
					} 
				}
				else {
					System.out.println("bakiyenizden daha yüksek tutar yatiramazsiniz");
				}
				break;
			}

		} else {
			System.out.println("kullanici adiniz veya sifreniz yanlis");
		}

	}

}
