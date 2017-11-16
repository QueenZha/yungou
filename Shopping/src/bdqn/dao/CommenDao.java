package bdqn.dao;

import java.io.Serializable;
import java.util.List;

public interface CommenDao<T> {
	/**
	 * ����
	 * @param t
	 * @return
	 */
	public int add(T t);
	
	
	/**
	 * ɾ��
	 * @param s
	 * @return
	 */
	public int delete(Serializable s);
	
	
	/**
	 * �޸�
	 * @param t
	 * @return
	 */
	public int update(T t);
	
	
	/**
	 * ��ѯ
	 * @return
	 */
	public List<T> findAll(Object... objects);
	
	/**
	 * ��ѯָ����һ������
	 * @param object
	 * @return
	 */
	public T findOne(Object...objects);
}
