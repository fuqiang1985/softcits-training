import java.util.concurrent.*;

class Producer extends Thread
{
	private BlockingQueue<String> bq;
	public Producer(BlockingQueue<String> bq)
	{
		this.bq = bq;
	}
	public void run()
	{
		String[] strArr = new String[]
		{
			"Java",
			"Struts",
			"Spring"
		};
		for (int i = 0 ; i < 10 ; i++ )
		{
			try
			{
				Thread.sleep(200);
				// ���Է���Ԫ�أ���������������̱߳�����
				bq.put(strArr[i % 3]);
			}
			catch (Exception ex){ex.printStackTrace();}
			System.out.println(getName() + "�������");
		}
	}
}
class Consumer extends Thread
{
	private BlockingQueue<String> bq;
	public Consumer(BlockingQueue<String> bq)
	{
		this.bq = bq;
	}
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(200);
				// ����ȡ��Ԫ�أ���������ѿգ��̱߳�����
				bq.take();
			}
			catch (Exception ex){ex.printStackTrace();}
			System.out.println(getName() + "�������");
		}
	}
}
public class BlockingQueueDemo
{
	public static void main(String[] args)
	{
		// ����һ������Ϊ1��BlockingQueue
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(3);
		// ����3���������߳�
		new Producer(bq).start();
		new Producer(bq).start();
		new Producer(bq).start();
		// ����һ���������߳�
		new Consumer(bq).start();
	}
}