

public class addLargeInt {
	
	public static void main(String[] args){
		//��������������
		int[] a = new int[100];
		//������������
		int[] b = new int[100];
		//Ϊ�����ʼ��
		for(int i =0;i<100;i++)
			a[i]=(int)(Math.random()*10);
		for(int i =0;i<100;i++)
			b[i]=(int)(Math.random()*10);

		int maxLength = a.length;
		//��ʼ��result����������������λ��Ϊ100+1
		int[] result = new int[maxLength+1];
		//���������±걣���������λ
		for(int i = maxLength -1; i>=0;i--)
		{
			int tempResult = a[i] + b[i];
			if(tempResult>9)
			{
				result[i+1] = tempResult%10;
				if(i==0) result[i]=1;
				else a[i-1]+=1;
			}
			else result[i+1]=tempResult;
		}
	}
}
