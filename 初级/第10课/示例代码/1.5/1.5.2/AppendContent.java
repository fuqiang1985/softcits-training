import java.io.*;
public class AppendContent
{
	public static void main(String[] args)
	{
		try(
			//�Զ���д��ʽ��һ��RandomAccessFile����
			RandomAccessFile raf = new RandomAccessFile("test.txt" , "rw"))
		{
			//����¼ָ���ƶ���out.txt�ļ������
			raf.seek(raf.length());
			raf.write("added content here!\r\n".getBytes());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
