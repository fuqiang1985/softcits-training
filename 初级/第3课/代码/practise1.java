
public class practise1 {
	public static void main(String[] args){
		//����һ��10�����ȵ�int����
		int[] intArr = new int[10];
	/*	intArr[0]...intArr[9];*/
		//ʹ��ѭ��Ϊÿ��Ԫ�ظ�ֵ
		for(int i = 0; i < 10 ; i++){
			intArr[i] = i + 1;
		}
		//�����������Ԫ��
		for(int temp:intArr)
			System.out.print(temp+" ");
		
		//�����������Ԫ�ص���һ��д��
		/*for(int i = 0; i< 10; i++)
			System.out.print(intArr[i]+" ");*/
	
	}
}
