public class ModTest
{
	public static void main(String[] args)
	{
		int c = 23, d = 7;
		System.out.println("c/d = "+ c/d);
		System.out.println("c%d = "+ c%d);
		
		double a = 5.2, b = 3.1;
		double mod = a % b;
		System.out.println(mod); // mod��ֵΪ2.1
		// ������뽫�����쳣��java.lang.ArithmeticException: / by zero
		System.out.println("-5��0����Ľ����:" + -5 % 0);
	}
}
