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

public class MinhaConexao {
     public static Connection conexao(){
        ConexaoJDBC conexao = new ConexaoMysql();
        return conexao.criarConexao();
    }
}
