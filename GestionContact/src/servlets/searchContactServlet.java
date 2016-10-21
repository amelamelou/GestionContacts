package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.IContactService;
import Service.Impl.ImplContactService;

/**
 * Servlet implementation class addContactServlet
 */
public class searchContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message=null;
		
		long id=Long.valueOf(request.getParameter("id"));
		
		
			IContactService contactService=new ImplContactService();
			boolean isContactCreated=contactService.deleteContact(id);
			if (isContactCreated){
				response.setContentType("text/html");
				message="Le Contact  a bien été supprimé";
				displayMessage(message, response);		
			}
			else{
				message="Un problème est survenu lors de la suppression du contact";
				request.setAttribute("Message", message);
				RequestDispatcher rd = request.getRequestDispatcher("Error.jsp" );
				rd.forward(request, response);
			}
	

}

	private void displayMessage(String message, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		System.out.println(message);
		
	}
	
}
