
import java.io.*;
public class FileReaderTest
{
	public static void main(String[] args)
	{
		try(
			// �����ַ�������
			FileReader fr = new FileReader("a.txt"))
		{
			// ����һ������Ϊ32���ַ�����
			char[] cbuf = new char[32];
			// ���ڱ���ʵ�ʶ�ȡ���ַ���
			int hasRead = 0;
			// ʹ��ѭ����ȡ
			while ((hasRead = fr.read(cbuf)) > 0 )
			{
				System.out.println(new String(cbuf , 0 , hasRead));
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
