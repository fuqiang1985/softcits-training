public class IntegerValTest
{
	public static void main(String[] args)
	{
		// �����������ȷ�ģ�ϵͳ���Զ���56����byte���ʹ���
		byte a = 56;
		/*
		��������Ǵ�ģ�ϵͳ�����9999999999999����long���ʹ���
		���Գ���int�ı�����Χ���Ӷ��������
		*/
//		 long bigValue = 9999999999999;
		// �����������ȷ�ģ��ھ޴������ֵ��ʹ��L��׺��ǿ��ʹ��long����
		long bigValue2 = 9223372036854775807L;

		// ��0��ͷ������ֵ��8���Ƶ�����
		int octalValue = 013;
		System.out.println("�˽��Ʋ��ԣ�" + octalValue);
		// ��0x��0X��ͷ������ֵ��16���Ƶ�����
		int hexValue1 = 0x23;
		int hexValue2 = 0XaF;

		System.out.println("�ҵ����䣺" + hexValue1);
		System.out.println(hexValue2);

		// ����һ��32λ�Ķ�������,���λ�Ƿ���λ��
		int binVal1 = 0b11010100;
		int binVal2 = 0B10000000000000000000000000000011;
		System.out.println(binVal1);
		System.out.println(binVal2); 
		
		/*
		 ����һ��8λ�Ķ����ƣ�����ֵĬ��ռ32λ���������һ��������
		 ֻ��ǿ������ת����byteʱ��������������յ���binVal4�����-23
		 */
		byte binVal3 = (byte)0b11101001;
		System.out.println(binVal3);
		
		/*
		  ����һ��32λ�Ķ�������,���λ��1��
		  ��������ֵ�������L��׺����˸�������ʵ��ռ64λ����32λ��1���Ƿ���λ��
		  ���binVal5��ֵ����2��31�η� + 2 + 1
		 */
		long binVal4 = 0B10000000000000000000000000000011L;
		System.out.println(binVal4); 
	}
}