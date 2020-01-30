package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Uncomment the below line
//import model.StudentBasicDetail;


@WebServlet(urlPatterns= {"/map"})
public class MapServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	//Uncomment the below line
	//StudentBasicDetail studentbasics = new StudentBasicDetail();

	Map<String,String> hash = new HashMap<String,String>();
	Map<String,String> linkedhash = new LinkedHashMap<String,String>();
	Map<String,String> tree = new TreeMap<String,String>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Uncomment the below lines
		/*
		PrintWriter out = response.getWriter();
		System.out.println("Welcome");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String add = request.getParameter("add");
		String clear = request.getParameter("clear");
		String options = request.getParameter("options");
		String view = request.getParameter("view");
		String next = request.getParameter("end");

		studentbasics.setId(id);
		studentbasics.setName(name);

		if(add!=null) {

			hash = studentbasics.add(id,name);
			linkedhash = studentbasics.add(id,name);
			tree = studentbasics.add(id,name);
			System.out.println(hash);
			request.setAttribute("studentListadd", name);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/map.jsp");
			rd.forward(request, response);
		}


		if(clear!=null) {
			hash = studentbasics.clear(id,name);
			linkedhash = studentbasics.clear(id,name);
			tree = studentbasics.clear(id,name);
			System.out.println(hash);
			request.setAttribute("studentListclear", hash);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/map.jsp");
			rd.forward(request, response);
		}

		if(view!=null) {
			if(options.equals("HashMap")) {
				System.out.println(hash);
				request.setAttribute("studentList", studentbasics.HashMap(hash));
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/map.jsp");
				rd.forward(request, response);
			}
		}

		if(view!=null) {
			if(options.equals("LinkedHashMap")) {
				System.out.println(linkedhash);
				request.setAttribute("studentList", studentbasics.LinkedHashMap(linkedhash));
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/map.jsp");
				rd.forward(request, response);
			}
		}

		if(view!=null) {
			if(options.equals("TreeMap")) {
				System.out.println(tree);
				request.setAttribute("studentList", studentbasics.TreeMap(tree));
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/map.jsp");
				rd.forward(request, response);
			}
		}

		if(next!=null) {
			response.setContentType("text/html");  
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Well Done!');");  
			out.println("</script>");
		}
		*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

