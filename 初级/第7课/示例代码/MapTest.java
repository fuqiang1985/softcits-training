package serven.one.one;


import java.util.*;
public class MapTest
{
	public static void main(String[] args)
	{
		Map map = new HashMap();
		// �ɶԷ�����key-value��
		map.put(1 , "����");
		map.put(2 , "����");
		map.put(3 , "����");
		System.out.println(map);
		// ��η����key-value����value�����ظ�
		map.put(4 , "����");
		System.out.println(map);
		// �����ظ���keyʱ���µ�value�Ḳ��ԭ�е�value
		// ����µ�value������ԭ�е�value���÷������ر����ǵ�value
		map.put(3 , "������");
		System.out.println(map); // �����Map���ϰ���4��key-value��
		// �ж��Ƿ����ָ��key
		System.out.println("�Ƿ����ֵΪ 3 key��"
			+ map.containsKey(3)); // ���true
		// �ж��Ƿ����ָ��value
		System.out.println("�Ƿ����ֵΪ ������ value��"
			+ map.containsValue("������")); // ���true
		// ��ȡMap���ϵ�����key��ɵļ��ϣ�ͨ������key��ʵ�ֱ�������key-value��
		for (Object key : map.keySet() )
		{
			// map.get(key)������ȡָ��key��Ӧ��value
			System.out.println(key + "-->" + map.get(key));
		}
		map.remove(4); // ����key��ɾ��key-value�ԡ�
		System.out.println(map); 
		//ɾ������Ԫ��
		map.clear();
		System.out.println(map);
	}
}
