package StudentHomework;

class Print2 {
	int status = 1;
    
	//����
	public synchronized void printABC(String ThreadName, int j) throws InterruptedException {
		int id = Integer.parseInt(ThreadName);
		//�ȴ�
		while (status != id) {
			wait();
		}
		if (id == 1)
			System.out.println("�߳�" + Thread.currentThread().getName() + " ��   " + j + " �����->" + "A");
		if (id == 2)
			System.out.println("�߳�" + Thread.currentThread().getName() + " ��  " + j + " �����->" + "B");
		if (id == 3)
			System.out.println("�߳�" + Thread.currentThread().getName() + " ��  " + j + " �����->" + "C");
		//����
		this.notifyAll();
		status = status % 3 + 1;
	}
}

public class TEST3 {

	public static void main(String[] args) {
		Print2 print = new Print2();
		//�½������߳�
		for (int i = 1; i <= 3; i++) {
			new Thread(new Runnable() {
				public void run() {
					//ÿ���߳�����ʮ��
					for (int j = 1; j <= 10; j++) {
						try {
							print.printABC(Thread.currentThread().getName(), j);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}, Integer.toString(i)).start();
		}

	}

}
