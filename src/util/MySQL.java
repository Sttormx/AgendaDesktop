package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL 
{
    // Configuracoes do Banco de Dados
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String ADDRESS = "127.0.0.1";
    private static final String PORT = "3306";
    private static final String BANCO = "projeto";
    
    // Conectar ao banco
    public static Connection startConnection() throws Exception
    {
        String URL = "jdbc:mysql://" + ADDRESS + ":" + PORT + "/" + BANCO;
        
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        return conn;
    }
    
    // Retorna um select com ResultSet
    public static ResultSet executeSelect(Connection connection, String SQL) throws SQLException
    {
        PreparedStatement comando = connection.prepareStatement(SQL);
        ResultSet result = comando.executeQuery();
        
        return result;
    }
    
    // Executa um insert
    public static void executeInsert(Connection connection, String SQL) throws SQLException
    {
        try(PreparedStatement stmt = connection.prepareStatement(SQL);)
        {
            stmt.execute();
            stmt.close();
        }
    }
    
    // Executa um update
    public static void executeUpdate(Connection connection, String SQL) throws SQLException
    {
        try(Statement stmt = connection.createStatement()) 
        {
            stmt.executeUpdate(SQL);
        }
    }
    
    // Executa um delete
    public static void executeDelete(Connection connection, String SQL) throws SQLException
    {
        executeInsert(connection, SQL);  
    }
}
