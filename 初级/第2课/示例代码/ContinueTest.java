public class ContinueTest
{
	public static void main(String[] args)
	{
		// һ���򵥵�forѭ��
		for (int i = 0; i < 3 ; i++ )
		{
			System.out.println("i��ֵ��" + i);
			if (i == 1)
			{
				// ���Ա���ѭ����ʣ�����
				continue;
			}
			System.out.println("continue���������");
		}
	}
}
