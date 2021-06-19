package backend;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.MySQL;

public final class Local 
{      
    // <editor-fold defaultstate="collapsed" desc="_Local Class">
    public static class _Local
    {
        // Private Attributes
        private final int LocalID;
        private final String Titulo;
        private final String Dresc;
        private final int UserID;
        
        // Methods
        public int getLocalID()
        {
            return this.LocalID;
        }
        
        public String getTitulo()
        {
            return this.Titulo;
        }
        
        public String getDescricao()
        {
            return this.Dresc;
        }
        
        public int getUserID()
        {
            return this.UserID;
        }
    
        // Constroi uma nova instancia de um local
        public _Local(int _LocalID, String _Titulo, String _Dresc, int _TarefaID)
        {
            this.LocalID = _LocalID;
            this.Titulo = _Titulo;
            this.Dresc = _Dresc;
            this.UserID = _TarefaID;
        }
    }
    // </editor-fold> 
    
    // Contem todas as instancias de todos os locais
    private int ArrayLocaisLength;
    public _Local locais[] = new _Local[50];
    
    // Retorna o tamanho do array de instancias
    public int getInstanceArrayLength()
    {
        return this.ArrayLocaisLength;
    }
    
    public void setInstanceArrayLength(int _Value)
    {
        this.ArrayLocaisLength = _Value;
    }
    
    // Insere no array de instancias
    public void insertInstance(_Local instance, int position)
    {
        if (position <= 50)    
            locais[position] = instance;
        else
            System.out.println("Quantidade Maxima de locais atingidas.");
    }
    
    // Carregar locais
    public void loadLocalInstances(int UserID) throws Exception
    {
        // Iniciar Conexao
        try (Connection conn = MySQL.abrir()) 
        {
            // SQL
            String SQL = "SELECT * FROM local WHERE User_ID = " + UserID + ";";
            
            try (PreparedStatement comando = conn.prepareStatement(SQL); ResultSet resultado = comando.executeQuery()) 
            {   
                int _k = 0;
                while (resultado.next())
                {
                    int LocalID = resultado.getInt("Local_ID"); 
                    String _Nome = resultado.getString("Nome");
                    String _Descr = resultado.getString("Descr");
                    int _UserID = resultado.getInt("User_ID");
                    
                    _Local newLocal = new _Local(LocalID, _Nome, _Descr, _UserID);
                    this.insertInstance(newLocal, _k);
                    _k++;
                }
                
                // Load Components
                this.setInstanceArrayLength(_k);
                
                // Close
                comando.close();
                conn.close();
            }
        } 
    }
    
    // Adiciona um novo local
    public void addLocal(String _Nome, String _Dresc, int _UserID) throws Exception
    {
        try (Connection conn = MySQL.abrir())
        {
            String SQL = "INSERT INTO local(Nome, Descr, User_ID) VALUES('" + _Nome + "', '" + _Dresc + "'," + _UserID + ");";
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
    
    // Remove um local
    public void removeLocal(int LocalID) throws Exception
    {
        int _LocalID = this.locais[LocalID].getLocalID();
        
        try (Connection conn = MySQL.abrir())
        {
            String SQL = "DELETE FROM local WHERE Local_ID =" + _LocalID +";";
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
    
    // Construtor
    public Local(int UserID) throws Exception
    {
        loadLocalInstances(UserID);
    }
}
