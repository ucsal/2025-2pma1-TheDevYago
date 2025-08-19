package cms.user;

public class AdminUser extends User {

	public AdminUser(int id, String nome, String email, String password) {
		super(nome, email, password, id);
	}

	@Override
	public String getFuncao(){
		return "Admin";
	}

	public void deleteContent(int contentId) {
		/* exclusivo do admin */ }
}
