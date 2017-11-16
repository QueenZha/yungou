package bdqn.service;

import java.util.List;

import bdqn.entity.EasyBuy_User;

public interface UserService {
	/**
	 * ע��
	 * @param user
	 */
	public void register(EasyBuy_User user);
	
	/**
	 * ��¼
	 * @param UserName
	 * @param password
	 * @return
	 */
	public EasyBuy_User login(String UserName,String password);
	
	/**
	 * ��ѯ����
	 * @param params
	 * @return
	 */
	List<EasyBuy_User> findAllUsers(Object...params);
	
	/**
	 * �����û�
	 * @param user
	 */
	public boolean addUser(EasyBuy_User user);

	
	/**
	 * ɾ��
	 * @param id
	 * @return
	 */
	public boolean deleteUser(String id);

	
	/**
	 * ��ѯָ�����û���Ϣ
	 * @param id
	 * @return
	 */
	public EasyBuy_User findOne(String id);

	/**
	 * �޸�ָ�����û�
	 * @param user
	 * @return
	 */
	public boolean update(EasyBuy_User user);
	
}
