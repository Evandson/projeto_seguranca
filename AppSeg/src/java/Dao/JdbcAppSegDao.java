/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.ConnectionFactory;

/**
 *
 * @author Evandson
 */
public class JdbcAppSegDao implements AppSegDao {

    public static boolean sessao;

    Connection connection;

    public JdbcAppSegDao() {
        connection = ConnectionFactory.getConnection();
    }

    public JdbcAppSegDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean userLogin(Usuario usuario) {
        try {
            String SQL = "SELECT * FROM usuario WHERE email = ? AND senha = md5(?)";
            PreparedStatement us = (PreparedStatement) connection.prepareStatement(SQL);
            us.setString(1, usuario.getEmail());
            us.setString(2, usuario.getSenha());
            ResultSet rs = us.executeQuery();
            if (!rs.next()) {
                System.out.println("Login Inválido!");
                sessao = false;
            } else {
                System.out.println("Login Válido");
                sessao = true;
            }
        } catch (SQLException e) {
        }
        return sessao;
    }

    @Override
    public Usuario getId(String email, String senha) {
        Usuario u = new Usuario();
        try {
            String SQL = "SELECT id FROM usuario WHERE email=? AND senha=md5(?)";
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(SQL);
            ps.setString(1, email);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u.setId(rs.getInt("id"));
            }
            u.setEmail(email);
            u.setSenha(senha);
            return u;
        } catch (SQLException ex) {
            Logger.getLogger(JdbcAppSegDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha ao pegar Id do Usuário em JDBCInfosaudeDAO");
        }
    }

    @Override
    public void userRegister(Usuario usuario) {
        try {
            String SQL = "INSERT INTO usuario(nome, email, senha) VALUES (?, ?, md5(?))";
            PreparedStatement us = (PreparedStatement) connection.prepareStatement(SQL);

            us.setString(1, usuario.getNome());
            us.setString(2, usuario.getEmail());
            us.setString(3, usuario.getSenha());

            us.executeUpdate();

            us.close();
            connection.close();

        } catch (Exception e) {
        }
    }

    @Override
    public boolean verifyUser(Usuario usuario) {
        try {
            String SQL = "SELECT email FROM usuario WHERE email = ?";
            PreparedStatement us = (PreparedStatement) connection.prepareStatement(SQL);
            us.setString(1, usuario.getEmail());
            ResultSet rs = us.executeQuery();
                if (!rs.next()){
                   System.out.println("Email não encontrado!");
                   userRegister(usuario);
                   sessao = true;
                } else{
                   System.out.println("Email encontrado!");
                   sessao = false;
                }
            } catch (SQLException e) {     
        }
        return sessao;
    } 
}