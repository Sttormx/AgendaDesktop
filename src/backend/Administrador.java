package backend;
import java.sql.Connection;
import java.sql.PreparedStatement;
import util.MySQL;

public class Administrador 
{
    
    public void addUser(String Login, String Password, String Username, int Administrador) throws Exception
    {
        try (Connection conn = MySQL.abrir())
        {
            String SQL = "INSERT INTO usuario(User, Senha, Nome, Notificacoes, Template, Administrador) VALUES('" + Login +"', '" + Password +"', '" + Username + "', 1, 1, " + Administrador + ");";
            System.out.println(SQL);
            try(PreparedStatement stmt = conn.prepareStatement(SQL);)
            {
                stmt.execute();
                
                // Close
                stmt.close();
                conn.close();
            }
        }
        
    }
}
