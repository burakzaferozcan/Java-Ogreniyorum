
public class Main {

	public static void main(String[] args) {
		// STRING SINIFI KULLANIMI
		// length(); girilen karakterin sayisini döndürür
		// concat(str2) string birleştirme
		// indexOf('a') karakterin indexini verir
		// lastIndexOf('a') karakterin sondan indexini verir
		// charAt(5) : indexi verilen karakteri verir
		// compareTo(metin) : kucuk buyuk harf duyarlı olarak karşılaştırır
		// compareToIgnoreCase(metin) : kucuk buyuk harf duyarlı olmadan karşılaştırır
		// contains("mer") girilen deger strin içinde geçiyor mu diye kontrol eder
		// ensWith("a") belirtilen karakter(ler) ile başlıyorsa true degerini döndürür
		// ensWith("a") belirtilen karakter(ler) ile bitiyorsa true degerini döndürür
		// replace("merhaba","selam") string değiştirmek için kullanılır
		// toLowerCase() stringi küçük harfe cevirir
		// toUpperCase() stringi buyuk harfe cevirir
		
		String metin="MERHABA";
		String metin2="selam";
		System.out.println(metin.length());
		System.out.println(metin.concat(metin2));
		System.out.println(metin.indexOf("A"));
		System.out.println(metin.charAt(2));
		System.out.println(metin.contains("BA"));
		
		
		
	
		
	}

}
