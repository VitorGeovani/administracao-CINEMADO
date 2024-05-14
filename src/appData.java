
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema_pi","root","p@$$w0rd");
        
    }
    public void cadastrarUsuario(String u, String s) throws ClassNotFoundException, SQLException{
        conectar();
        // 2 CADASTRAR USUARIO
        st = conectar.prepareStatement("INSERT INTO usuarios(email, senha) VALUES(?,?)");
        st.setString(1, u);
        st.setString(2, s);
        st.executeUpdate();
    }
    
    public ResultSet entrar(String u, String s) throws ClassNotFoundException, SQLException{
        conectar();
        // 1 ENTRAR
        st = conectar.prepareStatement("SELECT * FROM usuarios WHERE email = ? AND senha = ?");
        st.setString(1, u);
        st.setString(2, s);
        resultado = st.executeQuery();
        return resultado;
    }

    public void submeterFilme(String t, String d, String dur, String g, String s, String dt, String c) throws ClassNotFoundException, SQLException{
        conectar();
        // 3 SUBMETER FILME
        st = conectar.prepareStatement("INSERT INTO filmes(titulo, diretor, duracao, genero, sinopse, data_lancamento, classificacao_indicativa) VALUES(?,?,?,?,?,?,?)");
        st.setString(1, t);
        st.setString(2, d);
        st.setString(3, dur);
        st.setString(4, g);
        st.setString(5, s);
        st.setString(6, dt);
        st.setString(7, c);
        st.executeUpdate();
    }

    
    
}
