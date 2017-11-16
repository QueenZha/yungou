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
	 * ����
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
		//�����������
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//��ȡǰ̨�û�������
		String loginName = request.getParameter("loginName");
		String userName = request.getParameter("userName");
		String identityCode = request.getParameter("identityCode");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		int sex =Integer.parseInt(request.getParameter("sex"));
		
		//�������󲢸���
	EasyBuy_User user=new EasyBuy_User(sex, loginName, userName, password,identityCode, email, mobile);
		//����service�����
		UserService userService=new UserServiceImpl();
		String pwd = MessageDigestDemo.run(password);//����
		user.setPassword(pwd);
		boolean flag=userService.addUser(user);
		if(flag){
			//request.getRequestDispatcher("/listServlet").forward(request, response);
			//���´����ݿ��в�ѯһ������
			response.sendRedirect("listServlet");
		}else {
			response.sendRedirect("add.jsp");
		}
	}
}
