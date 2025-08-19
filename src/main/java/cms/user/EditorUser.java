package cms.user;

public class EditorUser extends User {

	public EditorUser(int id, String nome, String email, String password) {
		super(nome, email, password, id);
	}

	@Override
	public String getFuncao(){
		return "Editor";
	}

	public void editContent(int contentId, String body) {
		/* exclusivo do editor */ }
}
