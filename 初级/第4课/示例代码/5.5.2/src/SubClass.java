class BaseClass
{
	public int book = 6;
	public void base()
	{
		System.out.println("�������ͨ����");
	}
	public void test()
	{
		System.out.println("����ı����ǵķ���");
	}
}
public class SubClass extends BaseClass
{
	//���¶���һ��bookʵ���������ظ����bookʵ������
	public String book = "JAVAѵ��Ӫ";
	public void test()
	{
		System.out.println("����ĸ��Ǹ���ķ���");
	}
	public void sub()
	{
		System.out.println("�������ͨ����");
	}
	public static void main(String[] args)
	{
		// �������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
		BaseClass bc = new BaseClass();
		// ��� 6
		System.out.println(bc.book);
		// �������ε��ý�ִ��BaseClass�ķ���
		bc.base();
		bc.test();
		// �������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
		SubClass sc = new SubClass();
		// ���"������Java EE��ҵӦ��ʵս"
		System.out.println(sc.book);
		// ������ý�ִ�дӸ���̳е���base()����
		sc.base();
		// ������ý�ִ�дӵ�ǰ���test()����
		sc.test();
		
		//�����ǹؼ�---------------------------
		// ����ʱ���ͺ�����ʱ���Ͳ�һ������̬����
		BaseClass ploymophicBc = new SubClass();
		// ���6 ���� �������ʵ��Ǹ�������ʵ������
		System.out.println(ploymophicBc.book);
		// ������ý�ִ�дӸ���̳е���base()����
		ploymophicBc.base();
		// ������ý�ִ�дӵ�ǰ���test()����
		ploymophicBc.test();
		// ��ΪploymophicBc�ı���������BaseClass��
		// BaseClass��û���ṩsub����,��������������ʱ����ִ���
		// ploymophicBc.sub();
	}
}
