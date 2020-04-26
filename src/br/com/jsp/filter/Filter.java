package br.com.jsp.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.jsp.connection.SingleConnection;

//aplicação intercepta todas as urls atraves do webfilter

@WebFilter(filterName = "filter",urlPatterns = {"/*"})
public class Filter implements javax.servlet.Filter{
	
	private static Connection connection ;

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		//sempre chamar FilterChain(arg2) passando o request e o response do servlet
			try {
				arg2.doFilter(arg0, arg1);
				connection.commit();
			} catch (Exception e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		//conecta no banco, o init é sempre invocado
		connection = SingleConnection.getConnection();
		
	}

}
