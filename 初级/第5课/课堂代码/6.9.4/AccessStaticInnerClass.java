package six.nine.four;

public class AccessStaticInnerClass
{
	static class StaticInnerClass
	{
		private static int prop1 = 5;
		private int prop2 = 9;
		public StaticInnerClass()
		{
			System.out.println("��̬�ڲ���Ĺ�����");
		}
	}
	public void accessInnerProp()
	{
//		 System.out.println(prop1);
		// ���������ִ���Ӧ��Ϊ������ʽ��
		// ͨ���������ʾ�̬�ڲ�������Ա
		System.out.println(StaticInnerClass.prop1);
		// System.out.println(prop2);
		// ���������ִ���Ӧ��Ϊ������ʽ��
		// ͨ��ʵ�����ʾ�̬�ڲ����ʵ����Ա
		System.out.println(new StaticInnerClass().prop2);
	}
	
	public static void main(String[] args) {
		//ͨ��new�������ڲ��๹����������̬�ڲ���ʵ��
		AccessStaticInnerClass.StaticInnerClass in = new AccessStaticInnerClass.StaticInnerClass();
	}
}

