import com.burak.Ogrenci;

public class Main {

	public static void main(String[] args) {
		// bir sınıf var . biz bir sınıfın değişkenlere erişebilmek için 
		// o classtan nesne turetmemiz gerekiyor.
		
		Ogrenci ogrenci1=new Ogrenci(5,"burak","ozcan");
//		ogrenci1.id=5;
//		ogrenci1.isim="burak";
//		ogrenci1.soyisim="ozcan";

		
		System.out.println("ogrencinin bilgiileri:");
		System.out.println("ID : "+ogrenci1.id);
		System.out.println("isim : "+ogrenci1.isim);
		System.out.println("soyisim : "+ogrenci1.soyisim);
		
		
		Ogrenci ogrenci2=new Ogrenci();
	}

}
