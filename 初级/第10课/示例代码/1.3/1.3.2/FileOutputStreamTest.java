
import java.io.*;
public class FileOutputStreamTest
{
	public static void main(String[] args)
	{
		try(
			// �����ֽ�������
			FileInputStream fis = new FileInputStream("a.txt");
			// �����ֽ������
			FileOutputStream fos = new FileOutputStream("b.txt")) {
			byte[] bbuf = new byte[32];
			int hasRead = 0;
			// ѭ������������ȡ������
			while ((hasRead = fis.read(bbuf)) > 0) {
				// ÿ��ȡһ�Σ���д���ļ�����������˶��٣���д���١�
				fos.write(bbuf, 0, hasRead);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
