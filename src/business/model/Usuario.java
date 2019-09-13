package business.model;

public abstract class Usuario {
    //Atributos dos atendentes
    private int id;
    private String nome, CPF, RG;
    private String login, senha;
    protected float salario;
    private int level;

    public Usuario(int id, String nome, String CPF, String RG, String login, String senha, float salario, int level) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.login = login;
        this.senha = senha;
        this.salario = salario;
        this.level = level;
    }

    public Usuario() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    public abstract void calculaSalario();
    
    
}
