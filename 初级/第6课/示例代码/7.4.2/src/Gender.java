public enum Gender implements GenderDesc
{

	//�˴���ö��ֵ������ö�Ӧ������������
	MALE("��")
	//�����Ų���ʵ������һ�����岿��
	{
		public void info()
		{
			System.out.println("���ö��ֵ��������");
		}
	},
	FEMALE("Ů")
	{
		public void info()
		{
			System.out.println("���ö��ֵ����Ů��");
		}
	};

	private final String name;
	//ö����Ĺ�����ֻ��ʹ��private����
	private Gender(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	//Ĭ�ϵ�info����Ҳ���Դ���
//	public void info()
//	{
//		System.out.println("����һ���������ڶ����Ա�Field��ö����");
//	}	
	public static void main(String[] args) {
		Gender.MALE.info();
	}
}
