package synchronizedMethod;


public class DrawThread extends Thread
{
	// ģ���û��˻�
	private Account account;
	// ��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
	private double drawAmount;
	public DrawThread(String name , Account account
		, double drawAmount)
	{
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	// �������߳��޸�ͬһ����������ʱ�����漰���ݰ�ȫ���⡣
	public void run()
	{
		// ֱ�ӵ���account�����draw������ִ��ȡǮ
		// ͬ��������ͬ����������this��this�������draw()�����Ķ���
		// Ҳ����˵���߳̽���draw()����֮ǰ�������ȶ�account����ļ�����
		account.draw(drawAmount);
	}
}
