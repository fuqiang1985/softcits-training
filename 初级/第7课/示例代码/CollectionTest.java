package serven.one.one;
import java.util.*;

public class CollectionTest
{
	public static void main(String[] args)
	{
		Collection c = new ArrayList();
		// ���Ԫ��
		c.add("����");
		// ��Ȼ�����ﲻ�ܷŻ������͵�ֵ����Java֧���Զ�װ��
		c.add(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ:" + c.size()); // ���2
		// ɾ��ָ��Ԫ��
		c.remove(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ:" + c.size()); // ���1
		// �ж��Ƿ����ָ���ַ���
		System.out.println("c���ϵ��Ƿ����\"����\"�ַ���:"
			+ c.contains("����")); // ���true
		c.add("���԰ITɳ��");
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		
		// ɾ��c����������Ԫ��
		c.clear();
		System.out.println("c���ϵ�Ԫ�أ�" + c);
	}
}