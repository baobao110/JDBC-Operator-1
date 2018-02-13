import java.sql.SQLException;
import java.util.ArrayList;

public class Service implements Model{//这里实现接口Mode是想将它模块化
	private static final DAO dao=new DAO();//这里定义一个DAO类型的变量对前面的DAO再次进行封装，Service进行增删改
	public void add(String title,String weather,String context) {
		if(null==title||"".equals(title)) {
			System.out.println("标题为空重新填写");
			return;
		}
		if(title.length()>255) {
			System.out.println("标题过长重新填写");
			return;
		}
		if(null==weather||"".equals(weather)) {
			System.out.println("天气信息为空重新填写");
			return;
		}
		if(weather.length()>255) {
			System.out.println("天气信息过长重新填写");
			return;
		}
		if(null==context||"".equals(context)) {
			System.out.println("填写信息为空重新填写");
			return;
		}
		if(context.length()>800) {
			System.out.println("信息太多");
			return;
		}
		//前面这些判断实质一样都是判断是否为空，是否超过规定长度
		ArrayList<Node> a;
		try {
			a = dao.CheckTitle(title);
			if(a.size()>0) {
				System.out.println("标题重复");
				return;
				//用CheckTitle()方法首先判断数据库中是否已经有该标题如果没有添加，如果返回结果>0则表示数据库中已有不能再添加，这里可以和后面的modify()方法比较
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Node node=new Node();
		node.setTitle(title);
		node.setWeather(weather);
		node.setContext(context);//数据保存为node 再添加
		dao.add(node);
	}
	public void Modify(int id,String title,String weather,String context) {
		try {
			Node node = dao.CheckId(id);
		if(node==null) {
			System.out.println("数据不存在");
			return;
		}
		if(null==title||"".equals(title)) {
			System.out.println("标题为空重新填写");
			return;
		}
		if(title.length()>255) {
			System.out.println("标题过长重新填写");
			return;
		}
		if(null==weather||"".equals(weather)) {
			System.out.println("天气信息为空重新填写");
			return;
		}
		if(weather.length()>255) {
			System.out.println("天气信息过长重新填写");
			return;
		}
		if(null==context||"".equals(context)) {
			System.out.println("填写信息为空重新填写");
			return;
		}
		//前面和add()部分判断没区别
		ArrayList<Node> a= dao.CheckTitle(title);
			if(a.size()>1) {//这里和add()中判断不一样，前面是>0不行，这里是>1不行，这是因为添加时必须保证没有该条数据记录，但是修改是要保证该数据不存在或者只有一条
				System.out.println("标题重复");
				return;
			}
		if(context.length()>800) {
			System.out.println("信息太多");
			return;
		}
		Node nod=new Node();
		nod.setId(id);
		nod.setTitle(title);
		nod.setWeather(weather);
		nod.setContext(context);
		dao.update(nod);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void delete(int id) {//删除部分思路同上面一样
		Node node;
		try {
			node = dao.CheckId(id);
			if(node==null) {
				System.out.println("数据不存在");
			}
			dao.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
