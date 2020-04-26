package br.com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.jsp.beans.UserBean;
import br.com.jsp.connection.SingleConnection;

public class DaoUsuario {
	private Connection connection;

	public DaoUsuario() {
		this.connection = SingleConnection.getConnection();
	}
	
	
	public void salvar(UserBean usuario) {
		try {
			String sql = "insert into usuario(login,senha) values (?,?)";
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setString(1, usuario.getLogin());
			insert.setString(2, usuario.getSenha());
			insert.execute();
			connection.commit();
			
		} catch (Exception e) {
				e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	
	public List<UserBean> listar() throws SQLException{
		
		ArrayList<UserBean> lista = new ArrayList<UserBean>();
		
		String sql ="select * from usuario";
		
		PreparedStatement statemente = connection.prepareStatement(sql);
		ResultSet resultSet = statemente.executeQuery();
		while (resultSet.next()) {
			
			UserBean userBean = new UserBean();
			userBean.setLogin(resultSet.getString("login"));
			userBean.setSenha(resultSet.getString("senha"));
			
			lista.add(userBean);	
			
		}
		
		return lista;
	}
	
	public void delete(String login) {
		try {
			String sql = "delete from usuario where login ='"+login+"'";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		
	}

}
