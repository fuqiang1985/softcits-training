package serven.one.one;

import java.util.*;
public class ListTest
{
	public static void main(String[] args)
	{
		List tea = new ArrayList();
		// ��tea�������������Ԫ��
		tea.add(new String("�˼����"));
		tea.add(new String("Ѱ�����"));
		tea.add(new String("����ԭ����ͥ��"));
		tea.add(new String("�������в����"));
		System.out.println(tea);
		// �����ַ�����������ڵڶ���λ��
		tea.add(1 , new String("�۹��԰"));
		for (int i = 0 ; i < tea.size() ; i++ )
		{
			System.out.println(tea.get(i));
		}
		// ɾ��������Ԫ��
		tea.remove(1);
		System.out.println(tea);
		// �ж�ָ��Ԫ����List������λ��
		System.out.println(tea.indexOf(new String("����ԭ����ͥ��"))); //��
		//���ڶ���Ԫ���滻���µ��ַ�������
		tea.set(1, new String("ǧ������"));
		System.out.println(tea);
	}
}