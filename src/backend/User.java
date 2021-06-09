package backend;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import util.MySQL;

public class User 
{
    // Public Attributes
    public int userID;
    
    // Private Attributes
    private String Login;
    private String Username;
    private String Password;
    private int Template;
    private int _Notify;
    private int admin;
    
    public String getLogin()
    {
        return this.Login;
    }
    
    public void setLogin(String newLogin)
    {
        this.Login = newLogin;
    }
    
    public String getPassword()
    {
        return this.Password;
    }
    
    public void setPassword(String newPassword)
    {
        this.Password = newPassword;
    }
    
    public String getUsername()
    {
        return this.Username;
    }
    
    public void setUsername(String newUsername)
    {
        this.Username = newUsername;
    }

    public int _getNotify()
    {
        return this._Notify;
    }
    
    public void setNotify(int Notify)
    {
        this._Notify = Notify; 
    }
    
    public int getTemplate()
    {
        return this.Template;
    }
    
    public int getTemplateByName(String Template)
    {
        if ("Semanas".equals(Template.intern()))
            return 2;
        
        if ("Meses".equals(Template.intern()))
            return 3;
        
        return 1;
    }

    public String getTemplateByNumber(int Template)
    {
        if (Template == 2)
            return "Semanas";
        
        if (Template == 3)
            return "Meses";
            
        return "Dias";
    }
    
    public void setTemplate(int Template)
    {
        this.Template = Template;
    }
    
    public boolean isAdmin()
    {
        return (this.admin > 0);
    }

    public void setAdmin(int Admin)
    {
        this.admin = Admin;
    }
    
    public void loadUser() throws Exception
    {
        // Iniciar Conexao
        try (Connection conn = MySQL.abrir()) 
        {
            // SQL
            String SQL = "SELECT * FROM usuario WHERE User_ID = " + this.userID + ";";
            try (PreparedStatement comando = conn.prepareStatement(SQL); ResultSet resultado = comando.executeQuery()) 
            {
                while (resultado.next())
                {
                    this.setUsername(resultado.getString("Nome"));
                    this.setLogin(resultado.getString("User"));
                    this.setPassword(resultado.getString("Senha"));
                    this.setNotify(resultado.getInt("Notificacoes"));
                    this.setTemplate(resultado.getInt("Template"));
                    this.setAdmin(resultado.getInt("Administrador"));
                }
                
                // Close
                comando.close();
                conn.close();
            }
        }
    }
    
    public void saveUser() throws Exception
    {
        // Inicia a Conexao;
        try(Connection conn = MySQL.abrir(); Statement stmt = conn.createStatement()) 
        {
            // SQL
            String sql = "UPDATE usuario SET Nome = '" + this.getUsername() + "',";
            sql = sql + " User = '" + this.Login + "',";
            sql = sql + " Senha = '" + this.Password + "',";
            sql = sql + " Notificacoes = " + this._Notify + ",";
            sql = sql + " Template = " + this.Template + ",";
            sql = sql + " Administrador = " + this.admin;
            sql = sql + " WHERE User_ID = " + this.userID + ";";
            System.out.println(sql);
            
            // Execute
            stmt.executeUpdate(sql);
            
            // Close
            stmt.close();
            conn.close();
        }
    }
}
