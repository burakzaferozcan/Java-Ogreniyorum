
public class Main {

	public static void main(String[] args) {
		// mantıksal operatörler "&&","||","!","?:"
		boolean a = true;
		System.out.println(a);
		System.out.println(!a);
		System.out.println("------------------------");

		int sayi1 = 5, sayi2 = 4, sayi3 = 6, sayi4 = 12;
		boolean sonuc1 = sayi1 < sayi2;
		System.out.println(sonuc1);
		System.out.println("------------------------");

		// ve
		boolean sonuc2 = sayi1 > sayi2 && sayi3 < sayi4;
		System.out.println(sonuc2);
		System.out.println("------------------------");

		// yada
		boolean sonuc3 = sayi1 > sayi2 || sayi4 < sayi3;
		System.out.println(sonuc3);
		System.out.println("------------------------");

		// ternary operator
		int sayi5 = 5;
		boolean sonuc4 = sayi5 > 4 ? true : false;

	}

}
