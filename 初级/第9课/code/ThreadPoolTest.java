
import java.util.concurrent.*;
public class ThreadPoolTest
{
	public static void main(String[] args)
		throws Exception
	{
		// ����һ�����й̶��߳�����6�����̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(6);
		// ���̳߳����ύ�����߳�
		pool.submit(new Runnable(){

			@Override
			public void run() {
				Thread.currentThread().setName("���߳�1");
				for (int i = 0; i < 10 ; i++ )
				{
					System.out.println(Thread.currentThread().getName()
						+ " ִ�д���: " + i);
				}
				
			}});
		
		pool.submit(new Runnable(){
			@Override
			public void run() {
				Thread.currentThread().setName("���߳�2");
				for (int i = 0; i < 15 ; i++ )
				{
					System.out.println(Thread.currentThread().getName()
						+ " ִ�д���: " + i);
				}
				
			}
		});
		// �ر��̳߳�
		pool.shutdown();
	}
}

