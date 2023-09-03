
public class Main {

	public static void main(String[] args) {
		// 
		Car car=new Car();
		// private erişim belirleyicisiyle belirlendiği için dışardan erişilemez
//		car.enginePower=10;
		// public erişim belirleyicisiyle belirlendiği için dışardan erişilebilir
		car.speed=200;
		// protected erişim belirleyicisiyle belirlendiği için sadece paket içerisinde erişilebilir.
		car.color="MAVI";
		car.print();

	}

}
