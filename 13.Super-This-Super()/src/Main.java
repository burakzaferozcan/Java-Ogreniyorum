
public class Main {

	public static void main(String[] args) {
		
		A aNesnesi=new A(5,8);
		aNesnesi.aSinifiMetodu();
		
		B bNesnesi=new B();
		bNesnesi.bDegisken1=8;
		C cNesnesi=new C(9);
		
		System.out.println("b'den gelen "+cNesnesi.cDegisken1);
	}
	


}
