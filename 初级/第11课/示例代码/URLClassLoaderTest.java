import java.sql.*;
import java.util.*;
import java.net.*;

//��classpathδ����mysql����������£�ʹ��classloader�ֶ�װ�ظ�����
public class URLClassLoaderTest {
	private static Connection conn;

	// ����һ����ȡ���ݿ����ӷ���
	public static Connection getConn(String url, String user, String pass) throws Exception {
		if (conn == null) {
			// ����һ��URL����
			URL[] urls = {
					new URL("file:///C:\\Program Files\\MySQL\\Connector.J 5.1\\mysql-connector-java-5.1.38-bin.jar") };
			// ��Ĭ�ϵ�ClassLoader��Ϊ��ClassLoader������URLClassLoader
			URLClassLoader myClassLoader = new URLClassLoader(urls);
			// ����MySQL��JDBC������������Ĭ��ʵ��
			Driver driver = (Driver) myClassLoader.loadClass("com.mysql.jdbc.Driver").newInstance();
			// ����һ������JDBC�������Ե�Properties����
			Properties props = new Properties();
			// ������ҪΪ�ö�����user��password��������
			props.setProperty("user", user);
			props.setProperty("password", pass);
			// ����Driver�����connect������ȡ�����ݿ�����
			conn = driver.connect(url, props);

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select * from manager");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}

		}
		return conn;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(getConn("jdbc:mysql://localhost:3306/test", "root", "123456"));
	}
}
