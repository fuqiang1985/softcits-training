import java.util.*;

public class ListErrV2
{
	public static void main(String[] args)
	{
		// ʹ�÷���-�������ڷ�����
		List<String> strList = new ArrayList<String>();
		strList.add("����");
		strList.add("����");
		// ��һ�����δ���˼��ϣ����˷��ͻ����У��
		strList.add(5);
		Iterator it = strList.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}
}
