public class Banana extends Fruit
{
	//Banana�����ӵĳ�Ա����
	boolean spot;  //�Ƿ��аߵ�
	String origin; //����
	
	//Banana�����ӵķ���
	void check_quality() {
		System.out.print("�Ҳ���"+origin+"!");
		if (spot == true){
			System.out.println("�������㽶");
		} else {
			System.out.println("���Ǻ��㽶");
		}
	}
}
