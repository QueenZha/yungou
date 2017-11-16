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
	 * ɾ���û�
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
		//��ȡid
		String id = request.getParameter("id");
		//����service�����
		UserService service=new UserServiceImpl();
		boolean flag = service.deleteUser(id);
		if(flag){
			//���´����ݿ��в�ѯһ������
			response.sendRedirect("listServlet");
		}
	}
}
