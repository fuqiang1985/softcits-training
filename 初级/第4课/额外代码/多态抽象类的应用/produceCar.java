package lesson4;

public class produceCar {
	//ģ��ģʽ
	public static void main(String[] args) {
		autoProduction toyota = new ToyotaCar();
		toyota.run();
		autoProduction dasAuto = new dasAutoCar();
		dasAuto.run();
	}

}
