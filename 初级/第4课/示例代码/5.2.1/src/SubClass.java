class BaseClass
{
	public int a = 5;
}
public class SubClass extends BaseClass
{
	public int a = 7;
	public void accessOwner()
	{
		System.out.println(a);
	}
	public void accessBase()
	{
		//ͨ��super���޶����ʴӸ���̳еõ���a Field
		System.out.println(super.a);
	}
	public static void main(String[] args)
	{
		SubClass sc = new SubClass();
		//���7
		sc.accessOwner();
		//���5
		sc.accessBase();
	}
}
