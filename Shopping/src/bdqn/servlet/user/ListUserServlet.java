package bdqn.servlet.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdqn.entity.EasyBuy_User;
import bdqn.service.UserService;
import bdqn.service.impl.UserServiceImpl;

/**
 * 查询所有用户信息
 * @author Administrator
 *
 */
@WebServlet("/listServlet")
public class ListUserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
					//调用service层代码
					UserService service=new UserServiceImpl();
					// 查询所有用户信息
					List<EasyBuy_User> userList = service.findAllUsers();
					//放进作用域中
					request.setAttribute("userList", userList);
					//request.getSession().setAttribute("userList", userList);
					
					//转发
					request.getRequestDispatcher("main.jsp").forward(request, response);
					//response.sendRedirect("main.jsp");
	}
	
}
