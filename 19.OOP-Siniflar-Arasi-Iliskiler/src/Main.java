
public class Main {

	public static void main(String[] args) {
		// SINIFLAR ARASI İLİŞKİLER
		// BAĞIMLILIK - DEPENDENCY "USES A"
		// BİRLEŞTİRME - COMPOSİTİON  "HAS A"
		// KALITIM - İNHERİTANCE - "İS A"
		
		
		A a=new A();
		B b= new B();
		C c=new C();
		b.deger=8;
		a.run(b);
		a.c=c;
		a.run2();
		
				}

}
