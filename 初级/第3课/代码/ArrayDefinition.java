import java.util.Arrays;

public class ArrayDefinition {
	public static void main(String[] args){
		//��̬��ʼ��
		int[] intArr;
		intArr = new int[]{1, 2, 3, 4, 5, 6, 9, 22, 10, 89, -1, -99, 0};
		
		String[] objArr = new String[]{"we","are","learning","JAVA", "."};
		//���⻹���Լ�д��
		String[] objArr2 = {"we","are","learning","JAVA", "."};
		
		/*String a = objArr2[2];
		System.out.println(a);*/
		
		
		//��̬��ʼ��
		String[] strArr = new String[5];
		System.out.println("strArr�ĳ���Ϊ: "+strArr.length);
	for(int i =0; i<5; i++)
			strArr[i] = "abc";
		//���ǵ�һ��Ԫ��
		strArr[0]="Hello";
		
		for(int i = 0; i< 5 ;i++)
			System.out.println(strArr[i]);
		
	}
}
