import java.util.ArrayList;
import java.util.List;

public class GenericUpperBound {
	//�趨����ͨ��������ޣ�
	public void print(List<? extends Apple> apples){
		for(Apple a : apples)
			System.out.println(a.getInfo());
	}
	public static void main(String[] args) {
		List<Apple> listA = new ArrayList<>();
		//����Apple���������
		A1 a1 = new A1("��ƻ��");
		A1 a2 = new A1("��ƻ��");
		A1 a3 = new A1("��ƻ��");
		
		listA.add(a1);
		listA.add(a2);
		listA.add(a3);
		
		GenericUpperBound gub = new GenericUpperBound();
		//����A1��Apple�����࣬���¿�����������
		gub.print(listA);
	}

}
