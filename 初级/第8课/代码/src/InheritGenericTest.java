import java.util.ArrayList;
import java.util.List;

public class InheritGenericTest {

	public void print(List<Object> l){
		for (int i = 0; i < l.size(); i++)
			System.out.println(l.get(i));
	}
	public static void main(String[] args) {
		List<String> listStr = new ArrayList<>();
		listStr.add("������");
		listStr.add("ӣľ");
		InheritGenericTest igt = new InheritGenericTest();
		//����List<Object>������List<String>�ĸ��࣬���潫��������
		igt.print(listStr);
	}
}
