package backend;
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
        // SQL
        String SQL = "SELECT * FROM local WHERE User_ID = " + UserID + ";";

        try (ResultSet resultado = MySQL.executeSelect(Main.connection, SQL)) 
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

            this.setInstanceArrayLength(_k);
        }   
    }
    
    // Adiciona um novo local
    public void addLocal(String _Nome, String _Dresc, int _UserID) throws Exception
    {
        String SQL = "INSERT INTO local(Nome, Descr, User_ID) VALUES('" + _Nome + "', '" + _Dresc + "'," + _UserID + ");";
        MySQL.executeInsert(Main.connection, SQL);
    }
    
    // Remove um local
    public void removeLocal(int LocalID) throws Exception
    {
        int _LocalID = this.locais[LocalID].getLocalID();
        
        String SQL = "DELETE FROM local WHERE Local_ID =" + _LocalID +";";
        System.out.println(SQL);
        MySQL.executeDelete(Main.connection, SQL);
    }
    
    // Atualiza um local
    public void updateLocal(int LocalID, String Nome, String Desc) throws Exception
    {
        int _LocalID = this.locais[LocalID].getLocalID();
        
        String SQL = "UPDATE local SET ";
        SQL += "Nome = '" + Nome + "', ";
        SQL += "Descr = '" + Desc + "' ";
        SQL += "WHERE Local_ID = " + _LocalID + ";";
        System.out.println(SQL);
        MySQL.executeUpdate(Main.connection, SQL);
    }
    
    // Construtor
    public Local(int UserID) throws Exception
    {
        loadLocalInstances(UserID);
    }
}
