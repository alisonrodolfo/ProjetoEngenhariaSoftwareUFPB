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
public interface DAOFactoryIF {
    public static Object getDAO(String nome) throws errorMessageException {
        return null;
    }
    
}
