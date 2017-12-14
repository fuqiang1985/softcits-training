package serven.one.one;
import java.util.*;
import java.io.*;
public class PropertiesTest
{
	public static void main(String[] args)
		throws Exception
	{
		Properties props = new Properties();
		// ��Properties����������
		props.setProperty("user1" , "����");
		props.setProperty("user2" , "����");
		// ��Properties�е�key-value�Ա��浽a.ini�ļ���
		props.store(new FileOutputStream("D:\\a.properties")
			, "user information");   //��
		// �½�һ��Properties����
		Properties props2 = new Properties();
		// ��Properties����������
		props2.setProperty("user3" , "����");	
		// ��a.ini�ļ��е�key-value��׷�ӵ�props2��
		props2.load(new FileInputStream("D:\\a.properties") );   //��
		// ��props2�����ݻ�д���ļ���
		props2.store(new FileOutputStream("D:\\a.properties"), "new Strings added");
		// ��Properties����ת����Map����
		Map map = new HashMap(props2);
		System.out.println(map);
	}
}
