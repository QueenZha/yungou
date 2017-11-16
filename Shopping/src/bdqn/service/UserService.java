package bdqn.service;

import java.util.List;

import bdqn.entity.EasyBuy_User;

public interface UserService {
	/**
	 * 注册
	 * @param user
	 */
	public void register(EasyBuy_User user);
	
	/**
	 * 登录
	 * @param UserName
	 * @param password
	 * @return
	 */
	public EasyBuy_User login(String UserName,String password);
	
	/**
	 * 查询所有
	 * @param params
	 * @return
	 */
	List<EasyBuy_User> findAllUsers(Object...params);
	
	/**
	 * 新增用户
	 * @param user
	 */
	public boolean addUser(EasyBuy_User user);

	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public boolean deleteUser(String id);

	
	/**
	 * 查询指定的用户信息
	 * @param id
	 * @return
	 */
	public EasyBuy_User findOne(String id);

	/**
	 * 修改指定的用户
	 * @param user
	 * @return
	 */
	public boolean update(EasyBuy_User user);
	
}
