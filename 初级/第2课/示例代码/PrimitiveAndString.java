public class PrimitiveAndString
{
	public static void main(String[] args)
	{
		// ��������Ǵ�ģ���Ϊ5��һ������������ֱ�Ӹ���һ���ַ���
		// String str1 = 5;
		// һ����������ֵ���ַ���������������ʱ����������ֵ�Զ�ת��Ϊ�ַ���
		String str2 = 3.5 + "";
		// �������3.5
		System.out.println(str2);
		// ����������7Hello!
		System.out.println(3 + 4 + "Hello!");
		// ����������Hello!34����ΪHello! + 3���3�����ַ�������
		// �����ٰ�4�����ַ�������
		System.out.println("Hello!" + 3 + 4);
		// ����ַ���Hello!a7
		System.out.println("Hello!" + 'a' + 7);
		// ����ַ���104Hello!
		System.out.println('a' + "Hello!");
		/*System.out.println((int)'a');*/
	}
}
