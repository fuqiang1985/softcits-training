package six.nine.four;

public class StaticInnerClassTest
{
	
	private int prop1 = 5;
	private static int prop2 = 9;
	static class StaticInnerClass
	{
		// ��̬�ڲ�������԰�����̬��Ա
		private static int age;
		public void accessOuterProp()
		{
			// ���������ִ���
			// ��̬�ڲ����޷������ⲿ���ʵ������
//			System.out.println(prop1);
			// �����������
			System.out.println(prop2);
		}
	}
	
	public static void main(String[] args){
		//��̬�ڲ�������ɷ���
		new StaticInnerClassTest.StaticInnerClass().accessOuterProp();
		//�Ǿ�̬�ڲ�������ɷ���
		//new StaticInnerClassTest().new StaticInnerClass().accessOuterProp();
	}
}

