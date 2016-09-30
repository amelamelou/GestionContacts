package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Service.IContactService;
import Service.Impl.ImplContactService;
import entites.Contact;

/**
 * Servlet implementation class addContactServlet
 */
public class addContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addContactServlet() {
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
		
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		String email=request.getParameter("email");
		
		if(firstName !="" && lastName !="" && email !=""){
		IContactService contactService=new ImplContactService();
		Contact isContactCreated=contactService.createContact(firstName, lastName, email);
		if (isContactCreated != null){
		response.setContentType("text/html");
		message="Le Contact :"+firstName + " " +lastName +", a bien été enregistré";
		displayMessage(message, response);		
		}
		else{
		message="Un problème est survenu lors de la création du contact";
		request.setAttribute("Message", message);
		RequestDispatcher rd = request.getRequestDispatcher("Error.jsp" );
		rd.forward(request, response);
		}
		}else{
		message="Les champs ne doivent pas être vides!!";
		displayMessage(message, response);
		}

}

	private void displayMessage(String message, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		System.out.println(message);
		
	}
}
