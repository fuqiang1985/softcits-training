package synchronizedMethod;


public class DrawTest
{
	public static void main(String[] args)
	{
		// ����һ���˻�
		Account acct = new Account("�������п�" , 1000);
		// ģ�������̶߳�ͬһ���˻�ȡǮ
		new DrawThread("����" , acct , 800).start();
		new DrawThread("���Ķ�" , acct , 800).start();
	}
}

