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
	 * ע�����û�
	 */
	@Override
	public void register(EasyBuy_User user) {
		int rowNum=dao.add(user);
		if(rowNum>0){
			logger.debug("�û�ע��ɹ�!");
		}else {
			logger.debug("�û�ע��ʧ��!");
		}
	}


	/**
	 * ��¼
	 */
	@Override
	public EasyBuy_User login(String UserName, String password) {
		EasyBuy_User user=dao.login(UserName, password);
		if(user==null){
			logger.debug("�û���¼ʧ��!");
			return null;
		}else{
			logger.debug("�û���¼�ɹ�!");
			return user;
		}
	}


	/**
	 * ��ѯ�����û�
	 */
	@Override
	public List<EasyBuy_User> findAllUsers(Object... params) {
		List<EasyBuy_User> list = dao.findAll();
		//��mamcached
		if(list!=null){
			logger.debug("��ѯ�����û��ɹ�!");
		}else {
			logger.debug("��ѯ�����û�ʧ��!");
		}
		return list;
	}


	/**
	 * �����û�
	 */
	@Override
	public boolean addUser(EasyBuy_User user) {
		int num = dao.add(user);
		if(num>0){
			logger.debug("�û������ɹ�!");
			return true;
		}else {
			logger.debug("�û�����ʧ��!");
			return false;
		}
	}


	/**
	 * ɾ��
	 */
	@Override
	public boolean deleteUser(String id) {
		int num = dao.delete(id);
		if(num>0){
			logger.debug("ɾ���û��ɹ�!");
			return true;
		}else {
			logger.debug("ɾ���û�ʧ��!");
			return false;
		}
	}



	/**
	 * ��ѯָ�����û���Ϣ
	 */
	@Override
	public EasyBuy_User findOne(String id) {
		EasyBuy_User user = dao.findOne(id);
		if(user!=null){
			logger.debug("��ѯָ�����û���Ϣ�ɹ�!");
			return user;
		}else {
			logger.debug("��ѯָ�����û���Ϣʧ��!");
			return null;
		}
	}


	/**
	 * �޸�ָ�����û�
	 */
	@Override
	public boolean update(EasyBuy_User user) {
		int num = dao.update(user);
		if(user!=null){
			logger.debug("�޸��û���Ϣ�ɹ�!");
			return true;
		}else {
			logger.debug("�޸��û���Ϣʧ��!");
			return false;
		}
	}
}