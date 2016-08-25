package servl;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.RegUser;
import beans.StudentInfo;

/**
 * Servlet implementation class Reg
 */
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");

		response.setCharacterEncoding("UTF-8");
		
		String uname = request.getParameter("username");
		String passwd = request.getParameter("password");
		String nme = request.getParameter("names");
		String ids = request.getParameter("id");
		String classs = request.getParameter("classes");
		
		

		StudentInfo user = new StudentInfo();
		user.setUsername(uname);
		user.setPassword(passwd);
		user.setNames(nme);
		int idi =Integer.valueOf(ids);
		user.setId(idi);
		user.setClasses(classs);
		RegUser rsu = new RegUser();
		boolean bool = rsu.reguser(user);


		String forward;
		if (bool) {
			forward = "success1.jsp";

		} else {
			forward = "error1.jsp";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);	
		
	}

}
