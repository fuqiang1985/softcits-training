
public enum Gender implements GenderDesc
{

	//�˴���ö��ֵ������ö�Ӧ������������
	MALE("��"),	FEMALE("Ů");

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
	//���������info������ʵ��GenderDesc�ӿڱ���ʵ�ֵķ���
	public void info()
	{
		System.out.println(
			"����һ���������ڶ����Ա�Field��ö����");
	}
}
