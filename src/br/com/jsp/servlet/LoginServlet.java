package br.com.jsp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jsp.beans.UserBean;
import br.com.jsp.dao.DaoLogin;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DaoLogin daoLogin = new DaoLogin();
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserBean userBean = new UserBean();
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		try {
			if(daoLogin.validateCredentials(senha, login)) {				
				RequestDispatcher dispatcher = request.getRequestDispatcher("accessAllowed.jsp");
				dispatcher.forward(request, response);
				System.out.println("acesso permitido");
				
			}else {				
				RequestDispatcher dispatcher = request.getRequestDispatcher("accessDenied.jsp");
				dispatcher.forward(request, response);
				System.out.println("acesso negado");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
