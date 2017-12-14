package homework;

import java.io.File;
import java.io.IOException;


public class Test1 {
	/**
	 * 1. �ڵ���D���´���һ���ļ�ΪHelloWorld.txt�ļ���
	 * �ж������ļ�����Ŀ¼���ٴ���һ��Ŀ¼IOTest,
	 * ֮��HelloWorld.txt�ƶ���IOTestĿ¼��ȥ��
	 * ֮�����IOTest���Ŀ¼�µ��ļ�
	 * 
	 * ���������
	 * 1���ļ�����ʹ��File��createNewFile()����
	 * 2���ж����ļ���isFile(),�ж���Ŀ¼��isDirectory
	 * 3������Ŀ¼�ã�mkdirs()����
	 * 4���ƶ��ļ��ã�renameTo
	 * 5������Ŀ¼�ã�list����������ô���ļ������飬foreach�����ķ������ļ���ӡ����
	 * */
	public static void main(String[] args) {
		 //�ڵ���D���´���һ���ļ�ΪHelloWorld.txt�ļ�
		File file=new File("D:","HelloWorld.txt");
		
		//�����ļ�������һ������ֵ
		boolean isCreate;
		try {
			isCreate = file.createNewFile();
			if (isCreate) {
				System.out.println("�����ļ��ɹ���");
			}else {
				System.out.println("�����ļ�ʧ�ܣ��ļ��Ѿ�����");
			}
		} catch (IOException e) {
			System.out.println("�����ļ�ʧ�ܣ�");
		}
		
		// �ж������ļ�����Ŀ¼��
		if (file.isFile()) {
			System.out.println("����һ���ļ�");
		} else {
			System.out.println("����һ��Ŀ¼");
		}
		
		//�ٴ���һ��Ŀ¼IOTest
		File file2=new File("D:/IOTest/");
		file2.mkdirs();
		
		//HelloWorld.txt�ƶ���IOTest
		if (file.renameTo(new File(file2.getAbsolutePath()+"\\"+file.getName()))) {
			System.out.println("�ļ��ƶ��ɹ���");
		} else {
			System.out.println("�ļ��ƶ�ʧ��");
		}
		
		//����IOTestĿ¼�µ��ļ�
		String[] arr=new File(file2.getAbsolutePath()).list();
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
