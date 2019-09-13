/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Controller;

/**
 *
 * @author aliso
 */
public class Relatorio {
    
    private final int quantidadeDePascientes;
    private final int funciocariosTrabalhando;
    private final int funciocariosDeFerias;
 
    public Relatorio(int quantidadeDePascientes, int funciocariosTrabalhando, int funciocariosDeFerias) {
        this.quantidadeDePascientes = quantidadeDePascientes;
        this.funciocariosTrabalhando = funciocariosTrabalhando;
        this.funciocariosDeFerias = funciocariosTrabalhando;
    }
 
    public String getNumPascientes() {
        return "Total de Pascientes: " + quantidadeDePascientes;
    }
 
    public String getNumFTrabalhando() {
        return "Funcionarios trabalhando: " + funciocariosTrabalhando;
    }
    public String getNumFFerias() {
        return "Funcionarios de ferias: " + funciocariosTrabalhando;
    }
    
}
