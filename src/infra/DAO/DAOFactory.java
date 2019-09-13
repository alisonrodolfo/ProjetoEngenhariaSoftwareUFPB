/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra.DAO;

import infra.errorMessageException;

/**
 *
 * @author aliso
 */
public class DAOFactory implements DAOFactoryIF{
    
    public static Object getDatabase(String op) throws errorMessageException{
        switch (op) {
            case "adminDAO":
                return new adminDAO();
            case "usuariosDAO":
                return new usuariosDAO();       
            default:
                return null;
        }
    }
    
   
}
