import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DATA {
	private static  Connection conn=null;
	private static Statement statement=null;
	/*
	 * 这里建立数据连接
	 */
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/11?characterEncoding=utf8", "root", "123456");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int update(String sql) throws SQLException {
		try {
			statement=conn.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statement.executeUpdate(sql);
	}
	/*
	 * 进行数据库的更新操作
	 */
	public static ResultSet execute(String sql) throws SQLException {
		try {
			statement=conn.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statement.executeQuery(sql);
	}
	/*
	 * 进行数据库的查询操作，返回一个Result类型
	 */
}
/*
 * 这里因为功能以及代码固定，为了方便全部设置为静态方法
 */
