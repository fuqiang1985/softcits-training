
public class practise2 {

	public static void main(String[] args) {
		//��������з���ż���ĸ���
		int count = 0;
		int[] intArr ={78,64,35,92,48,98,87,94,80,83};
		//��������-ѭ�����
		for(int i = 0; i < intArr.length; i++){
			if(intArr[i]%2 == 0)
				count++;
			else
			System.out.println(intArr[i]);
		}
		System.out.println("ż���ĸ���Ϊ: " + count);

	}

}
