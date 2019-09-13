package business.model;

public class Medico extends Usuario {

    private String Crm;
    private String especialidade;

   

    public String getCrm() {
        return Crm;
    }

    public void setCrm(String Crm) {
        this.Crm = Crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    @Override
    public void calculaSalario(){
        super.salario = 12345;
    }

}
