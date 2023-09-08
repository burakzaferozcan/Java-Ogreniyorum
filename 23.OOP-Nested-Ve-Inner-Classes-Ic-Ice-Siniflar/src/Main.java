
public class Main {

	public static void main(String[] args) {
		// Nested Class (iç içe sınıflar)
		// -inner class (iç sınıflar)
		//      a- static
		//      b- non-static
		// -local class (yerel sınıflar)
		// -anonymous class (anonim sınıflar)
		
		NonStatic n=new NonStatic();
		NonStatic.Inner inner=n.new Inner();
		//inner.run();
		
		Static.Inner s=new Static.Inner();
		//s.run();
		
		Local l=new Local();
		//l.run();
		
		Anonim a=new Anonim() {
			public void run() {
				System.out.println("Anonim sinifina ait run metodu");
			}
		};
		//a.run();
	}

}
