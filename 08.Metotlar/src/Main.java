import java.util.Scanner;

public class Main {

	// ÖRNEK LOGİN UYGULAMASI
	static boolean aktif = true;
	static int hakSayisi = 3;

	public static void main(String[] args) {

		isimYazdir();
		System.out.println("-----------------------");
		topla(5, 12);
		System.out.println("-----------------------");
		isimSoyisimYazdir("burak", "ozcan");
		System.out.println("-----------------------");

		int carpimSonuc = carp(8, 2);
		System.out.println(carpimSonuc);
		System.out.println("-----------------------");

		// ÖRNEK sayinin tek mi cift mi oldugunu bulma programi

//		Scanner scanner=new Scanner(System.in);
//		System.out.println("sayinin tek mi cift mi oldugunu bulma programi");
//		System.out.print("dizinin eleman sayisini giriniz : ");
//		int diziLength=scanner.nextInt();
//		scanner.nextLine();
//		int[] sayilar = new int[diziLength];
//		for(int i=0;i<sayilar.length;i++) {
//			System.out.println("dizinin "+(i+1)+".  degerini giriniz : ");
//			sayilar[i]=scanner.nextInt();
//			scanner.nextLine();
//			}
//		for (int deger : sayilar) {
//			tekMiCiftMi(deger);
//		}

		// ÖRNEK LOGİN UYGULAMASI
		Scanner scanner = new Scanner(System.in);
		if (aktif) {

			if (hakSayisi > 0) {
				while (aktif) {
					System.out.println("kullanici adiniz : ");
					String username = scanner.nextLine();
					System.out.println("sifreniz : ");
					String password = scanner.nextLine();
					Boolean sonuc = login(username, password);
					if (sonuc) {
						System.out.println("uygulamaya basarili olarak giris yaptiniz");
						break;
					} else {
						if (hakSayisi == 0) {
							aktif = false;
							break;
						}
					}
				}if(aktif==false) {
					System.out.println("hak sayiniz dolmustur");
				}

			} else {
				System.out.println("hak sayiniz dolmustur., hesabiniz bloke oldu.");
			}
		} else {
			System.out.println("hesabiniz aktif degildir, yoneticiniz ile iletisime geciniz");
		}

	}

	// parametresiz ve geriye deger döndürmeyen metot
	public static void isimYazdir() {
		System.out.println("burak");
	}

	// parametreli ve geriye değer döndürmeyen metot tanımlama
	public static void topla(int sayi1, int sayi2) {
		int sonuc = sayi1 + sayi2;
		System.out.println(sonuc);
	}

	public static void isimSoyisimYazdir(String isim, String soyisim) {
		System.out.println("isim soyisim : " + isim + " " + soyisim);
	}

	// parametreli ve geriye değer döndürmeyen metot tanımlama
	public static int carp(int sayi1, int sayi2) {

		return sayi1 * sayi2;
	}
	// ÖRNEK sayinin tek mi cift mi oldugunu bulma programi
//	public static void tekMiCiftMi(int sayi) {
//		if(sayi%2==0) {
//			System.out.println("sayi : "+ sayi +" cifttir.");
//		}else {
//			System.out.println("sayi : "+ sayi +" tektir.");
//		}
//	}

	// ÖRNEK LOGİN UYGULAMASI
	public static boolean login(String username, String password) {
		if (username.equals("burak") && password.equals("123")) {
			return true;
		} else {
			hakSayisi--;
			System.out.println("kullanici adi ve sifreniz yanlistir.");
			if (hakSayisi == 0) {
				aktif = false;
			}
			return false;
		}
	}

}
