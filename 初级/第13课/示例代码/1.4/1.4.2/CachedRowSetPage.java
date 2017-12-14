import java.util.*;
import java.io.*;
import java.sql.*;
import javax.sql.*;
import javax.sql.rowset.*;

public class CachedRowSetPage {

	public static void main(String[] args) throws Exception {
		int pageSize = 3;
		int page = 2;
		// load mysql driver
		Class.forName("com.mysql.jdbc.Driver");
		try (
				// setup database connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from manager");) {
			// ʹ��RowSetProvider����RowSetFactory
			RowSetFactory factory = RowSetProvider.newFactory();
			// ����Ĭ�ϵ�CachedRowSetʵ��
			CachedRowSet cachedRs = factory.createCachedRowSet();
			// ����ÿҳ��ʾpageSize����¼
			cachedRs.setPageSize(pageSize);
			// ʹ��CachedRowSetװ��ResultSet�����ôӵڼ�����¼��ʼ
			cachedRs.populate(rs, (page - 1) * pageSize + 1);

			while (cachedRs.next()) {
				System.out.println(cachedRs.getInt(1) + " " + cachedRs.getString(2) + " " + cachedRs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}