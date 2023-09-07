
public class Main {

	public static void main(String[] args) {

		HesapMakinesi makine1 = new HesapMakinesi(5,4);

		System.out.println(makine1.toplama());
		System.out.println(makine1.cikarma());
		System.out.println(makine1.carpma());
		System.out.println(makine1.bolme());
		// final deyimi static tanımlandığı için nesne türetmeden pi sayısına erişilebilir
		System.out.println(HesapMakinesi.PI);
		System.out.println(makine1.area(10));



	}

}
