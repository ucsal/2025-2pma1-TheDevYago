package cms.user;

public class GuestUser extends User {

	public GuestUser(int id, String nome, String email, String password) {
		super(nome, email, password, id);
	}

	@Override
	public String getFuncao(){
		return "Visitante";
	}

	public void viewContent(int contentId) {
		/* exclusivo do visitante */ }
}
