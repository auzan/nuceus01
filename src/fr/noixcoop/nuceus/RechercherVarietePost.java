package fr.noixcoop.nuceus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RechercherVarietePost
 */
@WebServlet("/RechercherVarietePost")
public class RechercherVarietePost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RechercherVarietePost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("variete") == ""){
			response.setContentType("text/html");
			PrintWriter sortie = response.getWriter();
			
			sortie.println("<html><body><h1>Variete de noix inconnue</h1></body></html>");
			}
			else{
				response.setContentType("text/html");
				PrintWriter sortie = response.getWriter();
				sortie.println("<html><body><table style='border:1px solid black;'><tr><td>Variete</td></tr><tr><td> " + request.getParameter("variete")  +"</td></tr></table></h1></body></html>");

			}
	}

}
