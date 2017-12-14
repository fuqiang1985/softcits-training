import java.io.*;
public class SerializeObject
{
	public static void main(String[] args)
	{
		try(
			// ����һ��ObjectOutputStream�����
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("Staff.txt")))
		{
			Staff demo = new Staff("Serene", 26);
			// ��demo����д�������
			oos.writeObject(demo);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}

