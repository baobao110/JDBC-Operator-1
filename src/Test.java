
public class Test {
	public static void main(String[] args) {
		Model a=new Service();
		/*a.add("eeee", "晴天", "ffff");
		a.add("232", "晴天","ererer");*/
//		a.delete(6);
		a.Modify(8, "323", "阴天", "eeeeeeee");
	}
}
/*这个项目是通过JDBC实现对数据的增删改,这里将整体分为三层，将整体模块化,这样当需求发生改变时易于管理,同时当代码编译错误时方便查找
 * 这里巧妙的单独定义一个类，用于存储数据库中的信息，同时当实现多条信息存储时利用集合的思想，将它们存储起来，方便管理。以后的编程过程中要用分层的思想
 * 将每一层单独进行测试，这样可以减少BUG
*/