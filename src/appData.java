
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabrielle.ddutra
 */
public class appData {
    Connection conectar;
    PreparedStatement st;
    ResultSet resultado;
    
    private void conectar() throws ClassNotFoundException, SQLException{
        // conecção com BD
        Class.forName("com.mysql.cj.jdbc.Driver");
        conectar = DriverManager.getConnection("jdbc:mysql://localhost:3307/cinema","root","p@$$w0rd");
        
    }
    public  void cadastrarUsuario(String u, String s) throws ClassNotFoundException, SQLException{
        conectar();
        //enviar os dados para o banco
        st = conectar.prepareStatement("INSERT INTO usuarios(email, senha) VALUES(?,?)");
        st.setString(1, u);
        st.setString(2, s);
        st.executeUpdate();
    }
    
    public ResultSet entrar(String u, String s) throws ClassNotFoundException, SQLException{
        conectar();
        // 3 BUSCAR USER E SENHA
        st = conectar.prepareStatement("SELECT * FROM usuarios WHERE email = ? AND senha = ?");
        st.setString(1, u);
        st.setString(2, s);
        resultado = st.executeQuery();
        return resultado;
    }
    public void cadastrarFilme(String titulo, String diretor, String duracao, String genero, String sinopse, String data_lancamento, String classificacao_indicativa) {
        try {
            conectar();
            st = conectar.prepareStatement("INSERT INTO filmes(titulo, diretor, duracao, genero, sinopse, data_lancamento, classificacao_indicativa) VALUES(?,?,?,?,?,?,?)");
            st.setString(1, titulo);
            st.setString(2, diretor);
            st.setString(3, duracao);
            st.setString(4, genero);
            st.setString(5, sinopse);
            st.setString(6, data_lancamento);
            st.setString(7, classificacao_indicativa);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso!");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar filme: " + e);
        }
    }
    public void avaliarFilme(String titulo, String diretor, String duracao, String genero, String data_lancamento, String classificacao_indicativa, String cinematografia, String originalidade, String comentario) {
        // Receber os dados de um filme cadastro e inserir apenas Cinematografia, Originalidade e Comentário
        
        try {
            conectar();
            st = conectar.prepareStatement("INSERT INTO avaliacoes(titulo, diretor, duracao, genero, data_lancamento, classificacao_indicativa, cinematografia, originalidade, comentario) VALUES(?,?,?,?,?,?,?,?,?)");
            st.setString(1, titulo);
            st.setString(2, diretor);
            st.setString(3, duracao);
            st.setString(4, genero);
            st.setString(5, data_lancamento);
            st.setString(6, classificacao_indicativa);
            st.setString(7, cinematografia);
            st.setString(8, originalidade);
            st.setString(9, comentario);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Avaliação cadastrada com sucesso!");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar avaliação: " + e);
        }
    }

    
    
}
