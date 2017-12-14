import java.io.*;
public class InsertContent
{
	public static void insert(String fileName , long pos
		, String insertContent) throws IOException
	{
		File temp = File.createTempFile("temp.txt" , null);
		temp.deleteOnExit();
		try(
			RandomAccessFile raf = new RandomAccessFile(fileName , "rw");
			// ʹ����ʱ�ļ�����������������
			FileOutputStream tmpOut = new FileOutputStream(temp);
			FileInputStream tmpIn = new FileInputStream(temp))
		{
			raf.seek(pos);
			// ------������뽫����������ݶ�����ʱ�ļ��б���------
			byte[] bbuf = new byte[1024];
			// ���ڱ���ʵ�ʶ�ȡ���ֽ���
			int hasRead = 0;
			// ʹ��ѭ����ʽ��ȡ�����������
			while ((hasRead = raf.read(bbuf)) > 0 )
			{
				// ����ȡ������д����ʱ�ļ�
				tmpOut.write(bbuf , 0 , hasRead);
			}
			// ----------��������������----------
			// ���ļ���¼ָ�����¶�λ��posλ��
			raf.seek(pos);
			// ׷����Ҫ���������
			raf.write(insertContent.getBytes());
			// ׷����ʱ�ļ��е�����
			while ((hasRead = tmpIn.read(bbuf)) > 0 )
			{
				raf.write(bbuf , 0 , hasRead);
			}
		}
	}
	public static void main(String[] args)
		throws IOException
	{
		insert("test.txt" , 7 , "really ");
	}
}

