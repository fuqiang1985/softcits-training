public class DoWhileTest
{
	public static void main(String[] args)
	{
		// 1~10���	
		// ��ʼ��
		int count = 1;
		int sum = 0;
		// ִ��do whileѭ��
		do
		{
			System.out.println(count);
			// ѭ���������
			sum += count;
			count++;
			// ѭ����������while�ؼ���
		}while (count <= 10);
		System.out.println("ѭ������!");
		System.out.println("1-10�ĺ�Ϊ��"+sum);
	}
}
