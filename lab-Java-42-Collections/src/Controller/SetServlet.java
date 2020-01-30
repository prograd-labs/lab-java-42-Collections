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
//import model.StudentBranch;

@WebServlet(urlPatterns= {"/set"})

public class SetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//Uncomment the below line
	//StudentBranch student = new StudentBranch();

	List<String> studentList1 = new ArrayList<String>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Uncomment the below lines
		/*
		String branch = request.getParameter("name");
		String add = request.getParameter("add");
		String remove = request.getParameter("remove");
		String clear = request.getParameter("clear");
		String options = request.getParameter("options");
		String view = request.getParameter("view");
		String next = request.getParameter("next");

		student.setBranch(branch);

		if(add!=null) {

			studentList1 = student.add(branch);
			System.out.println(studentList1);
			request.setAttribute("studentListadd", branch);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
			rd.forward(request, response);
		}

		if(remove!=null) {
			studentList1 = student.remove(branch);
			System.out.println(studentList1);
			request.setAttribute("studentListremove", branch);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
			rd.forward(request, response);
		}

		if(clear!=null) {
			studentList1 = student.remove(branch);
			System.out.println(studentList1);
			request.setAttribute("studentListclear", branch);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
			rd.forward(request, response);
		}

		if(view!=null) {
			if(options.equals("HashSet")) {
				System.out.println(studentList1);
				request.setAttribute("studentList", student.HashSet(studentList1));
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
				rd.forward(request, response);
			}
		}

		if(view!=null) {
			if(options.equals("LinkedHashSet")) {
				System.out.println(studentList1);
				request.setAttribute("studentList", student.LinkedHashSet(studentList1));
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
				rd.forward(request, response);
			}
		}

		if(view!=null) {
			if(options.equals("TreeSet")) {
				System.out.println(studentList1);
				request.setAttribute("studentList", student.TreeSet(studentList1));
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
				rd.forward(request, response);
			}
		}

		if(next!=null) {
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/map.jsp");
			rd.forward(request, response);
		}
		*/
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}



}
