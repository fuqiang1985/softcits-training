//ͼ����
abstract class CShape {	
	protected int width;
	protected int height;
	
	public void show() {
		System.out.println("width=" + width);
		System.out.println("height=" + height);
		System.out.println("area=" + area());
	}
	public abstract int area();	//����ͼ�����
}

//��������
class CTriangle extends CShape{
	//�����������ֵĳ������
}

public class hw_6_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTriangle tri = new CTriangle(5,7);
		tri.show();
	}

}
