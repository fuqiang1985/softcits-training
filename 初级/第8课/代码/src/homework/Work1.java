package homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Work1 {

	public static void main(String[] args) {
		//ʹ�÷��ͣ�������ʹ��char�İ�װ����Character
		Set<Character> s = new HashSet<>();
		//ʹ��ѭ��26�εõ�26��Сд��ĸ
		for(int i = 0; i < 26; i++){
			s.add((char)('a' + i));
		}
		//ʹ�õ���������Set����
		Iterator<Character> it = s.iterator();
		while(it.hasNext()){
			System.out.print(it.next().toString());
		}
	}

}
