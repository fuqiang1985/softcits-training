
public class ThreadDemo extends Thread {
	//ʹ�ü̳�Thread���ഴ�����̣߳����߳�֮���޷�����ʵ������������
	private int i;
	
	@Override
	public void run() {
		for(; i < 10; i++){
			//ʹ��getName���Ի�ȡ��ǰ�߳�����
			System.out.println(getName() +"���е�: "+ i +"��");
		}
	}
	public static void main(String[] args){
		int j = 0;
		for(int i = 0; i < 10; i++){
			//ͨ��Thread�ľ�̬����currentThread��ȡ��ǰ�߳�
			//main������JVM���������߳�
			System.out.println(Thread.currentThread().getName() +"���е�: "+ i +"��");
			if(i == 3){
				//������һ���߳�ʵ��
				ThreadDemo td1 = new ThreadDemo();
				//���߳���������
				td1.setName("�̱߳��:" + Integer.toString(++j));
				td1.start();
				//�����ڶ����߳�ʵ��
				ThreadDemo td2 = new ThreadDemo();
				td2.setName("�̱߳��:" + Integer.toString(++j));
				td2.start();
			}
		}
	}

}
