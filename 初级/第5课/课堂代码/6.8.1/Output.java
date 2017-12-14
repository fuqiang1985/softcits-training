package six.eight.one;

public interface Output
{
	// �ӿ��ﶨ��ĳ�Ա����ֻ���ǳ���
	int MAX_CACHE_LINE = 5;
	
	// �ӿ��ﶨ�����ͨ����ֻ����public�ĳ��󷽷���������ʵ�֣�Java8��ǰ��
	void out();
	void getData(String msg);
	
	// Java8��ʼ�������ڽӿ��ж���Ĭ�Ϸ�������Ҫʹ��default���Σ������з���ʵ��
	//���Ա�ʵ�������ֱ�ӵ���
	default void print(String... msgs)
	{
		for (String msg : msgs)
		{
			System.out.println(msg);
		}
	}
	default void test()
	{
		System.out.println("Ĭ�ϵ�test()����");
	}
	
	// �ڽӿ��ж����෽������Ҫʹ��static����
	static String staticTest()
	{
		return "�ӿ�����෽��";
	}
}