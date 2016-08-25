package servl;

import java.io.IOException;
import org.apache.log4j.Logger; 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CheckUser;
import beans.StudentInfo;

public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 7381169134016556647L;
	
	private static Logger logger = Logger.getLogger(LoginServlet.class); 

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ����HTTP��Ӧ���ĵ�����,�˴�ΪText/html,�������Ϊapplication\msword������Ϊword�ĵ���ʽ
		response.setContentType("text/html");
		// ������Ӧ�����õı��뷽ʽ
		response.setCharacterEncoding("UTF-8");
		// ȡ�ò���username��ֵ
		String uname = request.getParameter("username");
		String passwd = request.getParameter("password");

		StudentInfo user = new StudentInfo();
		user.setUsername(uname);
		user.setPassword(passwd);
		CheckUser cku = new CheckUser();
		boolean bool = cku.checkUser(user);
		logger.debug(bool);
		
		 // ��¼debug�������Ϣ 
		 logger.debug("This is debug message."); 
		 // ��¼info�������Ϣ 
		 logger.info("This is info message."); 
		 // ��¼error�������Ϣ 
		 logger.error("This is error message."); 


		String forward;
		if (bool) {
			forward = "success.jsp";

		} else {
			forward = "error.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);
		

	}
	

}
