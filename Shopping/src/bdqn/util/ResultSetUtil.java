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
		//�������ϱ������ж���
		List<T> list=new ArrayList<T>();
		try {
			//��������
			T object=null;
			while(rs.next()){
				//����ʵ����
				object=clazz.newInstance();
				//��ȡ���ݹ����Ķ������������
				Field[] fields = clazz.getDeclaredFields();
				for (Field field : fields) {
					//��������˽������
					field.setAccessible(true);
					field.set(object, rs.getObject(field.getName()));
				}
				//���ж��¸�ֵ֮��,�Ž�����
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
		T object = null; // ��������
		try {
			if (rs.next()) {
				// ����ʵ����
				object = clazz.newInstance();
				// ��ȡ���ݹ����������������
				Field[] fields = clazz.getDeclaredFields();
				for (Field f : fields) {
					f.setAccessible(true); // ��������˽������
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
