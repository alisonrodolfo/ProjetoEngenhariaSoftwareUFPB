package business.model;

import java.time.LocalDate;


public class Paciente {
    
    private int id;
    private String nome, CPF, RG, sexo, login, email, senha, endereco;
    private LocalDate nascimento;
    private String historico;

    public Paciente(int id, String nome, String CPF, String RG, String sexo, String login, String email, String senha, LocalDate nascimento, String endereco, String historico) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.sexo = sexo;
        this.login = login;
        this.email = email;
        this.senha = senha;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.historico = historico;
    }

    public Paciente() {
        
    }
    
    public Paciente(String CPF) {
        this.CPF = CPF;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nome=" + nome + ", CPF=" + CPF + ", RG=" + RG + ", sexo=" + sexo + ", login=" + login + ", email=" + email + ", senha=" + senha + ", endereco=" + endereco + ", nascimento=" + nascimento + ", historico=" + historico + '}';
    }

    
    
    
  
}
