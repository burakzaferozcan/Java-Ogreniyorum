
public class A extends B{
	public int aDegisken1;
	public int aDegisken2;
public A() {
	System.out.println("A sinifinin constructor'i icerisindeyiz.");
}
public A(int aDegisken1, int aDegisken2) {
	this.aDegisken1 = aDegisken1;
	this.aDegisken2 = aDegisken2;
}
public void aSinifiMetodu() {
	System.out.println("A sinifinin icindeki metottayiz");
	// üst class için super metodu kullanılır.
	super.bSinifiMetodu();
}


}
