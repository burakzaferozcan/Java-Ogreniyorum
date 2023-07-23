import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ************************** FOR DÖNGÜSÜ **************************
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("-----------------------------------");
		// 1'den 10'a kadar olan çift sayılar
		System.out.println("1'den 10'a kadar olan cift sayilar 1. yontem");
		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("-----------------------------------");
		// 1'den 10'a kadar olan çift sayılar 2. yöntem
		System.out.println("1'den 10'a kadar olan cift sayilar 2. yontem");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("-----------------------------------");
		// 1'den 10'a kadar olan tek sayılar
		System.out.println("1'den 10'a kadar olan tek sayilar 1. yontem");
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("-----------------------------------");
		// 1'den 10'a kadar olan tek sayılar 2. yöntem
		System.out.println("1'den 10'a kadar olan tek sayilar 2. yontem");
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}

		}
		System.out.println("-----------------------------------");
		// 1'den 10'a kadar olan çift sayıların toplamı 1. yöntem
		System.out.println("1'den 10'a kadar olan cift sayilarin toplami 1. yontem");
		int ciftToplam = 0;
		for (int i = 0; i <= 10; i += 2) {
			ciftToplam += i;
		}
		System.out.println(ciftToplam);
		System.out.println("-----------------------------------");
		// 1'den 10'a kadar olan çift sayıların toplamı 1. yöntem
		System.out.println("1'den 10'a kadar olan cift sayilarin toplami 2. yontem");
		int ciftToplam2 = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				ciftToplam2 += i;
			}
		}
		System.out.println(ciftToplam2);
		System.out.println("-----------------------------------");
		// 1'den 10'a kadar olan tek sayıların toplamı 1. yöntem
		System.out.println("1'den 10'a kadar olan tek sayilarin toplami 1. yontem");
		int tekToplam = 0;
		for (int i = 1; i < 10; i += 2) {
			tekToplam += i;
		}
		System.out.println(tekToplam);
		System.out.println("-----------------------------------");
		// 1'den 10'a kadar olan tek sayıların toplamı 2. yöntem
		System.out.println("1'den 10'a kadar olan tek sayilarin toplami 2. yontem");
		int tekToplam2 = 0;
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 1) {
				tekToplam2 += i;
			}
		}
		System.out.println(tekToplam2);
		System.out.println("-----------------------------------");

		// 1'den 20ye kadar olan tek sayıları yazdır çift sayılar yerine "burak" yazdır
		System.out.println("1'den 20ye kadar olan tek sayıları yazdır çift sayılar yerine 'burak' yazdır");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("burak");
			} else {
				System.out.println(i);
			}
		}
		System.out.println("-----------------------------------");

		// ************************** WHİLE DÖNGÜSÜ **************************
		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			a++;
		}
		System.out.println("-----------------------------------");
		// 1'den 10'a kadar olan çift sayılar
		System.out.println("1'den 10'a kadar olan cift sayilar 1. yontem");
		int b = 0;
		while (b <= 10) {
			System.out.println(b);
			b += 2;
		}
		System.out.println("-----------------------------------");
		// 1'den 10'a kadar olan çift sayılar
		System.out.println("1'den 10'a kadar olan cift sayilar 2. yontem");
		int c = 0;
		while (c <= 10) {
			if (c % 2 == 0) {
				System.out.println(c);
			}
			c++;
		}
		System.out.println("-----------------------------------");
		// 1'den 10'a kadar olan tek sayılar
		System.out.println("1'den 10'a kadar olan tek sayilar 1. yontem");
		int d = 1;
		while (d < 10) {
			System.out.println(d);
			d += 2;
		}
		System.out.println("-----------------------------------");
		// 1'den 10'a kadar olan tek sayılar 2. yöntem
		System.out.println("1'den 10'a kadar olan tek sayilar 2. yontem");
		int e = 1;
		while (e < 10) {
			if (e % 2 == 1) {
				System.out.println(e);
			}

			e++;
		}
		System.out.println("-----------------------------------");
		// 1'den 10'a kadar olan çift sayıların toplamı 1. yöntem
		System.out.println("1'den 10'a kadar olan cift sayilarin toplami 1. yontem");
		int f = 0;
		int toplam1 = 0;
		while (f <= 10) {
			toplam1 += f;
			f += 2;
		}
		System.out.println(toplam1);
		System.out.println("-----------------------------------");

		// 1'den 10'a kadar olan çift sayıların toplamı 2. yöntem
		System.out.println("1'den 10'a kadar olan cift sayilarin toplami 2. yontem");
		int g = 0;
		int toplam2 = 0;
		while (g <= 10) {
			if (g % 2 == 0) {
				toplam2 += g;
			}
			g++;
		}
		System.out.println(toplam2);
		System.out.println("-----------------------------------");

		// 1'den 10'a kadar olan tek sayıların toplamı 1. yöntem
		System.out.println("1'den 10'a kadar olan tek sayilarin toplami 1. yontem");
		int h = 1;
		int toplam3 = 0;
		while (h < 10) {
			toplam3 += h;
			h += 2;
		}
		System.out.println(toplam3);
		System.out.println("-----------------------------------");
		// 1'den 10'a kadar olan tek sayıların toplamı 2. yöntem
		System.out.println("1'den 10'a kadar olan tek sayilarin toplami 2. yontem");
		int j = 1;
		int toplam4 = 0;
		while (j < 10) {
			if (j % 2 == 1) {
				toplam4 += j;
			}
			j++;
		}
		System.out.println(toplam4);
		System.out.println("-----------------------------------");

		// 1'den 20ye kadar olan tek sayıları yazdır çift sayılar yerine "burak" yazdır
		int k = 1;
		while (k <= 20) {
			if (k % 2 == 1) {
				System.out.println(k);
			} else {
				System.out.println("burak");
			}
			k++;
		}
		System.out.println("-----------------------------------");

		// ************************** BREAK **************************
		System.out.println("BREAK KULLANIMI");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 6) {
				break;
			}
		}
		System.out.println("-----------------------------------");
		// ************************** CONTINUE **************************
		System.out.println("CONTINUE KULLANIMI");
		for (int i = 1; i <= 10; i++) {

			if (i == 6 || i == 8) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("-----------------------------------");
		
		
		
		
		
		
		// ÇARPIM TABLOSU ÖRNEĞİ
		
		for(int m=1;m<=10;m++) {
			for(int n=1;n<=10;n++) {
				System.out.println(m+"x"+n+"="+(m*n));
			}
			System.out.println("-----------------------------");
		}
		
		// ASAL SAYI BULMA ÖRNEĞİ
		Scanner scanner=new Scanner(System.in);
		boolean asalMi=false;
		System.out.println("lutfen asal sayi olup olmadigini ogrenmek istediginiz bir sayi giriniz.");
		int sayi=scanner.nextInt();
		for(int i=2;i<=sayi;i++) {
			if(sayi==2) {
				asalMi=true;
			}
			else if(sayi%i==0||sayi<2) {
				asalMi=false;
				break;
			}
			else {
				asalMi =true;
			}
		}
		if(asalMi==true) {
			System.out.println(sayi+" sayisi asaldir.");
		}else {
			System.out.println(sayi+" sayisi asal degildir");
		}
		System.out.println("-----------------------------");
	}

}
