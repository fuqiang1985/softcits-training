
public class WhileTest
{
	public static void main(String[] args)
	{
		// 1~10���		
		// ѭ���ĳ�ʼ������
		int count = 1;
		int sum = 0;
		// ��countС�ڵ���10ʱ��ִ��ѭ����
		while (count <= 10)
		{
			System.out.println(count);
			sum += count;
			count++;
			
		}
		System.out.println("ѭ������!");
		System.out.println("1-10�ĺ�Ϊ��"+sum);


//		// ������һ����ѭ��
//		int count = 0;
//		while (count < 10)
//		{
//			System.out.println("��ִͣ�е���ѭ�� " + count);
//			count--;
//		}
//		System.out.println("��Զ�޷�������ѭ����");

		int count2 = 0;
		// while�����һ���ֺţ�����ѭ������һ���ֺţ�����䣩
		while (count2 < 10);
		// ����Ĵ������whileѭ���Ѿ�û���κι�ϵ
		{
			System.out.println("------" + count2);
			count2++;
		}

	}
}
