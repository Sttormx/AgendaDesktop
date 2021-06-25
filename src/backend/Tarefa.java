package backend;
import java.sql.ResultSet;
import util.MySQL;

public final class Tarefa 
{
    // <editor-fold defaultstate="collapsed" desc="_Tarefa Class">
    public static final class _Tarefa
    {
        private final int TarefaID;
        private final String Titulo;
        private final String Descr;
        private final java.sql.Date Data;
        private final java.sql.Time Hora;
        private final int HoraInt;
        private final int MinutosInt;
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
        
        public int getHoraInt()
        {
            return this.HoraInt;
        }
        
        public int getMinutosInt()
        {
            return this.MinutosInt;
        }
        
        public int getTarefaUserID()
        {
            return this.UserID;
        }
        
        public int getTarefaLocalID()
        {
            return this.LocalID;
        }
        
        public _Tarefa(int _TarefaID, String _Titulo, String _Descr, java.sql.Date _Data, java.sql.Time _Hora, int _UserID, int _LocalID, int _HoraInt, int _MinutosInt)
        {
            this.TarefaID = _TarefaID;
            this.Titulo = _Titulo;
            this.Descr = _Descr;
            this.UserID = _UserID;
            this.LocalID = _LocalID;
            this.Data =_Data;
            this.Hora = _Hora;
            this.HoraInt = _HoraInt;
            this.MinutosInt = _MinutosInt;
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
    
    // Carrega todas as tarefas
    public void loadTarefasInstances(int UserID) throws Exception
    {
        // SQL
        String SQL = "SELECT * FROM tarefa WHERE User_ID = " + UserID + ";";

        try (ResultSet resultado = MySQL.executeSelect(Main.connection, SQL)) 
        {   
            int _k = 0;
            while (resultado.next())
            {
                int _TarefaID = resultado.getInt("Tarefa_ID");
                String _Titulo = resultado.getString("Titulo"); 
                String _Descr = resultado.getString("Descr");
                java.sql.Date _Data = resultado.getDate("Data"); 
                java.sql.Time _Time = resultado.getTime("Hora");
                int _UserID = resultado.getInt("User_ID");
                int _LocalID = resultado.getInt("Local_ID");
                
                String _HoraInt = _Time.toString().split(":")[0];
                String _MinutosInt = _Time.toString().split(":")[1];
                System.out.println(_HoraInt);
                System.out.println(_MinutosInt);
                
                _Tarefa newTarefa = new _Tarefa(_TarefaID, _Titulo, _Descr, _Data, _Time, _UserID, _LocalID, Integer.parseInt(_HoraInt), Integer.parseInt(_MinutosInt));
                this.insertInstance(newTarefa, _k);
                _k++;
            }
            this.setInstanceArrayLength(_k);
        } 
    }
    
    // Adiciona uma nova tarefa
    public void addTarefa(String _Nome, String _Dresc, String Data, String Horario, int _UserID, int _LocalID) throws Exception
    {
        String SQL = "INSERT INTO tarefa(Titulo, Descr, Data, Hora, User_ID, Local_ID) VALUES('" + _Nome + "', '" + _Dresc + "', '" + Data + "', '" + Horario + "', " + _UserID + ", " + _LocalID + ");";
        System.out.println(SQL);
        MySQL.executeInsert(Main.connection, SQL);
    }
    
    // Remove uma Tarefa
    public void removeTarefa(int TarefaID) throws Exception
    {
        int _TarefaID = this.tarefas[TarefaID].getTarefaID();
        
        String SQL = "DELETE FROM tarefa WHERE Tarefa_ID =" + _TarefaID +";";
        System.out.println(SQL);
        MySQL.executeDelete(Main.connection, SQL);
    }
    
    // Update Tarefa
    public void updateTarefa(int TarefaID, String Titulo, String Desc, String Data, String Horario, int _LocalID) throws Exception
    {
        String SQL = "UPDATE tarefa SET ";
        SQL += "Titulo = '" + Titulo + "', ";
        SQL += "Descr = '" + Desc + "', ";
        SQL += "Data = '" + Data + "', ";
        SQL += "Hora = '" + Horario + "', ";
        SQL += "Local_ID = " + _LocalID + " "; 
        SQL += "WHERE Tarefa_ID = " + TarefaID + ";";
    
        System.out.println(SQL);
        MySQL.executeUpdate(Main.connection, SQL);
    }
    
    // Construtor
    public Tarefa(int UserID) throws Exception
    {
        this.loadTarefasInstances(UserID);
    }
}
