
class TV {
	String brand;
	String location;
	int size;
	double price;
	public TV(String brand,String location,int size,double price){
		this.brand=brand;
		this.location=location;
		this.size=size;
		this.price=price;
	}
	public void print(){
//		System.out.println("Ʒ��:"+brand);
//		System.out.println("����:"+location);
//		System.out.println("�ߴ�:"+size);
//		System.out.println("�۸�:"+price);
//		if (price>10000){
//			System.out.println("����������");
		if (price>10000){
		System.out.println(brand+"\t"+location+"\t"+size+"\t"+price+"\t\t����������");
		}
		else
		System.out.println(brand+"\t"+location+"\t"+size+"\t"+price);
	}
}


public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t1 = new TV("����","����",60,12800);
		TV t2 = new TV("С��","�й�",70,9999);
		TV t3 = new TV("����","�й�",65,8888);
		TV t4 = new TV("ƻ��","����",60,16800);
		System.out.println("Ʒ��\t����\t�ߴ�\t�۸�");
		t1.print();
		t2.print();
		t3.print();
		t4.print();
	}

}
