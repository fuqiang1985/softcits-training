
import java.io.*;

public class DeserializeOject
{
	public static void main(String[] args)
	{
		try(
			// ����һ��ObjectInputStream������
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("Staff.txt")))
		{
			// ���������ж�ȡһ��Java���󣬲�����ǿ������ת��ΪStaff��
			Staff p = (Staff)ois.readObject();
			System.out.println("Name is: " + p.getName()
				+ "\nAge is��" + p.getAge());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
