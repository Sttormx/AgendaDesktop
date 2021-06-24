package backend;
import frontend.Login;
import frontend.TelaMain;
import java.sql.Connection;
import util.MySQL;

public class Main 
{
    // Contem a conexao ao banco de dados
    public static Connection connection;
    
    // Contem a instancia da classe do Usuario
    public static User user;
    
    // Contem a instancia da classe Locais
    public static Local local;
    
    // Contem a instancia da classe Tarefas
    public static Tarefa tarefa;
    
    public static void main(String[] args) throws Exception 
    {
        // Inicializa a conexao ao MySQL.
        connection = MySQL.startConnection();
        
        // Inicializa a tela de Login
        Login login = new Login();
        login.setVisible(true);
    }
    
    // Carrega o sistema por completo
    public static void loadSystem(int UserID) throws Exception
    {
        loadInstances(UserID);
        
        // Load Main Frame
        TelaMain mainFrame = new TelaMain();
        mainFrame.setVisible(true);
    }
    
    // Carrega as principais instancias
    private static void loadInstances(int UserID) throws Exception
    {
        loadUser(UserID);
        loadLocals(UserID);
        loadTarefas(UserID);
    }
    
    // Carrega a instancia da classe User
    private static void loadUser(int UserID) throws Exception
    {
        user = new User(UserID);
    }
    
    // Carrega a instancia da classe Locais
    private static void loadLocals(int UserID) throws Exception
    {
        local = new Local(UserID);
        local.loadLocalInstances(UserID);
    }
    
    // Carrega a instancia da classe Tarefas
    private static void loadTarefas(int UserID) throws Exception
    {
        tarefa = new Tarefa(UserID);
        tarefa.loadTarefasInstances(UserID);
    }
}
