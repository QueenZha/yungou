package bdqn.util;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultSetUtil {
	
	/**
	 * 
	 * @param rs
	 * @param clazz
	 * @return
	 */
	public static <T> List<T> eachResultSet(ResultSet rs,Class<T> clazz){
		//创建集合保存所有对象
		List<T> list=new ArrayList<T>();
		try {
			//创建对象
			T object=null;
			while(rs.next()){
				//对象实例化
				object=clazz.newInstance();
				//获取传递过来的对象的所有属性
				Field[] fields = clazz.getDeclaredFields();
				for (Field field : fields) {
					//开启访问私有属性
					field.setAccessible(true);
					field.set(object, rs.getObject(field.getName()));
				}
				//所有对下赋值之后,放进集合
				list.add(object);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 
	 * @param rs
	 * @param clazz
	 * @return
	 */
	public static <T> T findOne(ResultSet rs, Class<T> clazz) {
		T object = null; // 创建对象
		try {
			if (rs.next()) {
				// 对象实例化
				object = clazz.newInstance();
				// 获取传递过来对象的所有属性
				Field[] fields = clazz.getDeclaredFields();
				for (Field f : fields) {
					f.setAccessible(true); // 开启访问私有属性
					f.set(object, rs.getObject(f.getName()));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return object;
	}
}
