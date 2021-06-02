package backend;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import util.MySQL;

public class Login 
{
    public static int VerificarLogin(String Login, String Password) throws Exception
    {
        // Inicia a Conexao;
        Connection conn = MySQL.abrir();
        
        // SQL
        String SQL = "SELECT User_ID FROM usuario WHERE User = '" + Login + "' AND Senha = '" + Password + "';";
        PreparedStatement comando = conn.prepareStatement(SQL);
        ResultSet resultado = comando.executeQuery();
        
        int k = 0;        
        while (resultado.next())
            k = resultado.getInt("User_ID");
            
        resultado.close();
        comando.close();
        conn.close();
        return k;
    }   
}
