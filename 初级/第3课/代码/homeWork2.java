
public class homeWork2 {
	public static void main(String[] args){
		//���Ӷ�- һ�������м���Ĵ���
		/*for(int i = 1; i <= 100; i++)
		{
			if(i % 7 == 0) System.out.println(i);
		}*/
		//�Ż�����㷨
		int count;
		count = 100/7;
		for(int i = 1; i <= count ; i++){
			if(i != 1)System.out.print(",");
			System.out.print(i*7);
		
		}
	}
}
