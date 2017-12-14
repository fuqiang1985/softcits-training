package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test5 {

	private static List<File> filesList = new ArrayList<File>();

	public static void getAllFiles(File f) {
		File[] fileArray = f.listFiles();
		for (File tempFile : fileArray) {
			if (tempFile.isDirectory()) {
				filesList.add(tempFile);
				getAllFiles(tempFile);
			} else {
				filesList.add(tempFile);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ҫ���Ƶ��ļ��У�");
		String fromDir = scanner.next();// ��������
		System.out.println("Ҫ���Ƶ�����ȥ��");
		String toDir = scanner.next();// ��������

		// ������ĵ�ַת��ΪFile����
		File fromFile = new File(fromDir);
		File toFile = new File(toDir);

		// �½��߳�
		new Thread() {
			// ������ʵ�ʲ���
			public void run() {
				// �ж����Ҫ���Ƶ����ļ���ֱ�Ӹ��ƾͿ�����
				if (fromFile.isFile()) {
					System.out.println("���Ƶ����ļ�");
					copy(fromFile, toFile);
				} else {
					// Ҫ�����ļ���
					// Ҫ��ֹһ���޷����еĸ��ƣ�����˵��Ҫ�Ѹ��Ƶ��ļ����Ƶ��Լ������ļ�������
					// �ٸ����ӣ���D:/java/jsp�ļ��и��Ƶ�D:/java/jsp/js�ļ������棬
					// ��ᵼ�����ļ��������ӵ�ͬʱ�������ļ�ҲҪ�������ӣ���һ����ѭ��
					// �������������û�£��൱��ֻ�Ǽ򵥵ĸ��Ƕ���
					// ����ʵ�־��ǿ���Ŀ�ĵص�ַ�������Ƶ��ļ��е�ַ���Ͳ��������
					if (toDir.replace("/", "\\").toLowerCase().startsWith(fromDir.replace("/", "\\").toLowerCase())) {
						return;
					}

					// �����ļ��������ļ����ļ��У�����

					// �Ȼ�ȡ���е��ļ��������ļ����ļ��У�
					getAllFiles(fromFile);
					List<File> list = filesList;

					// ����һ���̳߳أ��ӿ츴�Ƶ��ٶ�
					ExecutorService threadPool = Executors.newFixedThreadPool(20);

					// ��Ҫ��ÿһ���ļ���·�����д���
					for (File file : list) {
						// �����ļ���
						String name = file.getAbsolutePath();
						// ��ԭ�����ļ�·�������µ��ļ�·��
						String toName = name.replace(fromFile.getParent(), toDir + "/");
						System.out.println(name + "�����" + toName);
						// ������ļ��У�ֱ�Ӵ���
						if (file.isDirectory()) {
							new File(toName).mkdirs();
						} else {
							// ������ļ�,���߳����渴��
							threadPool.execute(new Runnable() {
								@Override
								public void run() {
									File copyFile = new File(toName);
									// ��Ҫ�и��ļ���
									copyFile.getParentFile().mkdirs();

									// ��ʼ�����ļ�
									copy(file, copyFile);
								}
							});
						}
					}

				}
				scanner.close();
			};

		}.start();// ��ʼ�߳�
	}

	// �����ļ��Ĳ���
	public static void copy(File fromFile, File toFile) {
		// ����һ��������
		FileInputStream fis = null;
		// ����һ�������
		FileOutputStream fos = null;

		try {
			// �Ѹ��Ƶ�ַ��File����װ��ֵ������������
			fis = new FileInputStream(fromFile);
			// ��Ŀ�ĵص�File����װ���Ƹ�������Ķ���
			fos = new FileOutputStream(toFile);
			// ����һ��������
			byte[] buf = new byte[1024];
			// ÿ�ζ�ȡ/д����ֽڳ���
			int len = 0;
			// �߶���д
			while ((len = fis.read(buf)) != -1) {// �ж��Ƿ��ܶ�������
				// ������ŵ����������
				fos.write(buf, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// �ر��������������
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
