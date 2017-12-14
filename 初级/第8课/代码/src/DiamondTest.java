import java.util.*;
public class DiamondTest
{
	public static void main(String[] args)
	{
		// Java7�Ժ������ķ�������ָ������ʡ��
		List<String> books = new ArrayList<>();
		books.add("����ϵͳ");
		books.add("���ݽṹ");
		// Java�Զ��ƶϳ�HashMap��<>��Ӧ����String , List<String>
		Map<String , List<String>> schoolsInfo = new HashMap<>();
		// Java�Զ��ƶϳ�ArrayList��<>��Ӧ����String
		List<String> schools = new ArrayList<>();
		schools.add("����������ϢѧԺ");
		schools.add("�����ƾ���ѧ");
		schoolsInfo.put("������" , schools);
/*		
		schoolsInfo = HashMap
			Set key <= schoolsInfo.keySet();
			for(String k:key){
				key <= k
				value <= schoolsInfo.get(k)
			}
			
			1. "������" -> "����������ϢѧԺ"
						"�����ƾ���ѧ"
			2. ...			
			3. ...
						*
						*/
			
		//ȡ��Key�ļ���!
		Set<String> city = schoolsInfo.keySet();
/*		Set keySet(){
			return HashSet();
		}*/
		//ʹ�õ���������key����
		Iterator it = city.iterator();
		while(it.hasNext()){
			String tempCity = (String) it.next();
			System.out.print(tempCity + "->");
			//ʹ��foreachѭ������key��Ӧ��value����
			for(String tempStr : schoolsInfo.get(tempCity)){
				System.out.print(tempStr + " ");
			}
		}
	}
}
