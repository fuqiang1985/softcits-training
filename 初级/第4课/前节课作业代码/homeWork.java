

/**
 * �����������飬�������Ԫ�صĺͣ�ƽ����������Ԫ�ص����ֵ����Сֵ�� ���������Ľ���� 78,64,35,92,48,98,87,94,80,83
 */
public abstract class homeWork {
	static int sum = 0;
	static int min;
	static int max;
	static int avg;
	static int[] array = { 78, 64, 35, 92, 48, 98, 87, 94, 80, 83 };
	public static void main(String[] args) {
		
		
		min = array[0];
		max = array[0];
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (min > array[i])
				min = array[i];
			if (max < array[i])
				max = array[i];
		}
		avg = sum / array.length;
		System.out.println("max: " + max + " min:" + min + " sum:" + sum + " avg:" + avg);
	}

}
