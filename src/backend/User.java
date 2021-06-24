package backend;
import java.sql.ResultSet;
import util.MySQL;

public final class User 
{
    // Public Attributes
    public int userID;
    
    // Private Attributes
    private String Login;
    private String Username;
    private String Password;
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
        // SQL
        String SQL = "SELECT * FROM usuario WHERE User_ID = " + this.userID + ";";
        try (ResultSet resultado = MySQL.executeSelect(Main.connection, SQL)) 
        {
            while (resultado.next())
            {
                this.setUsername(resultado.getString("Nome"));
                this.setLogin(resultado.getString("User"));
                this.setPassword(resultado.getString("Senha"));
                this.setNotify(resultado.getInt("Notificacoes"));
                this.setAdmin(resultado.getInt("Administrador"));
            }
        }
    }
    
    public void saveUser() throws Exception
    {
        // SQL
        String sql = "UPDATE usuario SET Nome = '" + this.getUsername() + "',";
        sql = sql + " User = '" + this.Login + "',";
        sql = sql + " Senha = '" + this.Password + "',";
        sql = sql + " Notificacoes = " + this._Notify + ",";
        sql = sql + " Administrador = " + this.admin;
        sql = sql + " WHERE User_ID = " + this.userID + ";";
        System.out.println(sql);

        // Execute
        MySQL.executeUpdate(Main.connection, sql);
    }
    
    public User(int _UserID) throws Exception
    {
        this.userID = _UserID;
        this.loadUser();
    }
}
