import java.util.HashSet;
import java.util.Set;

public class GenericTest<T> {
	//�����ڷ��͵������β�ǰ��static
	//static T info;
	//ͬ���͵������ββ����پ�̬������ʹ��
	//public static void bar(T t){}
	
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		System.out.println(s instanceof HashSet);
		//�������ڶ���ķ����� ���潫���ִ���
		//System.out.println(s instanceof HashSet<String>);
		
		
	}
}
