public class FloatTest
{
	public static void main(String[] args)
	{
		double a = 0.0;
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		float e = Float.POSITIVE_INFINITY;
		// ����float��double�ĸ����������ȵġ�
		System.out.println(c == d);
		// 0.0����0.0�����ַ���
		System.out.println(a / a);
		// ��������֮���ǲ���ȵ�
		System.out.println(a / a == Float.NaN);
		// ���������������ȵ�
		System.out.println(6.0 / 0 == 555.0/0);
		// ��������0.0�õ��������
		System.out.println(-8 / a);
		// ������뽫�׳�����0���쳣
//		 System.out.println(0 / 0);
	}
}
