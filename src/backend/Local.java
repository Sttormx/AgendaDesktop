package backend;
import util.MySQL;

public class Local 
{      
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
}
