package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Work2 {

	public static void main(String[] args) {
		//ʹ�÷��ͣ�������ʹ��char�İ�װ����Character
		List<Character> l = new ArrayList<>();
		//ʹ��ѭ��26�εõ�26����д��ĸ
		for(int i = 0; i < 26; i++){
			l.add((char)('A' + i));
		}
		//ʹ�õ���������Set����
		Iterator<Character> it = l.iterator();
		while(it.hasNext()){
			System.out.print(it.next().toString());
		}
	}
}