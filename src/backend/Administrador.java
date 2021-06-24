package backend;
import util.MySQL;

public class Administrador 
{
    
    public void addUser(String Login, String Password, String Username, int Administrador) throws Exception
    {
        String SQL = "INSERT INTO usuario(User, Senha, Nome, Notificacoes, Template, Administrador) VALUES('" + Login +"', '" + Password +"', '" + Username + "', 1, 1, " + Administrador + ");";
        System.out.println(SQL);
        MySQL.executeInsert(Main.connection, SQL);
    }
}
