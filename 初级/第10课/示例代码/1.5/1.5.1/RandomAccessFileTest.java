import java.io.*;
public class RandomAccessFileTest
{
	public static void main(String[] args)
	{
		try(
			RandomAccessFile raf =  new RandomAccessFile(
				"test.txt" , "r"))
		{
			// ��ȡRandomAccessFile�����ļ�ָ���λ�ã���ʼλ����0
			System.out.println("The initial pointer position is:"
				+ raf.getFilePointer());
			// �ƶ�raf���ļ���¼ָ���λ��
			raf.seek(3);
			byte[] bbuf = new byte[1024];
			// ���ڱ���ʵ�ʶ�ȡ���ֽ���
			int hasRead = 0;

			while ((hasRead = raf.read(bbuf)) > 0 )
			{
				// ���ֽ�����ת�����ַ������룡
				System.out.print(new String(bbuf , 0 , hasRead ));
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
