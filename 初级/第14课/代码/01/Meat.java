package one;

public class Meat {
	public void price(){
		System.out.println("Meat�ķ���...");
	}
}
class Beef extends Meat{
	//����price��ƴд�ᱨ��
	@Override
	public void price(){
		System.out.println("ţ����дMeat�ķ���...");
	}
}