
class Chinese{
	static String nation;
	int age;
	boolean sex;
	public Chinese(String nation){
		this.nation = nation;
	}
}

public class ChineseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chinese mzd = new Chinese("�л����");
		Chinese zel = new Chinese("�л����");
		Chinese dxp = new Chinese("�л����");
		System.out.println("ë�󶫣�"+mzd.nation);
		System.out.println("�ܶ�����"+zel.nation);
		System.out.println("��Сƽ��"+dxp.nation);
		Chinese.nation = "�л����񹲺͹�";
		System.out.println("ë�󶫣�"+mzd.nation);
		System.out.println("�ܶ�����"+zel.nation);
		System.out.println("��Сƽ��"+dxp.nation);
	}

}
