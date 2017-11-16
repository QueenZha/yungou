package bdqn.dao;

import java.io.Serializable;
import java.util.List;

public interface CommenDao<T> {
	/**
	 * 新增
	 * @param t
	 * @return
	 */
	public int add(T t);
	
	
	/**
	 * 删除
	 * @param s
	 * @return
	 */
	public int delete(Serializable s);
	
	
	/**
	 * 修改
	 * @param t
	 * @return
	 */
	public int update(T t);
	
	
	/**
	 * 查询
	 * @return
	 */
	public List<T> findAll(Object... objects);
	
	/**
	 * 查询指定的一个对象
	 * @param object
	 * @return
	 */
	public T findOne(Object...objects);
}
