import java.sql.*;

public class TransactionTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		String[] sqls = new String[] { "insert into employee values(null,'mgr1',3)",
				"insert into employee values(null,'mgr2',3)" };
		// ��������
		Class.forName("com.mysql.jdbc.Driver");
		try {
			// ��������
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
			// �ر��Զ��ύ����ʼ����
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			//ִ�в���
			for(String sql : sqls){
				stmt.executeUpdate(sql);
			}
			//ģ�����λ�ô���
			throw new Exception("Unexpected Error!");
			
			//�ύ����
			/*conn.commit();*/
			
/*			ResultSet rs = stmt.executeQuery("select * from employee");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}*/
			
		} catch (Exception e) {
			System.out.println("System encounter an error. Operation will be rolled back!");
			conn.rollback();
			e.printStackTrace();
		}
	}
}
