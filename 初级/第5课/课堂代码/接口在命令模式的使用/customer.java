package inter.demo;

public class customer {

	public static void main(String[] args) {
		waitor sangen = new waitor();
		sangen.proceed("����", new cookNoodle());
		
		sangen.proceed("�׷�", new cookRice());
		
		sangen.proceed("��", new cook(){
			public void cooking(String material) {
				System.out.println("��ʼ��:" + material);
			}
		});
		
	}

}
