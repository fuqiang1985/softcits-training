
public class BananaTest {
	public static void main(String[] args) 
	{
		//����Banana�Ķ���
		Banana b = new Banana();

		//����ĳ�Ա
		b.weight = 100;
		
		//�����Լ��ĳ�Ա
		b.origin = "���ӹ�";
		b.spot = true;
		
		//���ø���ķ���
		b.info();
		
		//�����Լ��ķ���
		b.check_quality();
	}
}
