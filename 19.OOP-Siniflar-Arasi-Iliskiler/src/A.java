
public class A {
	// BAĞIMLILIK
	public void run(B b) {
		System.out.println(b.deger);
	}
	// BİRLEŞTİRME
	public C c;
	public void run2() {
		System.out.println(c.deger);
	}
}
