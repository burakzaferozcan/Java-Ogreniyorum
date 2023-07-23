import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Dizi Oluşturma
		String[] isimDizisi = { "burak", "zafer", "sevval", "cimen" };
		for (int i = 0; i <= isimDizisi.length - 1; i++) {
			System.out.println(isimDizisi[i]);
		}
		System.out.println("---------------------------------------");
		int[] sayilar = new int[6];
		sayilar[0] = 15;
		sayilar[1] = 85;
		sayilar[2] = 25;
		sayilar[3] = 4523;
		sayilar[4] = 1986;
		sayilar[5] = 378;
		for (int i = 0; i <= sayilar.length - 1; i++) {
			System.out.println(sayilar[i]);
		}
		System.out.println("---------------------------------------");
		char[] karakterDizi= {'s','e','v','v','a','l'};
		for(int i=0;i<karakterDizi.length;i++) {
			System.out.println(karakterDizi[i]);
		}
		System.out.println("--------------------------------------");
		double[] doubleDizi= {5.12,8.3,9.21,8.8,9.3456};
		for(int i=0;i<=doubleDizi.length-1;i++) {
			System.out.println(doubleDizi[i]);
		}
		System.out.println("--------------------------------------");
		
		
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("diziniz kac elemanli olsun : ");
//		int diziUzunluk= scanner.nextInt();
//		scanner.nextLine();
//		String[] kullaniciDizi=new String[diziUzunluk];
//		for(int i=0;i<kullaniciDizi.length;i++) {
//			System.out.print("dizinin "+(i+1)+". elemanini giriniz : ");
//			
//			kullaniciDizi[i]=scanner.nextLine();
//		}
//		System.out.println("-------------OLUSTURDUGUNUZ DIZI-------------");
//		for(int i=0;i<=kullaniciDizi.length-1;i++) {
//			System.out.println(kullaniciDizi[i]);
//		}
		System.out.println("--------------------------------------");
		//********************FOREACH DÖNGÜSÜ********************

		String[] isimler= {"burak","zafer","sevval","cimen"};
		for (String isim : isimler) {
			System.out.println(isim);
		}
		System.out.println("--------------------------------------");
		
		int[] rakamlar= {0,1,2,3,4,5,6,7,8,9};
		for (int rakam : rakamlar) {
			System.out.println(rakam);
		}
		System.out.println("--------------------------------------");
	}

}
