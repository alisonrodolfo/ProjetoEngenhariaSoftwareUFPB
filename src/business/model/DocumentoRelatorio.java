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
public interface DocumentoRelatorio {

    public Object visitar(JSon j);

    public Object visitar(XML x);

    public Object visitar(CSV c);
}
