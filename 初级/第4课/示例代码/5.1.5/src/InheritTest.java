
class Animal
{
	private void beat()
	{
		System.out.println("��������...");
	}
	public void breath()
	{
		beat();
		System.out.println("��һ��������һ������������...");
	}
}
//�̳�Animal��ֱ�Ӹ��ø����breath����
class Bird extends Animal
{
	public void fly()
	{
		System.out.println("����������ڵķ���...");
	}
}
//�̳�Animal��ֱ�Ӹ��ø����breath����
class Wolf extends Animal
{
	public void run()
	{
		System.out.println("����½���ϵĿ��ٱ���...");
	}
}
public class InheritTest
{
	public static void main(String[] args)
	{
		Bird b = new Bird();
		b.breath();
		b.fly();
		Wolf w = new Wolf();
		w.breath();
		w.run();
	}
}
