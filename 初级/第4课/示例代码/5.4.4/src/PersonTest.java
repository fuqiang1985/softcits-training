public class PersonTest
{
	public static void main(String[] args)
	{
		Person p = new Person();
		// ��Ϊage��Ա�����ѱ����أ�����������佫���ֱ������
		// p.age = 1000;
		// ���������벻����ִ��󣬵�����ʱ����ʾ"�����õ����䲻�Ϸ�"
		// ���򲻻��޸�p��age��Ա����
		p.setAge(1000);
		// ����p��age��Ա����Ҳ����ͨ�����Ӧ��getter����
		// ��Ϊ�����δ�ɹ�����p��age��Ա�������ʴ˴����0
		System.out.println("δ������age��Ա����ʱ��"
			+ p.getAge());
		// �ɹ��޸�p��age��Ա����
		p.setAge(35);
		// ��Ϊ����ɹ�������p��age��Ա�������ʴ˴����30
		System.out.println("�ɹ�����age��Ա������"
			+ p.getAge());
		// ����ֱ�Ӳ���p��name��Ա������ֻ��ͨ�����Ӧ��setter����
		// ��Ϊ"Mark"�ַ�����������2~6,���Կ��Գɹ�����
		p.setName("Mark");
		System.out.println("�ɹ�����name��Ա������"
			+ p.getName());
	}
}
