package threadCommunication;


public class DrawTest
{
	public static void main(String[] args)
	{
		// ����һ���˻�
		Account acct = new Account("�������п�" , 0);
		
		new DepositThread("�������" , acct , 800).start();
		new DrawThread("����ȡ��" , acct , 800).start();
		new DrawThread("Ů��ȡ��" , acct , 800).start();
		new DrawThread("����ȡ��" , acct , 800).start();

	}
}
