
public class MutiDimension {
	public static void main(String[] args) {
		// ����һ����ά����
		int[][] a;
		// ��a����һά������г�ʼ������ʼ��a��һ������Ϊ3������
		// a���������Ԫ��������������
		a = new int[3][];
		// ��a���鵱��һά���飬����a�����ÿ��Ԫ��
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		// ��ʼ��a����ĵ�һ��Ԫ��
		a[0] = new int[2];
		a[1] = new int[10];
		a[2] = new int[6];
		// ����a����ĵ�һ��Ԫ����ָ����ĵڶ���Ԫ��
		a[0][1] = 6;
		// a����ĵ�һ��Ԫ����һ��һά���飬�������һά����
		for (int i = 0; i < a[0].length; i++) {
			System.out.println(a[0][i]);
		}
	}
}
