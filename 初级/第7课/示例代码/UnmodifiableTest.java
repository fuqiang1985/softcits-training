package serven.one.one;
import java.util.*;
public class UnmodifiableTest
{
	public static void main(String[] args)
	{
		Map scores = new HashMap();
		scores.put("����" , 80);
		scores.put("Java" , 82);
		// ������ͨMap�����Ӧ�Ĳ��ɱ�汾
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		// ������뽫����UnsupportedOperationException�쳣
		unmodifiableMap.put("��ѧ" , 90);
	/*	Iterator it = scores.keySet().iterator();
		while(it.hasNext()){
			String ss = it.next().toString();
			System.out.println(ss + "\t" + scores.get(ss));
		}*/
	}
}

