/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra.DAO;

import business.model.Usuario;
import java.sql.Connection;
import java.util.List;


/**
 *
 * @author aliso
 */
public interface DAOusuario {

    public Connection getConnection();

    public void setConnection(Connection connection);

    public boolean inserir(Usuario usuario);

    public boolean update(Usuario usuario);

    public boolean remover(int id);

    public List<Usuario> listar();

    public Usuario buscar(Usuario usuario);
}
