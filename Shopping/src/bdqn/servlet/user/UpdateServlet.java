package bdqn.servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.PortableInterceptor.USER_EXCEPTION;

import bdqn.entity.EasyBuy_User;
import bdqn.service.UserService;
import bdqn.service.impl.UserServiceImpl;
@WebServlet("/updateUser")
public class UpdateServlet extends HttpServlet {
	UserService service=new UserServiceImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse respresp)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		respresp.setCharacterEncoding("utf-8");
		//获取id
		String id = request.getParameter("id");
		String method = request.getParameter("method");
		switch (method) {
		case "findById":
			findById(id,request,respresp);
			break;
		case "update":
			String loginName = request.getParameter("loginName");
			String userName = request.getParameter("userName");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			int sex =Integer.parseInt( request.getParameter("sex"));
			EasyBuy_User user=new EasyBuy_User();
			user.setId(Integer.parseInt(id));
			user.setLoginName(loginName);
			user.setUserName(userName);
			user.setSex(sex);
			user.setEmail(email);
			user.setMobile(mobile);
			Update(user,request,respresp);
			break;
		}
	}
	
	
	/**
	 * 修改指定的用户
	 * @param user
	 * @param request
	 * @param respresp
	 */
	private void Update(EasyBuy_User user, HttpServletRequest request,
			HttpServletResponse respresp) {
		boolean flag=service.update(user);
		if (flag) {
			try {
				respresp.sendRedirect("listServlet");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			try {
				request.getRequestDispatcher("/update.jsp").forward(request, respresp);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 查询指定用户的信息
	 * @param id
	 * @param request
	 * @param respresp
	 */
	private void findById(String id, HttpServletRequest request,
			HttpServletResponse respresp) {
		//调用service层代码

		EasyBuy_User user=service.findOne(id);
		//让数据回显
		request.setAttribute("updateUser", user);
		//转发
		try {
			request.getRequestDispatcher("/update.jsp").forward(request, respresp);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
