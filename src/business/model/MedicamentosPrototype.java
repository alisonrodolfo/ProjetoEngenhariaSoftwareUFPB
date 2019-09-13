/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 *
 * @author aliso
 */
public class MedicamentosPrototype extends LicitacaoPrototype {

    private long codigo;
    private String referencia;
    private double valor;

    protected MedicamentosPrototype(MedicamentosPrototype mp) {
        this.codigo = mp.getCodigo();
        this.referencia = mp.getReferencia();
        this.valor = mp.getValor();
    }

    public MedicamentosPrototype(long codigo, String referencia, double valor) {
        this.codigo = codigo;
        this.referencia = referencia;
        this.valor = valor;
    }

    @Override
    public String exibirInfo() {
        return "Licitação de Medicamentos\n"
                + "Código: " + getCodigo() + " Referencia: " + getReferencia() + "Valor: R$"
                + getValor();
    }

    @Override
    public MedicamentosPrototype clonar() {
        return new MedicamentosPrototype(this);
    }

}
