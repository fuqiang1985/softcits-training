
public class RunnableDemo implements Runnable {
	//ʹ��Runnableʵ���࣬���߳�֮����Թ���ʵ������������
	private int i;
	
	@Override
	public void run() {
		for(; i < 10; i++){
			//��ȡ��ǰ�߳�����
			System.out.println(Thread.currentThread().getName() +"���е�: "+ i +"��");
		}
	}
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			//ͨ��Thread�ľ�̬����currentThread��ȡ��ǰ�߳�
			//main������JVM���������߳�
			System.out.println(Thread.currentThread().getName() +"���е�: "+ i +"��");
			if(i == 3){
				//����Runnable�ӿ�ʵ�����ʵ��
				RunnableDemo rd = new RunnableDemo();
				//�����´������̹߳���Runnable�ӿ�ʵ����ʵ��
				new Thread(rd, "�߳�1").start();
				new Thread(rd, "�߳�2").start();
			}
		}
	}

}
