package bdqn.dao;

import bdqn.entity.EasyBuy_User;

public interface UserDao extends CommenDao<EasyBuy_User>{
	/**
	 * µÇÂ¼
	 * @param userName
	 * @param password
	 * @return
	 */
	EasyBuy_User login(String userName,String password);
}
