public class AssignOperatorTest
{
	public static void main(String[] args)
	{
		int a;
		int b;
		int c;
		// ͨ��Ϊa, b , c��ֵ������������ֵ����7
		a = b = c = 7;
		// �������������ֵ��
		System.out.println(a + "\n" + b + "\n" + c);

		a*=b;
		System.out.println(a);
	}
}
