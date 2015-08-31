import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddComment
 */
@WebServlet("/GetUser")
public class GetUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String firstName = "Yang";
		String lastName = "Ye";
		String email = "yang.ye@infosys.com";
		User user = new User();
		user.setFirstname(firstName);
		user.setLastname(lastName);
		user.setEmail(email);
		String street = "1752 Anderson Rd";
		String city = "McLean";
		String state = "VA";
		String zipcode = "22222";
		user.setAddress(street, city, state, zipcode);

		request.getSession().setAttribute("user", user);
		request.getSession().setAttribute("address", user.getAddress());
		response.setContentType("text/html");

		getServletContext().getRequestDispatcher("/result.jsp").forward(
				request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
