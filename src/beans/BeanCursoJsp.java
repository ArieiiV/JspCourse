package beans;

public class BeanCursoJsp {

	private String login;
	private String senha;
	
//	public boolean validarLoginSenha(String senha, String login) {
//		if(this.senha==senha && this.login==login) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
	public boolean validarLoginSenha(String senha, String login) {
		if(login.equals("admin") && senha.equalsIgnoreCase("admin")) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

	

	

}
