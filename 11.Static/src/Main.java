
public class Main {

	public static void main(String[] args) {
		
		//bir class'ın içerisindeki değişken veya metotlara classtan nesne oluşturulmadan direkt
		// class adı üzerinden erişmenize olanak sağlayan anahtar kelimedir.
		
		// static değişken tanımı 
		Ogrenci.numara="123456789";
		// static metot tanımı 
		Ogrenci.numaraYazdir();
		
		
		
		
		
		Ogrenci ogrenci1=new Ogrenci();
		ogrenci1.numara="123546";
		ogrenci1.numara2="11111111111";
		System.out.println("ogrenci 1 static numara "+ogrenci1.numara);
		System.out.println(ogrenci1.numara2);
		Ogrenci ogrenci2=new Ogrenci();
		ogrenci2.numara="111111111";
		ogrenci2.numara2="4444444";
		System.out.println("ogrenci 2 static numara "+ogrenci2.numara);
		System.out.println(ogrenci2.numara2);


		
		ogrenci1.setAd("burak");
		ogrenci1.setId(1);
		ogrenci1.setSoyad("ozcan");
		ogrenci1.ogrenciBilgiler();
		
		
		
		

	}

}
