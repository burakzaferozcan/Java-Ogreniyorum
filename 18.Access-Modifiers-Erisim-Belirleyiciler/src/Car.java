import java.awt.Color;

public class Car {
	// private erişim belirleyicisiyle belirlendiği için dışardan erişilemez
	private int enginePower,model;
	public int speed;
	protected String color;
	
	public Car() {
		this.model=2020;
		this.enginePower=3000;
		this.speed=180;
		this.color="KIRMIZI";
	}
	public void print() {
		System.out.println(model +" model\n"+enginePower +" motor gucu\n"+speed +" KM/H\n"+color +" RENK\n");
		
	}
}
