package business.model;

public class Funcionario extends Usuario {

    @Override
    public void calculaSalario(){
        super.salario = 12345;
    }

}
