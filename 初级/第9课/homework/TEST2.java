package StudentHomework;

class printResult {
	// ��־λ�����������߳�1��2��3��ִ��˳��
	private int state = 1;
	// �߳�1��2��3����ı���
	private int num = 1;

	public synchronized void printNumbers(String threadName) {
		int id = Integer.parseInt(threadName);
		// ������Ǹ��ֵ���ǰ�߳�ִ�еĻ�����ȴ�
		while (state != id) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// ����ǵ�ǰ�߳�ִ�еģ����ӡ
		for (int i = 1; i <= 3; i++) {
			System.out.println("��ǰ�߳� " + threadName + " ��ӡ:" + num++);
		}
		// state��ֵ�� 2,3,1,2,3,1...ѭ��ȡֵ
		state = state % 3 + 1;
		//���ǻ��������߳�
		this.notifyAll();
	}
}
/*class printThread implements Runnable{
	private printResult pr;
	
	public printThread(printResult pr) {
		super();
		this.pr = pr;
	}

	public void run() {
		for (int j = 0; j < 5; j++) {
			pr.printNumbers(Thread.currentThread().getName());
		}
	}
}*/

public class TEST2 {

	public static void main(String[] args) {
		printResult pr = new printResult();

		// һ�����������߳�
		for (int i = 1; i <= 3; i++) {
			// ͨ�������ഴ�����߳�1��2��3
			new Thread(new Runnable() {
				// ��д������Runnable��run�������Ӷ�����ʵ�������
				public void run() {
					for (int j = 0; j < 5; j++) {
						pr.printNumbers(Thread.currentThread().getName());
					}
				}
			}, Integer.toString(i)).start();
			
//			new Thread(new printThread(pr), Integer.toString(i)).start();
		}
	}

}
