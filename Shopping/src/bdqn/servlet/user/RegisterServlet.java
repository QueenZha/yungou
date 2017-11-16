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
	 * ×¢²á
	 * @author Administrator
	 *
	 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		EasyBuy_User user=new EasyBuy_User();
		user.setLoginName(request.getParameter("loginName"));
		String password=request.getParameter("password");
		String pwd = MessageDigestDemo.run(password);//¼ÓÃÜ
		user.setPassword(pwd);
		user.setMobile(request.getParameter("phone"));
		user.setEmail(request.getParameter("email"));
		user.setUserName(request.getParameter("userName"));
		user.setType(1);
		UserService service=new UserServiceImpl();
		service.register(user);
		response.sendRedirect("login.jsp");
	}	
}
