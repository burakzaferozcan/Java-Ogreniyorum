
public class B extends C{
	public int bDegisken1;
	public void bSinifiMetodu() {
		System.out.println("B sinifinin icindeki metottayiz");
	}
	public B() {
		// TODO Auto-generated constructor stub
	}
	
	public B(int bDegisken1) {
		//super() metodunu sadece constructor içinde ve en üstte tanımlayabiliriz
		// üst sınıfın constructor'ına gitmek için kullanılır.
		super(bDegisken1);
		System.out.println("B sinifinin constructor'i icerisindeyiz.");
	}

}
