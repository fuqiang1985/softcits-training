import java.util.*;
public class ListErr
{
	public static void main(String[] args)
	{
		// ����һ��ֻ�뱣���ַ�����List����
		List strList = new ArrayList();
		strList.add("����");
		strList.add("����");
		// ��һ�����δ���˼���
		strList.add(5);
		Iterator it = strList.iterator();
		while(it.hasNext())
			System.out.println(((String)it.next()).length());
		
	}
}
