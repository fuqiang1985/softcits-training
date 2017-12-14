package homework;

import java.io.File;
import java.io.RandomAccessFile;

public class Test3 {
	/**
	 * ʹ������ļ�����RandomAccessFile��һ���ı��ļ����ö�����
	 * 
	 * ��������� RandomAccessFile��seek�����ܰѶ�ȡ�ļ��Ĺ���ƶ��������λ��
	 * ���ǻ����еص�ֵ��ע�����һ����ĸ��������ռ��һ���ֽڵģ� һ��������ռ�������ֽڵ�
	 */
	public static void main(String[] args) {
		// Ҫ��ȡ���ļ��ĵ�ַ
		File file = new File("D:/out.txt");
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "r");
			long length = raf.length();
			StringBuffer sb = new StringBuffer();
			while (length > 0) {
				length--;
				raf.seek(length);
				int c = (char) raf.readByte();
				// ���asc��<=255,>=0,���ж��Ǹ�Ӣ���ַ�,��ӵ��ַ�����.
				if (c >= 0 && c <= 255) {
					sb.append((char) c);
				} else {
					// �������asc�뷶Χ��,���ж��Ǹ������ַ�
					// �����ַ���ռ2���ֽڵ�,����length����һ���ֽ�
					length--;
					raf.seek(length);
					byte[] cc = new byte[2];
					// cc������Ϊ�ļ��������������ֽ�
					raf.readFully(cc);
					sb.append(new String(cc));
				}
			}
			System.out.println(sb);
			raf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
