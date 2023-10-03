package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Salvar")
public class SalvarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		
		Cookie cookie = new Cookie("nomeusu", nome);
		cookie.setMaxAge(30 * 60); // 30 minutos
		response.addCookie(cookie);
		
		
	}

}
