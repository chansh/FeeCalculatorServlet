

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FeeCalculatorServlet
 */
@WebServlet("/FeeCalculatorServlet")
public class FeeCalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeeCalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int sum = 90000;
		int n = 11;
		response.setContentType("text/html; charset=Windows-31J");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ˆù‚İ‰ï‚ÌŠ„‚èŠ¨ŒvZƒvƒƒOƒ‰ƒ€</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>‘Œv9–œ‰~A‚P‚Pl‚Ìˆù‚İ‰ï‚Å‚Ì‚Pl“–‚½‚è‚Ì—¿‹à‚ğŒvZ‚µ‚Ü‚·</h1><br>");
		out.println(sum + "‰~‚ğ"+ n +"‚ÅŠ„‚é‚Æ"+ sum/n + "‰~‚Å‚·B");
		out.println("</body>");
		out.println("</html>");
		out.close();	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
