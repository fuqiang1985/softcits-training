package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Work3 {

	public static void main(String[] args) {
		List<Character> listChar = new ArrayList<>();
		Map<Character, Integer> resultMap = new HashMap<>();
		char[] source = {'a','b','a','b','c','a','c','b','a','a','b'};
		//ͨ������������뵽List������
		for(char c:source){
			listChar.add(c);
		}
		//����list����
		for(char temp : listChar){
			//���map��key�в����и��ַ�����value��Ϊ1
			if(!resultMap.containsKey(temp))
				resultMap.put(temp, 1);
			//���map��key�к��и��ַ�����value+1
			else if(resultMap.containsKey(temp))
				resultMap.put(temp, resultMap.get(temp) + 1);		
		}
		
		System.out.println(resultMap);
	}

}
