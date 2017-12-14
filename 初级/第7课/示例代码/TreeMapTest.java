package serven.one.one;
import java.util.*;

class R implements Comparable
{
	int count;
	public R(int count)
	{
		this.count = count;
	}
	public String toString()
	{
		return "R[count:" + count + "]";
	}
	// ����count����ֵ���ж���������Ĵ�С��
	public int compareTo(Object obj)
	{
		R r = (R)obj;
		return count > r.count ? 1 :
			count < r.count ? -1 : 0;
	}
}
public class TreeMapTest
{
	public static void main(String[] args)
	{
		TreeMap tm = new TreeMap();
		tm.put(new R(30) , "java�༶");
		tm.put(new R(10) , "linux�༶");
		tm.put(new R(20) , "C++�༶");
		tm.put(new R(0) , "R���԰༶");
		tm.put(new R(50) , "�����ݰ༶");
		tm.put(new R(8) , "web�༶");
		System.out.println(tm);
		// ���ظ�TreeMap�ĵ�һ��Entry����
		System.out.println(tm.firstEntry());
		// ���ظ�TreeMap�����һ��keyֵ
		System.out.println(tm.lastEntry());
		// ���ظ�TreeMap�ı�new R(2)�����Сkeyֵ��
	}
}
