package lx1;

public class chinesetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chinese newchainese1=new chinese();//�����й��˵Ķ���
		chinese newchainese2=new chinese();
		chinese newchainese3=new chinese();
		chinese.printnationality();
	
		System.out.println("�ܶ����Ĺ�����"+newchainese1.nationality);
		System.out.println("ë�󶫵Ĺ�����"+newchainese2.nationality);
		System.out.println("��Сƽ�Ĺ�����"+newchainese3.nationality);
		newchainese1.nationality="�л����񹲺͹�";
		System.out.println("========================");
		System.out.println("�ܶ����Ĺ�����"+newchainese1.nationality);
		System.out.println("ë�󶫵Ĺ�����"+newchainese2.nationality);
		System.out.println("��Сƽ�Ĺ�����"+newchainese3.nationality);
	}

}
