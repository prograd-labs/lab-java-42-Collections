package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Uncomment the below line
//import model.Student;


@WebServlet(urlPatterns= {"/list"})
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//Uncomment the below line
	//Student student = new Student();
	List<String> studentList1 = new ArrayList<String>();
	List<String> studentList2 = new ArrayList<String>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Uncomment the below lines
		/*
		String studentName = request.getParameter("name");
		String add = request.getParameter("add");
		String remove = request.getParameter("remove");
		String view = request.getParameter("view");
		String ascending = request.getParameter("ascending");
		String descending = request.getParameter("descending");
		String clear = request.getParameter("clear");
		String next = request.getParameter("next");

		student.setStudentName(studentName);

		if(add!=null) {
			studentList1 = student.add(studentName);
			request.setAttribute("studentListadd", studentName);
			request.setAttribute("message", "user added successfully");
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

		if(remove!=null) {
			studentList1 = student.remove(studentName);
			request.setAttribute("studentListremove", studentName);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

		if(view!=null) {
			System.out.println(studentList1);
			request.setAttribute("studentList", studentList1);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

		if(ascending!=null) {
			System.out.println(studentList1);
			request.setAttribute("studentList", student.ascending(studentList1));
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

		if(descending!=null) {
			System.out.println(studentList1);
			request.setAttribute("studentList", student.descending(studentList1));
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

		if(clear!=null) {	
			request.setAttribute("studentListclear", student.clear(studentList1));
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

		if(next!=null) {
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/listadvance.jsp");
			rd.forward(request, response);
		}
		*/
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
