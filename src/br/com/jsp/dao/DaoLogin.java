package br.com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.jsp.connection.SingleConnection;

public class DaoLogin {
	private Connection connection;

	public DaoLogin() {
		this.connection = SingleConnection.getConnection();
	}
	
	public boolean validateCredentials(String senha, String login) throws SQLException {
		String sql ="select * from usuario where login ='"+login+"' and senha ='"+senha+"'";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		if(resultSet.next()) {
			return true;//possui usuario no banco
		}else {
			return false;//usuario ñ cadastrado no banco
		}
	}
	

}
