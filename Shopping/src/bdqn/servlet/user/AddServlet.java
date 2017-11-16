package bdqn.servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdqn.entity.EasyBuy_User;
import bdqn.service.UserService;
import bdqn.service.impl.UserServiceImpl;
import bdqn.util.MessageDigestDemo;
	/**
	 * 新增
	 * @author Administrator
	 *
	 */
@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//解决乱码问题
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//获取前台用户的输入
		String loginName = request.getParameter("loginName");
		String userName = request.getParameter("userName");
		String identityCode = request.getParameter("identityCode");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		int sex =Integer.parseInt(request.getParameter("sex"));
		
		//创建对象并复制
	EasyBuy_User user=new EasyBuy_User(sex, loginName, userName, password,identityCode, email, mobile);
		//调用service层代码
		UserService userService=new UserServiceImpl();
		String pwd = MessageDigestDemo.run(password);//加密
		user.setPassword(pwd);
		boolean flag=userService.addUser(user);
		if(flag){
			//request.getRequestDispatcher("/listServlet").forward(request, response);
			//重新从数据库中查询一遍数据
			response.sendRedirect("listServlet");
		}else {
			response.sendRedirect("add.jsp");
		}
	}
}
