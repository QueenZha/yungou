package bdqn.dao.impl;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;

import org.omg.PortableInterceptor.USER_EXCEPTION;

import bdqn.dao.UserDao;
import bdqn.entity.EasyBuy_User;
import bdqn.util.BaseDao;
import bdqn.util.ResultSetUtil;

public class UserDaoImpl extends BaseDao implements UserDao{
	/**
	 * 注册新用户
	 */
	@Override
	public int add(EasyBuy_User user) {
		String sql="INSERT INTO easybuy_user(loginName,userName,password,sex,identityCode,email,mobile,type)VALUES(?,?,?,?,?,?,?,?)";
		Object[] params={user.getLoginName(),user.getUserName(),user.getPassword(),user.getSex(),user.getIdentityCode(),user.getEmail(),user.getMobile(),user.getType()};
		return executeUpdate(sql,params);
	}

	
	/**
	 * 登录
	 */
	@Override
	public EasyBuy_User login(String userName, String password) {
		String sql = "select * from easybuy_user where loginName=? and password=?";
		Object[] params = { userName, password };
		rs = executeQuery(sql, params);
		EasyBuy_User user = ResultSetUtil.findOne(rs, EasyBuy_User.class);
		return user;
	}
	
	
	/**
	 * 删除
	 */
	@Override
	public int delete(Serializable id) {
		String sql="DELETE FROM easybuy_user WHERE ID=?";
		Object[] params={id};
		return executeUpdate(sql, params);
	}

	
	/**
	 * 修改用户
	 */
	@Override
	public int update(EasyBuy_User user) {
		String sql="UPDATE easybuy_user SET loginName=?,userName=?,email=?,sex=?,mobile=? WHERE id=?";
		Object[] params={user.getLoginName(),user.getUserName(),user.getEmail(),user.getSex(),user.getMobile(),user.getId()};
		return executeUpdate(sql, params);
	}

	
	/**
	 * 查询所有的用户信息
	 */
	@Override
	public List<EasyBuy_User> findAll(Object... objects) {
		String sql="SELECT * FROM  easybuy_user";
		rs= executeQuery(sql);
		List<EasyBuy_User> list=ResultSetUtil.eachResultSet(rs, EasyBuy_User.class);
		closeConnection();
		return list;
	}

	@Override
	public EasyBuy_User findOne(Object... id) {
		String sql="SELECT * FROM  easybuy_user WHERE id=?";
		rs= executeQuery(sql,id);
		return ResultSetUtil.findOne(rs, EasyBuy_User.class);
	}
}
