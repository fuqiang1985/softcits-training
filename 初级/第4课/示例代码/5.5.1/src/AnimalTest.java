
class Animal {
	public void say() {
		System.out.println("�ҽа��а���");
	}
}

class Chicken extends Animal {
	//��д����
	public void say() {
		System.out.println("������");
	}	
}

class Dog extends Animal {
	//��д����
	public void say() {
		System.out.println("������");
	}	
}

class Wolf extends Animal {
	//��д����
	public void say() {
		System.out.println("���~~");
	}	
}

public class AnimalTest {

	public static void main(String[] args) {
		//��������ָ�����࣬�����õ��������Լ�����������ʱ���ݾ�������������
		Animal a1 = new Chicken();
		a1.say();
		
		Animal a2 = new Dog();
		a2.say();
		
		Animal a3 = new Wolf();
		a3.say();
		
		//��֮������������ָ�������
//		Dog d = new Animal();
	}

}
