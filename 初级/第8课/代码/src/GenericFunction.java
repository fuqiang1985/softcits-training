import java.util.ArrayList;
import java.util.List;
class Fruit{
	public String category;
}
class Banana extends Fruit{
	public String name;
}
public class GenericFunction {
	//�����βη��ڷ������η��ͷ���ֵ�м�
	public <T, S extends T> List<S> 
			copyArrayToList(T[] source, List<S> target){
		for(T object : source)
			target.add((S)object);
		return target;
	}
	public static void main(String[] args) {
		//����String�̳�Object,Object����T��String����S
		Object[] source = new Object[3];
		source[0] = "����ƽ��";
		source[1] = "��������";
		source[2] = "��������";
		List<String> target = new ArrayList<String>();
		
		GenericFunction gf = new GenericFunction();
		System.out.println(gf.copyArrayToList(source, target));
		//����, Fruit�൱��T����
		Fruit[] fruit = new Fruit[3];
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit();
		Fruit f3 = new Fruit();
		//����, Banana�൱��S����
		List<Banana> list = new ArrayList<>();
		
		new GenericFunction().copyArrayToList(fruit, list);
		
	}

}
