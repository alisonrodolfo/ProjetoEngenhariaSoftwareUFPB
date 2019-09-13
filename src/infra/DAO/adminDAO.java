/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra.DAO;

import business.model.Administrador;
import business.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aliso
 */
public class adminDAO implements DAOusuario{

    private Connection connection;

    public Connection getConnection()  {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean inserir(Usuario usuario) {
        String sql = "INSERT INTO admins values (default,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(adminDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean update(Usuario usuario) {
        String sql = "UPDATE admins SET nome=?, login=?, senha=? WHERE id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(adminDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean remover(int id) {
        String sql = "DELETE FROM admins WHERE id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(adminDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Usuario> listar() {
        String sql = "SELECT * FROM admins";
        List<Usuario> retorno = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {

                /*Administrador admin = new Administrador(Integer.parseInt(resultado.getString("id")), resultado.getString("nome"),
                        resultado.getString("login"),
                        "");*/
                        //retorno.add(admin);
            }
        } catch (SQLException ex) {
            Logger.getLogger(adminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public Usuario buscar(Usuario admin) {
        String sql = "SELECT * FROM admin WHERE login=?";
        Usuario retorno = null;
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, admin.getLogin());
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                /*retorno = new Administrador(Integer.parseInt(resultado.getString("id")), resultado.getString("nome"),
                        resultado.getString("login"),
                        "");*/
                retorno = admin;
            }
        } catch (SQLException ex) {
            Logger.getLogger(adminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }


}
