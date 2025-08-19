package cms.user;

public abstract class User {
    protected String nome, email, password;
    protected int id;

    public User (String nome, String email, String password, int id){
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    public int getId(){
        return this.id;
    }
    public boolean checkPassword(String p){
        return password.equals(p);
    }

    public abstract String getFuncao();
}
