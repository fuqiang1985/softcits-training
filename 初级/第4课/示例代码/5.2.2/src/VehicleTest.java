class Vehicle {
	void drive() {
		System.out.println("���������У��ṩ����");
	}
}

class Car extends Vehicle {
	void drive() {
		super.drive();
		System.out.println("��������������ת��������ǰ��");
	}
}

class Plane extends Vehicle {
	void drive() {
		super.drive();
		System.out.println("����������������ת�����ɻ�����");
	}
}

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.drive();
		
		Plane p = new Plane();
		p.drive();
	}

}
