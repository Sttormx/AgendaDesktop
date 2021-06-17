package backend;
import java.sql.Connection;
import java.sql.PreparedStatement;
import util.MySQL;

public class Tarefa 
{
    // <editor-fold defaultstate="collapsed" desc="_Tarefa Class">
    public static final class _Tarefa
    {
        private final int TarefaID;
        private final String Titulo;
        private final String Descr;
        private final java.sql.Date Data;
        private final java.sql.Time Hora;
        private final int UserID;
        private final int LocalID;
        
        public int getTarefaID()
        {
            return this.TarefaID;
        }
        
        public String getTarefaTitulo()
        {
            return this.Titulo;
        }
        
        public String getTarefaDesc()
        {
            return this.Descr;
        }
        
        public java.sql.Date getDataTarefa()
        {
            return this.Data;
        }
        
        public java.sql.Time getHoraTarefa()
        {
            return this.Hora;
        }
        
        public int getTarefaUserID()
        {
            return this.UserID;
        }
        
        public int getTarefaLocalID()
        {
            return this.LocalID;
        }
        
        public _Tarefa(int _TarefaID, String _Titulo, String _Descr, java.sql.Date _Data, java.sql.Time _Hora, int _UserID, int _LocalID)
        {
            this.TarefaID = _TarefaID;
            this.Titulo = _Titulo;
            this.Descr = _Descr;
            this.UserID = _UserID;
            this.LocalID = _LocalID;
            this.Data =_Data;
            this.Hora = _Hora;
        }
    }  
    // </editor-fold>
    
    // Array de instancias
    public _Tarefa tarefas[] = new _Tarefa[50];
    private int ArrayLocaisLength;
    
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
    public void insertInstance(_Tarefa instance, int position)
    {
        if (position <= 50)    
            tarefas[position] = instance;
        else
            System.out.println("Quantidade Maxima de locais atingidas.");
    }   
    
    // Adiciona uma nova tarefa
    public void addTarefa(String _Nome, String _Dresc, String Data, String Horario, int _UserID, int _LocalID) throws Exception
    {
        try (Connection conn = MySQL.abrir())
        {
            String SQL = "INSERT INTO tarefa(Titulo, Descr, Data, Hora, User_ID, Local_ID) VALUES('" + _Nome + "', '" + _Dresc + "', '" + Data + "', '" + Horario + "', " + _UserID + ", " + _LocalID + ");";
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
