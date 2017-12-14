package six.eight.one;

import java.text.SimpleDateFormat;
import java.util.Date;

// ����һ��Product�ӿ�
interface Product
{
	String getProduceTime();
}
// ��Printer��ʵ��Output��Product�ӿ�
public class Printer implements Output , Product
{
	private String[] printData
		= new String[MAX_CACHE_LINE];
	// ���Լ�¼��ǰ���ӡ����ҵ��
	private int dataNum = 0;
	public void out()
	{
		// ֻҪ������ҵ��������ӡ
		while(dataNum > 0)
		{
			System.out.println("��ӡ����ӡ��" + printData[0]);
			// ����ҵ��������ǰ��һλ������ʣ�µ���ҵ����1
			System.arraycopy(printData , 1
				, printData, 0, --dataNum);
		}
	}
	public void getData(String msg)
	{
		if (dataNum >= MAX_CACHE_LINE)
		{
			System.out.println("����������������ʧ��");
		}
		else
		{
			// �Ѵ�ӡ������ӵ�������ѱ������ݵ�������1��
			printData[dataNum++] = msg;
		}
	}
	public String getProduceTime()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
		return sdf.format(new Date().getTime());
	}
	public static void main(String[] args)
	{
		// ����һ��Printer���󣬵���Outputʹ��
		Output o = new Printer();
		o.getData("С���ӡ��ҵ");
		o.getData("������ӡ��Ƭ");
		o.out();
		o.getData("���ڴ��ӡ����");
		o.getData("�����Ǵ�ӡ����");
		o.out();

		o.getData("������ӡ1");
		o.getData("������ӡ2");
		o.getData("������ӡ3");
		o.getData("������ӡ4");
		o.getData("������ӡ5");
		o.getData("������ӡ6");
		o.out();
		o.getData("������ӡ7");
		o.out();
		
		// ����Output�ӿ��ж����Ĭ�Ϸ���
		o.print("�����" , "��˽�" , "�׹Ǿ�");
		o.test();
		
		// ����һ��Printer���󣬵���Productʹ��
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		// ���нӿ����͵����ñ�������ֱ�Ӹ���Object���͵ı���
		Object obj = p;
	}
}
