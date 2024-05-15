
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

    // public ResultSet listarFilmes(String genero) throws ClassNotFoundException, SQLException{
    //     conectar();
    //     // 4 LISTAR FILMES
    //     if(genero.equals("Todos")){
    //         st = conectar.prepareStatement("SELECT * FROM filmes");
    //     }else{
    //         st = conectar.prepareStatement("SELECT * FROM filmes WHERE genero = ?");
    //         st.setString(1, genero);
    //     }
    //     return st.executeQuery();
    // }

    public ResultSet listarFilmes(String genero) throws ClassNotFoundException, SQLException {
    conectar();
    if (genero.equals("Todos")) {
        st = conectar.prepareStatement("SELECT f.*, fa.cinematografia, fa.originalidade, fa.comentario_tecnico " + "FROM filmes f LEFT JOIN filmes_avaliacao fa ON f.id_filme = fa.fk_id_filme");
    } else {
        st = conectar.prepareStatement("SELECT f.*, fa.cinematografia, fa.originalidade, fa.comentario_tecnico " + "FROM filmes f LEFT JOIN filmes_avaliacao fa ON f.id_filme = fa.fk_id_filme " + "WHERE f.genero = ?");
        st.setString(1, genero);
    }
    return st.executeQuery();
}


    // Método para buscar os detalhes de um filme com base no ID fornecido
    public ResultSet avaliarFilme(int id) throws ClassNotFoundException, SQLException {
        conectar();
        // Consulta para selecionar o filme com base no ID
        st = conectar.prepareStatement("SELECT * FROM filmes WHERE id_filme = ?");
        st.setInt(1, id);
        return st.executeQuery();
    }

    // Método para submeter a avaliação de um filme
    public void submeterAvaliacao(int id, String c, String o, String ct) throws ClassNotFoundException, SQLException {
        conectar();
        // Inserção dos dados da avaliação no banco de dados
        st = conectar.prepareStatement("INSERT INTO filmes_avaliacao(fk_id_filme, cinematografia, originalidade, comentario_tecnico) VALUES(?,?,?,?)");
        st.setInt(1, id);
        st.setString(2, c);
        st.setString(3, o);
        st.setString(4, ct);
        st.executeUpdate();
    }
}