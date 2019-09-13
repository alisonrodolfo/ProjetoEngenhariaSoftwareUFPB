/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra.DAO;

import business.model.Paciente;
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
public class pacienteDAO {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean inserir(Paciente usuario) {
        String sql = "INSERT INTO usuarios values (default,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCPF());
            stmt.setString(3, usuario.getRG());
            stmt.setString(4, usuario.getSexo());
            stmt.setString(5, usuario.getLogin());
            stmt.setString(6, usuario.getEmail());
            stmt.setString(7, usuario.getSenha());
            stmt.setString(8, usuario.getNascimento().toString());
            stmt.setString(9, usuario.getEndereco());
            stmt.setString(10, usuario.getHistorico());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(pacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean update(Paciente usuario) {
        String sql = "UPDATE usuarios SET nome=?, cpf=?, rg=?, sexo=?, login=?, email=?, senha=?, dataNascimento=?, endereco=?, historico=? WHERE id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCPF());
            stmt.setString(3, usuario.getRG());
            stmt.setString(4, usuario.getSexo());
            stmt.setString(5, usuario.getLogin());
            stmt.setString(6, usuario.getEmail());
            stmt.setString(7, usuario.getSenha());
            stmt.setString(8, usuario.getNascimento().toString());
            stmt.setString(9, usuario.getEndereco());
            stmt.setString(10, usuario.getHistorico());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(pacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean remover(int id) {
        String sql = "DELETE FROM usuarios WHERE id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(pacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Paciente> listar() {
        String sql = "SELECT * FROM usuarios";
        List<Paciente> retorno = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {

                Paciente usuario = new Paciente(Integer.parseInt(resultado.getString("id")), resultado.getString("nome"),
                        resultado.getString("cpf"),
                        resultado.getString("rg"),
                        resultado.getString("sexo"),
                        resultado.getString("login"),
                        resultado.getString("email"),
                        "",
                        LocalDate.parse(resultado.getString("dataNascimento")),
                        resultado.getString("endereco"),
                        resultado.getString("historico"));
                        retorno.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(pacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public Paciente buscar(Paciente usuario) {
        String sql = "SELECT * FROM usuarios WHERE id=?";
        Paciente retorno = null;
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, usuario.getId());
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                retorno = new Paciente(Integer.parseInt(resultado.getString("id")), resultado.getString("nome"),
                        resultado.getString("cpf"),
                        resultado.getString("rg"),
                        resultado.getString("sexo"),
                        resultado.getString("login"),
                        resultado.getString("email"),
                        "",
                        LocalDate.parse(resultado.getString("dataNascimento")),
                        resultado.getString("endereco"),
                        resultado.getString("historico"));
                retorno = usuario;
            }
        } catch (SQLException ex) {
            Logger.getLogger(pacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}
