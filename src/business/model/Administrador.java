package business.model;

public class Administrador extends Usuario {

    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void calculaSalario(){
        super.salario = 12345;
    }

}
