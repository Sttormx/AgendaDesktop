package util;
import java.sql.Connection;
import java.sql.DriverManager;

public class MySQL 
{
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/projeto";

    // Conectar ao banco
    public static Connection abrir() throws Exception 
    {
        // Capturar a conexão
        Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
        // Retorna a conexao aberta
        return conn;
    }
}
