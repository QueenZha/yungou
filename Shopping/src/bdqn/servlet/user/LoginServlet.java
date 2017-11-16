package bdqn.servlet.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;


import bdqn.entity.EasyBuy_User;
import bdqn.service.UserService;
import bdqn.service.impl.UserServiceImpl;
import bdqn.util.MessageDigestDemo;
	/**
	 * 登录
	 * @author Administrator
	 *
	 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private Logger logger=Logger.getLogger(LoginServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//解决乱码
		request.setCharacterEncoding("utf-8");
		//得到用户名,密码
		String loginName=request.getParameter("loginName");
		String password=request.getParameter("password");
		//加密
		String pwd = MessageDigestDemo.run(password);
		//调用service层代码
		UserService service=new UserServiceImpl();
		EasyBuy_User user=service.login(loginName, pwd);
		if(user!=null){    	
			request.getSession().setAttribute("loginUser", user);
			request.getRequestDispatcher("/listServlet").forward(request, response);
		}else{
			response.sendRedirect("login.jsp");
		}		
	}
}
