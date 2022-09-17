/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Projeto.model.jdbc;

/**
 *
 * @author eduar
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoMysql implements ConexaoJDBC{
    public static void main(String[] args) {

        //testar conexão
        System.out.println(new ConexaoMysql().criarConexao());

    }

    
    @Override
    public Connection criarConexao(){
        try {
            //carregar o driver de conexão
            Class.forName("com.mysql.cj.jdbc.Driver");
            //parâmetros
            String url = "jdbc:mysql://localhost:3306/test?createDatabaseIfNotExist=true";
            String usuario = "root";
            String senha = "123456";
            //retorna a conexão com o banco de dados
            return DriverManager.getConnection(url, usuario, senha);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
