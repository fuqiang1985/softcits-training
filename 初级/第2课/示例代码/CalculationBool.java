
public class CalculationBool {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 2;									            //����int�ͱ���a
		int b = 5; 									            //����int�ͱ���b
		boolean result = ((a > b) && (a != b));			        //�߼���&&����
		boolean result2 = ((a > b) || (a != b));				//�߼���||����
		System.out.println("(2 > 5) && (2 != 5) : "+result);	//����result���
		System.out.println("(2 > 5) || (2 != 5) : "+result2);	//����result2���
		System.out.println("!(5 > 2) = " +!(5 > 2));			//�߼��ǣ�����
		
		// ֱ�Ӷ�false������㣬������true
		System.out.println(!false);
		// 5>3����true��'6'ת��Ϊ����54��'6'>10����true������󷵻�true
		System.out.println(5 > 3 && '6' > 10);
		// 4>=5����false��'c'>'a'����true�����󷵻�true
		System.out.println(4 >= 5 || 'c' > 'a');
		// 4>=5����false��'c'>'a'����true��������ͬ�Ĳ���������򷵻�true
		System.out.println(4 >= 5 ^ 'c' > 'a');
	}
}
