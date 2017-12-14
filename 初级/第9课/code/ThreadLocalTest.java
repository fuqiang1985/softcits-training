class Student
{
	/* ����һ��ThreadLocal���͵ı������ñ�������һ���ֲ߳̾�����
	ÿ���̶߳��ᱣ���ñ�����һ������ */
	private ThreadLocal<String> name = new ThreadLocal<>();
	// ����һ����ʼ��name��Ա�����Ĺ�����
	public Student(String str)
	{
		this.name.set(str);
		// ����������ڷ��ʵ�ǰ�̵߳�name������ֵ
		System.out.println("---" + this.name.get());
	}
	// name��setter��getter����
	public String getName()
	{
		return name.get();
	}
	public void setName(String str)
	{
		this.name.set(str);
	}
}
class MyTest extends Thread
{
	// ����һ��Student���͵ĳ�Ա����
	private Student account;
	public MyTest(Student account, String name)
	{
		super(name);
		this.account = account;
	}
	public void run()
	{
		// ѭ��10��
		for (int i = 0 ; i < 10 ; i++)
		{
			// ��i == 6ʱ������˻����滻�ɵ�ǰ�߳���
			if (i == 6)
			{
				account.setName(getName());
			}
			// ���ͬһ���˻����˻�����ѭ������
			System.out.println(account.getName()
				+ " �˻���iֵ��" + i);
		}
	}
}
public class ThreadLocalTest
{
	public static void main(String[] args)
	{
		// ���������̣߳������̹߳���ͬһ��Student
		Student at = new Student("��ʼ��");
		/*
		��Ȼ�����̹߳���ͬһ���˻�����ֻ��һ��name
		�������˻�����ThreadLocal���͵ģ�����ÿ���߳�
		����ȫӵ�и��Ե��˻������������Դ�i == 6֮�󣬽���������
		�̷߳���ͬһ���˻�ʱ������ͬ��name��
		*/
		new MyTest(at , "�̼߳�").start();
		new MyTest(at , "�߳���").start ();
	}
}
