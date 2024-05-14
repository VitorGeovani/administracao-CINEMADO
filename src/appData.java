
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
        conectar = DriverManager.getConnection("jdbc:mysql://localhost:3307/cinema","root","p@$$w0rd");
        
    }
    public  void cadastrarUsuario(String u, String s) throws ClassNotFoundException, SQLException{
        conectar();
        //enviar os dados para o banco
        st = conectar.prepareStatement("INSERT INTO usuarios values(?,?)");
        st.setString(1, u);
        st.setString(2, s);
        st.executeUpdate(); //salva no BD
           
    }
    
    public ResultSet entrar(String u, String s) throws ClassNotFoundException, SQLException{
        conectar();
         // 3 BUSCAR USER E SENHA
         st = conectar.prepareStatement("SELECT * FROM usuarios WHERE email = ? AND senha = ?");
         st.setString(1, s);
         st.setString(2, u);
         resultado = st.executeQuery();
        return resultado;
    }
    
}
