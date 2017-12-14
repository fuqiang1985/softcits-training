package org.demo.cn;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.urlclassloader.test.ActionInterface;

public class URLClassLoaderActionTest {
		public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
			// ����һ��URL����
						URL[] urls = {
								new URL("file:///D:\\actiontest.jar") };
						// ��Ĭ�ϵ�ClassLoader��Ϊ��ClassLoader������URLClassLoader
						//�����Զ�����������
						URLClassLoader myClassLoader = new URLClassLoader(urls);
						//����ActionTest�����
						Class myClass = myClassLoader.loadClass("org.urlclassloader.test.ActionTest");
						//ͨ��ActionTest������������Լ���ʵ������
						ActionInterface ai = (ActionInterface) myClass.newInstance();
						//ͨ��ʵ���������ʵ������sayHello
						System.out.println(ai.sayHello());
		}
}
