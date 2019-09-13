/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controll;

import business.Controller.Relatorio;
import business.model.Usuario;

/**
 *
 * @author aliso
 */
public class RelatorioProxy  extends Relatorio{
    
    private final Usuario user;

    public RelatorioProxy(Usuario user, int quantidadeDePascientes, int funciocariosTrabalhando, int funciocariosDeFerias) {
        super(quantidadeDePascientes, funciocariosTrabalhando, funciocariosDeFerias);
        this.user = user;
    }
    
    @Override
    public String getNumPascientes() {
        if(temPermissaoDeAcesso()){
            return super.getNumPascientes();
        }
        return null;
    }
 
    @Override
    public String getNumFTrabalhando() {
        if(temPermissaoDeAcesso()){
            return super.getNumFTrabalhando();
        }
        return null;
    }
    @Override
    public String getNumFFerias() {
        if(temPermissaoDeAcesso()){
            return super.getNumFFerias();
        }
        return null;
    }
    
     private boolean temPermissaoDeAcesso() {
        return user.getLogin().equalsIgnoreCase("admin") && user.getSenha().equalsIgnoreCase("admin12345");
    }
}
