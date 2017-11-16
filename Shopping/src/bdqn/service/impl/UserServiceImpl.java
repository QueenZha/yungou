package bdqn.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import bdqn.dao.UserDao;
import bdqn.dao.impl.UserDaoImpl;
import bdqn.entity.EasyBuy_User;
import bdqn.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao dao=new UserDaoImpl();
	private	Logger logger=Logger.getLogger(UserServiceImpl.class);
	/**
	 * 注册新用户
	 */
	@Override
	public void register(EasyBuy_User user) {
		int rowNum=dao.add(user);
		if(rowNum>0){
			logger.debug("用户注册成功!");
		}else {
			logger.debug("用户注册失败!");
		}
	}


	/**
	 * 登录
	 */
	@Override
	public EasyBuy_User login(String UserName, String password) {
		EasyBuy_User user=dao.login(UserName, password);
		if(user==null){
			logger.debug("用户登录失败!");
			return null;
		}else{
			logger.debug("用户登录成功!");
			return user;
		}
	}


	/**
	 * 查询所有用户
	 */
	@Override
	public List<EasyBuy_User> findAllUsers(Object... params) {
		List<EasyBuy_User> list = dao.findAll();
		//加mamcached
		if(list!=null){
			logger.debug("查询所有用户成功!");
		}else {
			logger.debug("查询所有用户失败!");
		}
		return list;
	}


	/**
	 * 新增用户
	 */
	@Override
	public boolean addUser(EasyBuy_User user) {
		int num = dao.add(user);
		if(num>0){
			logger.debug("用户新增成功!");
			return true;
		}else {
			logger.debug("用户新增失败!");
			return false;
		}
	}


	/**
	 * 删除
	 */
	@Override
	public boolean deleteUser(String id) {
		int num = dao.delete(id);
		if(num>0){
			logger.debug("删除用户成功!");
			return true;
		}else {
			logger.debug("删除用户失败!");
			return false;
		}
	}



	/**
	 * 查询指定的用户信息
	 */
	@Override
	public EasyBuy_User findOne(String id) {
		EasyBuy_User user = dao.findOne(id);
		if(user!=null){
			logger.debug("查询指定的用户信息成功!");
			return user;
		}else {
			logger.debug("查询指定的用户信息失败!");
			return null;
		}
	}


	/**
	 * 修改指定的用户
	 */
	@Override
	public boolean update(EasyBuy_User user) {
		int num = dao.update(user);
		if(user!=null){
			logger.debug("修改用户信息成功!");
			return true;
		}else {
			logger.debug("修改用户信息失败!");
			return false;
		}
	}
}