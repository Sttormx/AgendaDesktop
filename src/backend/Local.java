package backend;
import util.MySQL;

public class Local 
{      
    public static class _Local
    {
        // Private Attributes
        private int LocalID;
        private String Titulo;
        private String Dresc;
        private int TarefaID;
        
        // Methods
        public int getLocalID()
        {
            return this.LocalID;
        }
        
        public String getTitulo()
        {
            return this.Titulo;
        }
    }
    
    // Contem todas as instancias de todos os locais
    public _Local locais[] = new _Local[10];
    
    public Local()
    {
        
    }
    
    // Constroi uma nova instancia de um local
    public void cLocal(int _LocalID, String _Titulo, String _Dresc, int _TarefaID)
    {
        _Local L = new _Local();
        L.LocalID = _LocalID;
        L.Titulo = _Titulo;
        L.Dresc = _Dresc;
        L.TarefaID = _TarefaID;

        insertLocalInstance(L);
    }
    
    // Insere no array de instancias
    public void insertLocalInstance(_Local instance)
    {
        locais[1] = instance;
    }
}
