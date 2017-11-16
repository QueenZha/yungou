package bdqn.servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdqn.service.UserService;
import bdqn.service.impl.UserServiceImpl;
	/**
	 * 删除用户
	 * @author Administrator
	 *
	 */
@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取id
		String id = request.getParameter("id");
		//调用service层代码
		UserService service=new UserServiceImpl();
		boolean flag = service.deleteUser(id);
		if(flag){
			//重新从数据库中查询一遍数据
			response.sendRedirect("listServlet");
		}
	}
}
